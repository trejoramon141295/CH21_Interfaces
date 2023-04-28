//No_olvidar_implents_Y_la_interfaz
public class Rectangulo implements Calcular {
	//Idea_Rectangulo_y_Romboide_son_casi_lo_mismo_
	private String name;
	private double base;
	private double altura;
	
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}//constructor
	
	//Los_estan_relacionados_con_la_interfaz_no_olvidar_this
	public double calcularArea() {
		return this.getAltura()*this.getBase();		
	}//calcularArea
	
	public double calcularPerimetro() {
		return (2*this.getAltura())+(2*this.getBase());		
	}//calcularPerimetro

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getBase() {
		return base;
	}//getBase

	public void setBase(double base) {
		this.base = base;
	}//setBase

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura	
	//getters_&_setters

	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}//toString

}//class_Rectangulo
