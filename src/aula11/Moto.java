package aula11;

public class Moto extends Veiculo{
	
	@Override
	public void	calcularPreco(int qtdHoras) {
		super.calcularPreco(qtdHoras);
		
			System.out.println("O valor a pagar para o modelo:  " + " e: R$" + qtdHoras);
			}
	}
