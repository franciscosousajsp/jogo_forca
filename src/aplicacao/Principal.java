package aplicacao;

import java.util.Iterator;
import java.util.Scanner;

import entidade.Forca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Forca forca = new Forca();
		forca.contaLetra();
		boolean fimJogo = false;

		while (fimJogo == false || forca.getPalpites() != 0) {

			System.out.print("Digite uma letra: ");
			char letra = sc.next().charAt(0);
			forca.inserirLetra(letra);

			if (forca.getPalpites() == 0) {
				System.out.println("NÃO ACERTOU");
				System.out.println("Revelando a palavra secreta : " + forca.getPalavra_Secreta());
				fimJogo = true;
			}

			if (forca.getVezAcertos() == 6) {
				System.out.println("Parabéns voce venceu");
				fimJogo = true;
				forca.setPalpites(0);
			}

		}

	}

}
