package veiculos;

public class Caminhao extends Veiculo {
	
	public float capacidadeDeCarga;
	
	public Caminhao() {
		super();
	}

	@Override
	public String toString() {
		return "Marca: " + this.marca +'\n'+
				"Modelo: "+ this.modelo +'\n'+
				"Ano: " + this.ano +'\n'+
				"Capacidade de carga: " + this.capacidadeDeCarga+"kg"+ '\n';
	}
}
