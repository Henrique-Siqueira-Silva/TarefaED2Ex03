package controller;

public class Ex03 {
	
	public Ex03() {
		super();
	}
	
	public int MostraPar (int[] vet, int tamanho, int par) {
		if (tamanho < 0) { 
			return par;
		}else {
			if ( vet[tamanho] % 2 == 0 ) {
				par++;
			}
		}
		return MostraPar(vet, tamanho - 1, par);
		
	}

}
