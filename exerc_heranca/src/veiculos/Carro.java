package veiculos;

public class Carro extends Veiculo {

	public int numeroDePortas;
	
	public Carro() {
		super();
	}
	
	@Override
	public String toString() {
		return "Marca: " + this.marca +'\n'+
				"Modelo: "+ this.modelo +'\n'+
				"Ano: " + this.ano +'\n'+
				"Numero de portas: " + this.numeroDePortas+'\n';
		
	}
	
}

