package entidade;

public class Forca {

	private String[] tracinhos;
	private String[] letras;
	private String palavra_Secreta = "girafa";
	private String pista = "Animal";
	private int totalLetras;
	private int palpites = 5;
	private boolean acertou;
	private int vezAcertos;
	
	public void contaLetra() {
		
		totalLetras = palavra_Secreta.length();
		tracinhos = new String[totalLetras];
		letras = new String[totalLetras];
		char letra;
		
		for (int i = 0; i < totalLetras; i++) {
			letra = palavra_Secreta.charAt(i);
			tracinhos[i] = String.valueOf('-');
			letras[i] = String.valueOf(letra);
			
		}

		this.mostrarPalavras();

	}

	public void inserirLetra(char letra) {
		
		for (int i = 0; i < totalLetras; i++) {
			int j = 0;
			
			if(letras[i].charAt(j) == letra) {
				tracinhos[i] = String.valueOf(letra);
				
				acertou = true;
				vezAcertos++;
			}
			j++;
			
		}
		
		
		palpites = palpites - this.resultadoPalpites(acertou);
		this.mostrarPalavras();
		 acertou = false;		
	}
	
	private int resultadoPalpites(boolean acertou) {
		if(acertou) {
			return 0;
		}
		
		return 1;
	}
	
	private void mostrarPalavras() {
		System.out.println("===================");
		System.out.println("JOGO DA FORCA");
		System.out.println("==================");
	
		for (int i = 0; i < totalLetras; i++) {
		
			System.out.print(tracinhos[i] + "  ");
			
		}
		
		System.out.println();
		System.out.println("Pista: " + pista);
		System.out.println("Palpite: "+palpites);
		
	}

	public int getPalpites() {
		return palpites;
	}
	
	

	public void setPalpites(int palpites) {
		this.palpites = palpites;
	}

	public String getPalavra_Secreta() {
		return palavra_Secreta;
	}

	public int getVezAcertos() {
		return vezAcertos;
	}

	public void setVezAcertos(int vezAcertos) {
		this.vezAcertos = vezAcertos;
	}
	
	
}
