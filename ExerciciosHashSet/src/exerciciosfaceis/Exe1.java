package exerciciosfaceis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Exe1 {
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		HashMap<Integer,String> nomes = new HashMap<>();
		
		for(int a = 1; a <= 3;a++) {
			
			
			String name = teclado.next();
			nomes.put(a, name);
			
		}
		
		
		for(Integer c : nomes.keySet()) {
			
			System.out.println("nomes adicionados no Hash:" + nomes.get(c));
			
		}
		
	}

}
