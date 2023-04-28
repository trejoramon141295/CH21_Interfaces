//No_olvidar_implents_Y_la_interfaz
public class Cuadrado implements Calcular{
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		//super();
		this.name = name;
		this.lado = lado;
	}//constructor
	
	//Los_estan_relacionados_con_la_interfaz_no_olvidar_this
	public double calcularPerimetro() {
		return this.getLado()*4;		
	}//calcularPerimetro
	
	public double calcularArea() {
		return Math.pow(this.getLado(), 2);
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
