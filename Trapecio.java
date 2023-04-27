
public class Trapecio {
	private String name;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	//idea_preguntar_2_de_los_lados_los_podemos_igualar_a_las_bases
	
	public Trapecio(String name, double lado1, double lado2, double lado3,double lado4, 
					double baseMenor, double baseMayor, double altura) {
		//super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}//constructor
	
	public double calcularArea() {
		return (getAltura()*(getBaseMayor()+getBaseMenor()))/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return getLado1()+getLado2()+getLado3()+getLado4();
	}// calcularPerimetro
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getLado4() {
		return lado4;
	}
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//getters_&_setters

	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura=" + altura + "]";
	}//toString	

}//class_Trapecio
