package controller;

public class VetorNegativo {

	public VetorNegativo() {
		super();
	}
	
	public int Quantidade(int[] vet, int tamanho) {
		
		int qnt=0;
		
		if(vet[tamanho-1]<0) qnt++;
		
		// Condição de parada quando o tamanho do vetor for apenas 1 célula
		if(tamanho==1) return qnt;
		
		// Caso contrário retorna o avlor de qnt somado a função com tamanho decrescido em 1
		return qnt+Quantidade(vet, tamanho-1);
	}
}
