package modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Cubo cubo = new Cubo();
		Scanner medida = new Scanner(System.in);
		Scanner op = new Scanner(System.in);
		float lado = 0;
		boolean salir = false, cancelar = false;
		int opcionM = 0, opcionC = 0;
		
		while (!salir) {
			System.out.println("Ingresa la medida del lado:");
			lado = Float.parseFloat(medida.nextLine());
			do {
				if (cancelar == true){
					System.out.println("Ingresa la medida del lado:");
					lado = Float.parseFloat(medida.nextLine());
					cancelar = false;
				}	
				System.out.println("*****MENÚ PRINCIPAL*****\n1) CALCULOS DEL CUADRADO\n2) CALCULOS DEL CUBO\n3) CANCELAR\n4) SALIR\n");
				System.out.println("La medida del lado es: "+lado);
				try {
	                System.out.println("Escribe una de las opciones del menu principal.....");
	                opcionM = op.nextInt();
	                switch (opcionM) {
	                    case 1:
	                    	do {
	                    		System.out.println("\n--CALCULOS DEL CUADRADO--\n1. Area del Cuadrado\n2. Perimetro del Cuadrado\n3. Regresar al menú principal");
	                        	try {
	                        		System.out.println("Escribe uno de los calculos del cuadrado");
	                                opcionC = op.nextInt();
	                                switch (opcionC) {
	    							case 1:
	    								System.out.println("La medida del lado es: "+lado);
	    								System.out.println("El area del cuadrado es "+cubo.calcularArea(lado)+" m2\n");
	    								break;
	    							case 2:
	    								System.out.println("La medida del lado es: "+lado);
	    								System.out.println("El perimetro del cuadrado es "+cubo.calcularPerimetro(lado)+" m\n");
	    								break;
	    							case 3:
	    								break;
	    							default:
	    								System.err.println("Solo números entre 1 y 3");
	    							}
	    						} catch (InputMismatchException e) {
	    							System.err.println("Debes insertar un número");
	    			                op.next();
	    						}
							} while (opcionC != 3);
	                        break;
	                    case 2:
	                    	do {
	                    		System.out.println("\n--CALCULOS DEL CUBO--\n1. Perimetro del Cubo\n2. Volumen del Cubo\n3. Regresar al menú principal");
		                    	try {
		                    		System.out.println("Escribe uno de los calculos del cubo");
		                            opcionC = op.nextInt();
		                            switch (opcionC) {
									case 1:
										System.out.println("La medida del lado es: "+lado);
										System.out.println("El perimetro del cubo es "+cubo.calcularPerimetroCubo(lado)+" m\n");
										break;
									case 2:
										System.out.println("La medida del lado es: "+lado);
										System.out.println("El volumen del cubo es "+cubo.calcularVolumen(lado)+" m3\n");
										break;
									case 3:
										break;
									default:
										System.err.println("Solo números entre 1 y 3");
									}
								} catch (InputMismatchException e) {
									System.err.println("Debes insertar un número");
					                op.next();
								}
							} while (opcionC != 3);
	                        break;
	                    case 3:
	                    	cancelar = true;
	                    	break;
	                    case 4:
	                    	salir = true;
	                        break;
	                    default:
	                        System.err.println("Solo números entre 1 y 4");
	                }
	            } catch (InputMismatchException e) {
	                System.err.println("Debes insertar un número");
	                op.next();
	            }
			} while (opcionM != 4 && opcionC == 3);
        }

	}

}
