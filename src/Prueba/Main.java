package Prueba;
import java.util.Scanner;
public class Main {
	public static void main (String[]args ) {
		ArbolBinario infor = new ArbolBinario();
		Scanner leer = new Scanner(System.in);
		int opcion;
	
		do {
			System.out.println("---MENU---");
			System.out.println("1- INSERTAR");
			System.out.println("2- PREORDEN");
			System.out.println("3- POSTORDEN");
			System.out.println("4- INORDEN");
			System.out.println("5- SUMA NODOS");
			System.out.println("6- TAMAÑO ARBOL");
			System.out.println("7- SALIR");
			System.out.println("Ingrese la Opcion que desee");

			opcion = leer.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("INGRESE EL NODO");
				int dato = leer.nextInt();
				
				infor.insertar(dato);
				break;

			case 2:
				System.out.println("RECORRIDO PREORDEN");
				infor.imprimirPreOrden();

				break;
			case 3:
				System.out.println("RECORRIDO POSTORDEN");
				infor.imprimirPostOrden();
				break;
			case 4:
				System.out.println("RECORRIDO INORDEN");
				infor.imprimirInOrden();
				break;
			case 5:
				System.out.println("SUMANDO NODOS");
				System.out.println("**LA SUMA ES->" + infor.imprimirSuma());
				break;
			case 6:
				System.out.println("MOSTRAR CANTIDAD DE NODOS DE ARBOL");
				System.out.println("La cantidad del nodo es->" + infor.imprimirtamano());
				
				break;
			
			case 7 :
				leer.close();
				break;			
				default:
					System.out.println("PON UNA OPCION VALIDA");
			}

		}while(opcion != 7);
	}
	
	
}
