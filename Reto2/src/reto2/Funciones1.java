package reto2;

import java.util.Scanner;

public class Funciones1 {
	
	public static void main(String[] args) {
		longitud();
	}
	

	public static void longitud() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la longitud");
		
		double n = Double.parseDouble(sc.nextLine()) ;
		
		int opcion = 9;
		
		do {
			System.out.println("Selecciona la conversión de longitud:");
			System.out.println("1. Millas a Kilómetros");
			System.out.println("2. Kilómetros a Millas ");
			System.out.println("0. Salir");
			
			String opcionString = sc.nextLine();
			opcion = 9;
			double resultado = 0;

			if(opcionString.length()==1 && Character.isDigit(opcionString.charAt(0))){
				opcion = Integer.parseInt(opcionString);
				switch (opcion) {
				case 1:
					resultado = n*1.60934;
					System.out.println(n + " Millas son "+resultado+" Km");
					break;
				case 2:
					resultado = n/1.60934;
					System.out.println(n + " Km son "+resultado+" Millas");
					break;
				case 0:
					System.out.println("Vuelta al menú principal");
					break;
				default:
					break;
				}
				
			}
			else {
				System.out.println("Opción no válida");
			}
			
		} while (opcion!=0 && opcion!=1 && opcion!=2);
		
	}
	
	public static void peso() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor del peso");
		
		double n = Double.parseDouble(sc.nextLine()) ;
		
		int opcion = 9;
		
		do {
			System.out.println("Selecciona la conversión de peso:");
			System.out.println("1. Libras a Kilogramos");
			System.out.println("2. Kilogramos a Libras ");
			System.out.println("0. Salir");
			
			String opcionString = sc.nextLine();
			opcion = 9;
			double resultado = 0;

			if(opcionString.length()==1 && Character.isDigit(opcionString.charAt(0))){
				opcion = Integer.parseInt(opcionString);
				switch (opcion) {
				case 1:
					resultado = n*0.453592;
					System.out.println(n + " Libras son "+resultado+" Kg");
					break;
				case 2:
					resultado = n/0.453592;
					System.out.println(n + " Kg son "+resultado+" Libras");
					break;
				case 0:
					System.out.println("Vuelta al menú principal");
					break;
				default:
					break;
				}
			}
			else {
				System.out.println("Opción no válida");
			}
			
		} while (opcion!=0 && opcion!=1 && opcion!=2);
	}

}
