package Funcionario;
public class Funcionario {
     //Variáveis privadas
    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario;
    
      //Construtor de Funcioário sem set
    public Funcionario(int id, String nome, double salario) {
        this.idFuncionario = id;
        this.nomeFuncionario = nome;
        this.salarioFuncionario = salario;
    }

    //Métodos Públicos
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    

    // getter do salário e String formatada
    	public String getSalarioFuncionario() {
            return String.format("Salario %.2f", salarioFuncionario);
    }
    	}   