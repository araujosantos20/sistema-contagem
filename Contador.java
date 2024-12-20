package contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int primeiroNumero = terminal.nextInt();
		System.out.println("Digite o segundo número:");
		int segundoNumero = terminal.nextInt();
		
		try {
			contar(primeiroNumero, segundoNumero);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro precisa ser maior que o primeiro.");
		}
	}
	static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
		
		int contagem = segundoParametro - primeiroParametro;
		if(contagem < 0) {
			throw new ParametrosInvalidosException();
		}
		
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo a ocorrência número "+ (i + 1));
		}
	}
}
