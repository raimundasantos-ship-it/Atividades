package Retangulo;

public class Principal {
	// Main.java

	    public static void main(String[] args) {
	        Retangulo ret = new Retangulo();

	        ret.setComprimento(15.0);
	        ret.setLargura(4.0);

	        System.out.println("Comprimento: " + ret.getComprimento());
	        System.out.println("Largura: " + ret.getLargura());
	        
	        //Alteração de informações
	        ret.setComprimento(12.0);
	        ret.setLargura(8.0);
	        System.out.println("\nApós alteração:");
	        System.out.println("Comprimento: " + ret.getComprimento());
	        System.out.println("Largura: " + ret.getLargura());
	    }
	}