package reto2;

import java.util.Scanner;

public class Funciones2 {

public static void main(String[] args) {
	MenuTemperatura();
	
}
	
	public static void MenuTemperatura() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		 do {
		        System.out.println("Selecciona la conversión de temperatura");
		        System.out.println("1. De Celsius a Fahrenheit");
		        System.out.println("2. De Fahrenheit a Celsius");
		        System.out.println("0. Salir");

		        opcion = sc.nextInt();

		        switch (opcion) {
		            case 1:
		                System.out.print("Introduce la temperatura Celsius: ");
		                double c = sc.nextDouble();
		                double fahrenheit = (c * 1.8) + 32;
		                System.out.println("El resultado es: " + fahrenheit + " °F");
		                break;

		            case 2:
		                System.out.print("Introduce la temperatura Fahrenheit: ");
		                double f = sc.nextDouble();
		                double celsius = (f - 32) / 1.8;
		                System.out.println("El resultado es: " + celsius + " °C");
		                break;

		            case 0:
		                System.out.println("Volver al menú principal");
		                break;

		            default:
		                System.out.println("Opción no válida. Inténtalo de nuevo.");
		                break;
		        }
		    } while (opcion != 0 && opcion != 1 && opcion != 2);
		 
		}
	public static void menuVolumen() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
	        System.out.println("Selecciona la conversión de Volumen");
	        System.out.println("1. De Litros a Galones");
	        System.out.println("2. De Galones a Litros");
	        System.out.println("0. Salir");

	        opcion = sc.nextInt();

	        switch (opcion) {
	            case 1:
	                System.out.print("Introduce el volumen en Litros: ");
	                double l = sc.nextDouble();
	                double litros = l * 0.2642;
	                System.out.println("El resultado es: " + litros);
	                break;

	            case 2:
	                System.out.print("Introduce el volumen en galones: ");
	                double g = sc.nextDouble();
	                double galones = g * 4.546;
	                System.out.println("El resultado es: " + galones);
	                break;

	            case 0:
	                System.out.println("Volver al menú principal");
	                break;

	            default:
	                System.out.println("Opción no válida. Inténtalo de nuevo.");
	                break;
	        }
	    } while (opcion != 0 && opcion != 1 && opcion != 2);
	}
}

	
