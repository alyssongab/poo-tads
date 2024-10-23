package Funcionarios;

public class Programador extends Funcionario {

	public Programador() {
		super("Programador");
	}
	
	@Override
	public float calcularBonus() {
		return this.salario * 0.20f;
	}

}
