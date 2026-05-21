package Circulo;

public class Principal {
	
	public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(12.0);

        System.out.println("Raio: " + circulo.getRaio());
        System.out.printf("Área: %.2f%n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f%n", circulo.calcularPerimetro());
    }
}