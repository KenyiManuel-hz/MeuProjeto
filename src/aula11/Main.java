package aula11;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.setPlaca("ABC0D12");
		carro.setCor("Preto");
		carro.setModelo("Creta");
		carro.setQtdPortas(4);
		carro.setHorarioEntrada("19:20");
		//Exemplo: Ficou estacionado por 3h
		carro.calcularPreco(3);
	
		moto.setPlaca("KM2005");
		moto.setCor("Verde");
		moto.setModelo("Ninja");
		moto.setHorarioEntrada("10:20");
		moto.calcularPreco(2);
	}

}
