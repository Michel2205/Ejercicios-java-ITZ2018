package modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextoMorseConsola {
	static Scanner entradaEscaner = new Scanner (System.in); 

	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in); 
		String entradaTeclado = "";
		boolean salir = false;
		int opcion;
		
		while (!salir) {
            System.out.println("1. Texto a Morse");
            System.out.println("2. Morse a Texto");
            System.out.println("3. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                    	System.out.println ("*****Texto-Morse*****");
                	    System.out.println ("Introduzca el texto a traducir (A-Z ó a-z y 0-9):");
                	    entradaTeclado = entradaEscaner.nextLine ();
                		System.out.println(morseConvertido(entradaTeclado));
                		System.out.println("\n");
                        break;
                    case 2:
                		System.out.println ("*****Morse-Texto*****");
                	    System.out.println ("Introduzca el codigo a traducir (. ó -):");
                	    entradaTeclado = entradaEscaner.nextLine ();
                		System.out.println(textoConvertido(entradaTeclado));
                		System.out.println("\n");
                        break;
                    case 3:
                    	salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
		
	}
	
	public static String convierteMorse(String txt){
		String morse = "";
		if (txt.equalsIgnoreCase("a")) 
			morse += ".-";
		if (txt.equalsIgnoreCase("b")) 
			morse += "-...";
		if (txt.equalsIgnoreCase("c"))
			morse += "-.-.";
		if (txt.equalsIgnoreCase("d"))
			morse += "-..";
		if (txt.equalsIgnoreCase("e"))
			morse += ".";
		if (txt.equalsIgnoreCase("f"))
			morse += "..-.";
		if (txt.equalsIgnoreCase("g"))
			morse += "--.";
		if (txt.equalsIgnoreCase("h"))
			morse += "....";
		if (txt.equalsIgnoreCase("i"))
			morse += "..";
		if (txt.equalsIgnoreCase("j"))
			morse += ".---";
		if (txt.equalsIgnoreCase("k"))
			morse += "-.-";		
		if (txt.equalsIgnoreCase("l"))
			morse += ".-..";
		if (txt.equalsIgnoreCase("m"))
			morse += "--";		
		if (txt.equalsIgnoreCase("n"))
			morse += "-.";		
		if (txt.equalsIgnoreCase("o"))
			morse += "---";
		if (txt.equalsIgnoreCase("p"))
			morse += ".--.";
		if (txt.equalsIgnoreCase("q"))
			morse += "--.-";
		if (txt.equalsIgnoreCase("r"))
			morse += ".-.";
		if (txt.equalsIgnoreCase("s"))
			morse += "...";	
		if (txt.equalsIgnoreCase("t"))
			morse += "-";
		if (txt.equalsIgnoreCase("u"))
			morse += "..-";
		if (txt.equalsIgnoreCase("v"))
			morse += "...-";			
		if (txt.equalsIgnoreCase("w"))
			morse += ".--";	
		if (txt.equalsIgnoreCase("x"))
			morse += "-..-";			
		if (txt.equalsIgnoreCase("y"))
			morse += "-.--";				
		if (txt.equalsIgnoreCase("z"))
			morse += "--..";
		if(txt.equals("1"))
			morse += ".----";
		if(txt.equals("2"))
			morse += "..---";
		if(txt.equals("3"))
			morse += "...--";
		if(txt.equals("4"))
			morse += "....-";
		if(txt.equals("5"))
			morse += ".....";
		if(txt.equals("6"))
			morse += "-....";
		if(txt.equals("7"))
			morse += "--...";
		if(txt.equals("8"))
			morse += "---..";
		if(txt.equals("9"))
			morse += "----.";
		if(txt.equals("0"))
			morse += "-----";
		if(txt.equals(" "))
			morse += "  ";
		
		return morse;
	}
	
	public static String morseConvertido(String texto){
		String expresion = "";
		String getMorse = "";
		
		for (int i = 0; i < texto.length(); i++) {
			expresion = texto.charAt(i)+"";
			if (expresion.matches("[a-zA-Z_0-9]")) {
				getMorse += convierteMorse(expresion)+" ";
			}else{
				System.out.println("Error: Caracter no valido "+expresion);
			}
		}
		return getMorse;
	}
	
	public static String convierteTexto(String codigo){
		String cadena = "";
		if(codigo.equals(".-")) 
			cadena += "A";
		if(codigo.equals("-..."))
			cadena += "B";
		if(codigo.equals("-.-."))
			cadena += "C";
		if(codigo.equals("-.."))
			cadena += "D";
		if(codigo.equals("."))
			cadena += "E";
		if(codigo.equals("..-."))
			cadena += "F";
		if(codigo.equals("--."))
			cadena += "G";
		if(codigo.equals("...."))
			cadena += "H";
		if(codigo.equals(".."))
			cadena += "I";
		if(codigo.equals(".---"))
			cadena += "J";
		if(codigo.equals("-.-")) 
			cadena += "K";
		if(codigo.equals(".-.."))
			cadena += "L";
		if(codigo.equals("--"))
			cadena += "M";
		if(codigo.equals("-."))
			cadena += "N";
		if(codigo.equals("---"))
			cadena += "O";
		if(codigo.equals(".--."))
			cadena += "P";
		if(codigo.equals("--.-"))
			cadena += "Q";
		if(codigo.equals(".-."))
			cadena += "R";
		if(codigo.equals("..."))
			cadena += "S";
		if(codigo.equals("-"))
			cadena += "T";
		if(codigo.equals("..-"))
			cadena += "U";
		if(codigo.equals("...-"))
			cadena += "V";
		if(codigo.equals(".--"))
			cadena += "W";
		if(codigo.equals("-.--"))
			cadena += "X";
		if(codigo.equals("-.--"))
			cadena += "Y";
		if(codigo.equals("--.."))
			cadena += "Z";
		if(codigo.equals(".----"))
			cadena += "1";
		if(codigo.equals("..---"))
			cadena += "2";
		if(codigo.equals("...--"))
			cadena += "3";
		if(codigo.equals("....-"))
			cadena += "4";
		if(codigo.equals("....."))
			cadena += "5";
		if(codigo.equals("-...."))
			cadena += "6";
		if(codigo.equals("--..."))
			cadena += "7";
		if(codigo.equals("---.."))
			cadena += "8";
		if(codigo.equals("----."))
			cadena += "9";
		if(codigo.equals("-----"))
			cadena += "0";
		return cadena;
	}
	
	public static String textoConvertido(String expresion){
		String cadena = "";
		String getCadena = "";
		
		String[] entradaMorseTot = expresion.toString().split("    ");
		for (int i = 0; i < entradaMorseTot.length; i++){;
			String[] entradaMorse = entradaMorseTot[i].toString().split(" ");	
			for (int j = 0; j < entradaMorse.length; j++) {
				cadena = entradaMorse[j];
				getCadena += convierteTexto(cadena);
			}
			getCadena += " ";
		}
		return getCadena;
	}

}
