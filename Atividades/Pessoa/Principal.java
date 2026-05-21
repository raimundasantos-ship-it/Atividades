package Pessoa;

public class Principal { // Main.java
	
	    public static void main(String[] args) {
	        Pessoa pessoa = new Pessoa();

	        pessoa.setNome("Ana Silva");
	        pessoa.setIdade(30);
	        pessoa.setPais("Brasil");

	        System.out.println("Nome: " + pessoa.getNome());
	        System.out.println("Idade: " + pessoa.getIdade());
	        System.out.println("País: " + pessoa.getPais());

	        // Alterando informações
	        pessoa.setNome("Lia Souza");
	        pessoa.setIdade(40);
	        pessoa.setPais("Dinamarca");
	        System.out.println("\nApós alteração:");
	        System.out.println("Nome: " + pessoa.getNome());
	        System.out.println("Idade: " + pessoa.getIdade());
	        System.out.println("País: " + pessoa.getPais());
	    }
	}