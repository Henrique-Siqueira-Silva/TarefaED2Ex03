package view;

import controller.Ex03;


public class mainEx03 {
	public static void main (String args[]) {
		Ex03 m = new Ex03();
		int par = 0;
		
		int [] vet = new int[] {5,8,9,4,6,1,7,5};
		
		par = m.MostraPar(vet, 7,0);
		System.out.println(par);
		
	
		
	}

}
