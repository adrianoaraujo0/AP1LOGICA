package ap1;

import java.util.Scanner;

public class DigitoVerificardor_SUAMATRICULA_SEUNOMECOMPLETO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char decisão;

		do {
			System.out.print("INSIRA OS 9 PRIMEIROS DIGITOS DO SEU CPF: ");
			// 398136146

			int cpf = sc.nextInt();

			// ESTRUTURA PARA REPETIR O CODIGO ENQUANTO O USUARIO NAO INSERIR OS 9 DIGITOS//
			if (cpf < 99999999) {
				while (cpf < 99999999) {
					System.out.println("ERRO!!!!");
					System.out.print("INSIRA OS 9 PRIMEIROS DIGITOS DO SEU CPF : ");
					cpf = sc.nextInt();
				}
			}

			////////////////// LOGICA PARA EXTRAIR OS NÚMEROS DO CPF//////////////////
			////////////////// cada d é correspondente a um digito do cpf///////////////

			int d1 = cpf / 100000000;
			int d2 = cpf / 10000000 - d1 * 10;
			int d3 = cpf / 1000000 - d1 * 100 - d2 * 10;
			int d4 = cpf / 100000 - d1 * 1000 - d2 * 100 - d3 * 10;
			int d5 = cpf / 10000 - d1 * 10000 - d2 * 1000 - d3 * 100 - d4 * 10;
			int d6 = cpf / 1000 - d1 * 100000 - d2 * 10000 - d3 * 1000 - d4 * 100 - d5 * 10;
			int d7 = cpf / 100 - d1 * 1000000 - d2 * 100000 - d3 * 10000 - d4 * 1000 - d5 * 100 - d6 * 10;
			int d8 = cpf / 10 - d1 * 10000000 - d2 * 1000000 - d3 * 100000 - d4 * 10000 - d5 * 1000 - d6 * 100
					- d7 * 10;
			int d9 = cpf - d1 * 100000000 - d2 * 10000000 - d3 * 1000000 - d4 * 100000 - d5 * 10000 - d6 * 1000
					- d7 * 100 - d8 * 10;

			// etapa 01
			// calculo da DV1 //
			int soma1 = (d1 * 10 + d2 * 9 + d3 * 8 + d4 * 7 + d5 * 6 + d6 * 5 + d7 * 4 + d8 * 3 + d9 * 2);
			int dv1 = (soma1 * 10) % 11;

			// etapa 02 //
			// calculo da DV2 //
			int soma2 = (d1 * 11 + d2 * 10 + d3 * 9 + d4 * 8 + d5 * 07 + d6 * 06 + d7 * 05 + d8 * 04 + d9 * 3);
			int dv2 = ((soma2 + dv1 * 2) * 10) % 11;
			////////////////////
			int digitos = dv1 * 10 + dv2;

			System.out.println("CPF COM OS DIGITOS VERIFICADORES: " + cpf + "-" + digitos);
			System.out.println();

			// MENU//
			System.out.println("a. Verificar o dígito verificador do CPF");
			System.out.println("b. Informações do desenvolvedor (Matrícula e Nome do aluno)");
			System.out.println("c. Sair do algoritmo.");
			System.out.print("SELECIONE UMA OPÇÃO: ");

			decisão = sc.next().charAt(0);
			System.out.println();

			while (decisão == 'b') {
				System.out.println("MATRÍCULA: " + "1 - 1234567");
				System.out.println("NOME DO ALUNO: " + "FRANCISCO ADRIANO");
				System.out.println();

				// MENU//
				System.out.println("a. Verificar o dígito verificador do CPF");
				System.out.println("b. Informações do desenvolvedor (Matrícula e Nome do aluno)");
				System.out.println("c. Sair do algoritmo.");
				System.out.print("SELECIONE UMA OPÇÃO: ");

				decisão = sc.next().charAt(0);

			}
		} while (decisão == 'a');
		System.out.println();
		System.out.println("********************");
		System.out.println("  VOLTE SEMPRE ;D");
		System.out.println("********************");
	}

}
