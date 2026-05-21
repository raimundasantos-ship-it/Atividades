package Funcionario;

public class Principal { //main
   
	    public static void main(String[] args) {

	        Funcionario fun = new Funcionario(1,"Marcos Paiva",4000.00);
	        
	        System.out.println("ID: " + fun.getIdFuncionario());
	        System.out.println("Nome: " + fun.getNomeFuncionario());
	        System.out.println(fun.getSalarioFuncionario());
	        
	        //Alteração de informações
	        fun.setIdFuncionario(2);
	        fun.setNomeFuncionario("Carlos Oliveira");
	        
	        System.out.println("\nApós alteração:"); 
	        System.out.println("ID: " + fun.getIdFuncionario());
	        System.out.println("Nome: " + fun.getNomeFuncionario());
	        System.out.println(fun.getSalarioFuncionario());
	        
	        
	    }
}