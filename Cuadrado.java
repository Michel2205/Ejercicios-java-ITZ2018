package modelo;

public class Cuadrado {

	public float calcularArea(float lado){
		float area;
		area = lado * lado;
		return area;
	}
	
	public float calcularPerimetro(float lado){
		float perimetro;
		perimetro = lado * 4;
		return perimetro;
	}

}
