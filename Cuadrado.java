
public class Cuadrado {
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		//super();
		this.name = name;
		this.lado = lado;
	}//constructor
	
	public double calcularPerimetro() {
		return getLado()*4;		
	}//calcularPerimetro
	
	public double calcularArea() {
		return Math.pow(getLado(), 2);
	}//calcularArea

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado	
	//getters_&_setters

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString

}//class_Cuadrado
