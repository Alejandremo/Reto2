package reto2;

import java.util.Scanner;

import reto2.Funciones1;
import reto2.Funciones2;

public class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String opcionString="";
		int opcion = 9;
		int resultado = 0;
		boolean resultadoBool = false;
		
		
		do {
			resultado = 0;
			
			System.out.println("Elige la operación:");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			
			 opcionString=sc.nextLine();
			
			if(opcionString.length()==1 && Character.isDigit(opcionString.charAt(0)) ) {
				opcion = Integer.parseInt(opcionString);
			}
			else {
				opcion = 9;
			}
			
			if (opcion == 0) {
				System.out.println("Fin del programa");
				}
			else if (opcion<0||opcion>4){
				System.out.println("Orden no válida");
			}
			
			switch (opcion) {
			case 1:
				reto2.Funciones1.longitud();
				break;
			case 2:
				reto2.Funciones1.peso();
				
				break;
			case 3:
				reto2.Funciones2.menuVolumen();
				
				break;
			case 4:
				reto2.Funciones2.MenuTemperatura();
				
				break;
	
			default:
				break;
				
				}
			} while (opcion !=0);
		}
	}


