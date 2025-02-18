//No_olvidar_implents_Y_la_interfaz
public class Rombo implements Calcular {
	private String name;
	private double diagonalMenor;
	private double diagonalMayor;
	private double lado;//Idea_usar_diagonales_para_calcular_lado
	
	public Rombo(String name, double diagonalMenor, double diagonalMayor, double lado) {
		super();//Investigar_bien_el_porque
		this.name = name;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
		this.lado = lado;
	}//constructor
	
	//TODO Aqui_no_use_el_this,_investigar_porque_usar_super_funciono_de_igual_manera
	public double calcularArea() {
		return (getDiagonalMayor()*getDiagonalMenor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado()*4);
	}// calcularPerimetro
	
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getDiagonalMenor() {
		return diagonalMenor;
	}//getDiagonalMenor
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setDiagonalMenor
	public double getDiagonalMayor() {
		return diagonalMayor;
	}//getDiagonalMayor
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setDiagonalMayor
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	//getters_&_setters
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor
				+ ", lado=" + lado + "]";
	}//toString

}//class_Rombo
