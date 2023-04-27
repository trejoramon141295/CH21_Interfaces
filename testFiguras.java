public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		Cuadrado c1 = new Cuadrado("Cuadrado 1", 5);
		Cuadrado c2 = new Cuadrado("Cuadrado 2", 4.3);
		Rectangulo rec1 = new Rectangulo("Rectangulo 1", 15, 10);
		Rectangulo rec2 = new Rectangulo("Rectangulo 2", 8, 9);
		Rombo rombo1 = new Rombo("Rombo 1", 6, 8, 5);
		Rombo rombosman = new Rombo("Rombosman", 6, 8, 5);
		Trapecio trap1 = new Trapecio("Trapecio 1", 0, 0, 0, 0, 0, 0, 0);
		Trapecio trap2 = new Trapecio("Trapecio", 19.4, 20, 19.4, 14, 14, 20, 5);

		//imprimirCalculo(t1); imprimirCalculo(t2);		
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
//		imprimirCalculo(c1); imprimirCalculo(c2);
//		imprimirCalculo(rec1); imprimirCalculo(rec2);
//		imprimirCalculo(rombo1); imprimirCalculo(rombosman);
//		imprimirCalculo(romboide1); imprimirCalculo(romboide2);
		imprimirCalculo(trap1); imprimirCalculo(trap2);
		
	}//main

	public static void imprimirCalculo(Trapecio t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras