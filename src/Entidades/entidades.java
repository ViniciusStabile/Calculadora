package Entidades;

public class entidades {

	private double numero;
	private double numero2;

	public entidades(double numero, double numero2) {
		this.numero = numero;
		this.numero2 = numero2;
	}
	
	
	

	public void setNumero(double numero) {
		this.numero = numero;
	}


	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public void operacao(char operador) {

		switch (operador) {
		case '+':
			this.numero = this.numero + this.numero2;
			break;
		case '-':
			this.numero = this.numero - this.numero2;
			break;
		case '*':
			this.numero = this.numero * this.numero2;
			break;
		case '/':
			this.numero = this.numero / this.numero2;
			break;

		default:
			System.out.println("Operação inválida.");
			break;

		}

	}

	public double getNumero() {
		return numero;
	}

}
