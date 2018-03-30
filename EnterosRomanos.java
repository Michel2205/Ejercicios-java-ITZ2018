package modelo;

import java.util.Scanner;

public class EnterosRomanos {
	static boolean salir = false;
	
	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner (System.in); 
		String entradaNumero;
		do {
			try{
				System.out.println("****NUMEROS ENTEROS A NUMEROS ROMANOS****");
				System.out.println ("Introduzca un número entero positivo(1-1000):");
				entradaNumero = entradaEscaner.nextLine();
				System.out.println(romanoConvertido(Integer.parseInt(entradaNumero)));
			}catch(NumberFormatException e){
                System.out.println("Ingrese solo números\n");
			}
		} while (salir == false);
	}
	
	public static String convierte(int entrada){
		String romano = "";
		int c, d, u;
		
		if (entrada == 1000){
			romano += "M";
		}else{
			c = entrada/100;
			if (c == 9){
				romano += "CM";
			}else if (c >= 5) {
				romano += "D";
				for (int i = 5; i < c; i++) {
					romano += "C";
				}
			}else if (c == 4) {
				romano += "CD";
			} else if (c <= 3) {
				for (int i = 0; i < c; i++) {
					romano += "C";
				}
			}
			
			d = entrada/10%10;
			if (d == 9){
				romano += "XC";
			}else if (d >= 5) {
				romano += "L";
				for (int i = 5; i < d; i++) {
					romano += "X";
				}
			}else if (d == 4) {
				romano += "XL";
			}else if (d <= 3) {
				for (int i = 0; i < d; i++) {
					romano += "X";
				}
			}
			
			u = entrada%10;
			if (u == 9) {
				romano += "IX";
			}else if (u >= 5) {
				romano += "V";
				for (int i = 5; i < u; i++) {
					romano += "I";
				}
			}else if (u == 4) {
				romano += "IV";
			}else if (u <= 3) {
				for (int i = 0; i < u; i++) {
					romano += "I";
				}
			}
		}
		return romano;
	}
	
	public static String romanoConvertido(int num){
		String getRomano = "";
		String tam = num+"";
		
		if (tam.length() <= 4 && num <= 1000  && num > 0) {
			getRomano = "El numero "+num+" en romano es: "+convierte(num)+"\n";
		}else{
			System.err.println("Número fuera de rango, no valido");
			salir = true;
		}
		return getRomano;
	}

}
