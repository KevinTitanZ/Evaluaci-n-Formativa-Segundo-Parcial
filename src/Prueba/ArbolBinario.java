package Prueba;


public class ArbolBinario {

	public Nodo raiz;

	public ArbolBinario() {

		this.raiz = null;
	}
	//tamaño
	public int tamano(Nodo nodo) {
		if (nodo ==null) {
			return 0;
		}
		int tamanoIzdo = tamano(nodo.subarbolIzdo());
		int tamanoDcho= tamano(nodo.subarbolDcho());

		return 1 + tamanoIzdo + tamanoDcho;
	}
	public int imprimirtamano () {
		return tamano(raiz);
	}
	public boolean vacio() {
		return raiz ==null;
	}
	public Nodo obtRaiz() {

		return raiz;
	}
	public Nodo obtenerRamaIzdo() {
		if(raiz != null) {
			return raiz.subarbolDcho();
		}
		return null;
	}
	//Recorrido en orden
	public void imprimirInOrdenRecursivo(Nodo nodo) {
		if (nodo != null) {
			imprimirInOrdenRecursivo(nodo.subarbolIzdo());
			nodo.visitar();
			imprimirInOrdenRecursivo(nodo.subarbolDcho());
		}
	}	
	//Recorrido pre orden
	public void preOrden(Nodo nodo) {
		if (nodo != null) {
			nodo.visitar();
			preOrden(nodo.subarbolIzdo());
			preOrden(nodo.subarbolDcho());
		}
	}
	//Recorrido post orden
	public void postOrden(Nodo nodo) {
		if (nodo != null) {
			postOrden(nodo.subarbolIzdo());
			postOrden(nodo.subarbolDcho());
			nodo.visitar();
		}
	}
	//IMPRESION
	public void imprimirInOrden() {
		imprimirInOrdenRecursivo(raiz);}

	public void imprimirPostOrden() {
		postOrden(raiz);}

	public void imprimirPreOrden() {

		preOrden(raiz);}


	// Método para insertar un dato en el árbol
	private Nodo insertar(Nodo nodo, Object dato) {
		if (nodo == null) {
			return new Nodo(dato);
		}

		if (nodo.subarbolIzdo() == null) {
			nodo.ramaIzdo(nodo.subarbolIzdo()); 
		} else {
			nodo.ramaDcho(insertar(nodo.subarbolDcho(), dato));
		}

		return nodo;
	}
	public void insertar(Object dato) {
		raiz = insertar(raiz, dato);
	}

	//SUMAR NODOS
	public int sumaNodos(Nodo nodo) {
		if (nodo == null) {
			return 0;
		}
		
		int suma =(int)nodo.valorNodo();

		// Se suman los valores de los subárboles izquierdo y derecho
		suma += sumaNodos(nodo.subarbolIzdo());
		suma += sumaNodos(nodo.subarbolDcho());

		return suma;
	}

	// Método público para imprimir la suma de los nodos del árbol
	public int imprimirSuma() {
		// Se llama al método sumaNodos pasando la raíz del árbol como punto de partida
		return sumaNodos(raiz);
	}
}

