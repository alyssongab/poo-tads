package Funcionarios;

public abstract class Funcionario {
	
	protected String nome;
	protected float salario;
	protected final String cargo;
	
	public Funcionario(String cargo) {
		this.cargo = cargo;
	}
	
	public abstract float calcularBonus();
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+'\n'+
				"Cargo: "+this.cargo+'\n'+
				"Salario: R$"+this.salario+'\n'+
				"Bonus: R$"+calcularBonus() +'\n';
	}
}
