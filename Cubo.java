package modelo;

public class Cubo extends Cuadrado {
	
	public float calcularVolumen(float lado){
		float volumen;
		volumen = lado * lado * lado;
		return volumen;
	}
	
	public float calcularPerimetroCubo(float lado) {
		float perimetro = 0;
		perimetro = lado * 12;
		return perimetro;
	}

}
