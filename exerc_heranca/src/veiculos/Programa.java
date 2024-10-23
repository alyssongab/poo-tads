package veiculos;

public class Programa {
	public static void main(String[] args) {
		Carro c = new Carro();
		Caminhao cam = new Caminhao();
		
		c.marca = "Fiat";
		c.modelo = "Argo";
		c.ano = 2018;
		c.numeroDePortas = 4;
		
		System.out.println(c);
		System.out.println();
		
		cam.marca = "Desconhecido";
		cam.modelo = "Caçamba";
		cam.ano = 1995;
		cam.capacidadeDeCarga = 2340.96f;
		
		System.out.println(cam);
	}
}
