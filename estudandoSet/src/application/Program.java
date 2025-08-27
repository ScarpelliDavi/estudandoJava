package application;

import java.util.HashSet;
import java.util.Set;


public class Program {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Impressora");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		set.removeIf(x -> x.length()<=3);
		set.removeIf(x -> x.charAt(0) == 'I');
		
		System.out.println("---depois da remocao---");
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
