package Funcionarios;

public class Programa {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		Programador p = new Programador();
		
		g.nome = "Gabriel";
		g.salario = 20000f;
		System.out.println(g);
		
		p.nome = "Alysson";
		p.salario = 6000f;
		System.out.println(p);

	}

}
