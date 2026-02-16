package view;

import controller.VetorNegativo;

public class Principal {

	public static void main(String[] args) {
		// Intanciando os métodos da classe VetorNegativo
		VetorNegativo metodos = new VetorNegativo();
		
		int qnt, vetor[] = {-1,-2,-3,-4,5,-6,7,8,9,10};
		
		qnt = metodos.Quantidade(vetor, vetor.length);
		
		System.out.println("Ha "+qnt+" números negativos neste vetor");

	}

}
