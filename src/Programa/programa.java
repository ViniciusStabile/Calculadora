package Programa;
// programa de uma calculadora

import java.util.Locale;
import java.util.Scanner;

import Entidades.entidades;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		System.out.println("Bem-Vindo a Calculadora");
		while(true) {								// loop para a pessoa fazer quantas operaçoes quiser
		int i = 1; // ordem dos numeros sendo colocados

		System.out.println("Digite o " + i + "º numero ");        
		Double num = sc.nextDouble(); 
		System.out.println();
		System.out.println("Digite a operação  +,-,*,/, s");
		char operador = sc.next().charAt(0);

		i++;                                                  // aumentando a ordem dos numeros
		System.out.println("Digite o " + i + "º numero ");
		Double num2 = sc.nextDouble();                        // variavel do segundo numero 
		System.out.println();

		entidades calculadora = new entidades(num, num2);      // construtores mandando os primeiros numeros para a entidade

		calculadora.operacao(operador);					// chamando a operacao para fazer o calculo

		System.out.println(calculadora.getNumero());	// mostrando resultado da primeira operacao
		int cont = 1;
		while (cont == 1) {					// entra no loop no segundo while para ele continuar usando o resultado da conta e fazer mais operaçoes com ele
			System.out.println();
			System.out.println("Digite a operação  +,-,*,/, s(sair),r(resetar) ");  
			operador = sc.next().charAt(0);
			if (operador == 's') {                        // caso a pessoa queira sair do programa
				System.exit(0);
				;
			}
			
			if (operador == 'r') {			// caso a pessoa queira resetar o numero e voltar do zero ela pode									
				calculadora.setNumero(0);					
				calculadora.setNumero2(0);
				cont = 0;									// cont = 0 para sair do segundo loop que é onde a pessoa continua usando o resultado da primeira operaçao
				break;
				
			}

			i++;
			System.out.println("Digite o " + i + "º numero ");
			num2 = sc.nextDouble();
			calculadora.setNumero2(num2);							// mandando o numero para ir fazer a operacao
			System.out.println();

			calculadora.operacao(operador);							// fazendo a operacao novamente

			System.out.println(calculadora.getNumero());           // mostrando o resultado da operaçao
			
			
			
		}

		

	}
	
}
}
