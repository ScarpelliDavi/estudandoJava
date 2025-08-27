package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(5,6,7,8,9);
		
		Stream<Integer> st = ls.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st.toArray()));
		
		int sum = ls.stream().reduce(0, (x,y) -> x + y);
		System.out.println("sum = " + sum);
		
		List<Integer> newList = ls.stream()
				.filter(x -> x % 2 == 0) // filtrar somente os pares
				.map(x -> x * 10) // se forem pares, multiplicar por 10
				.collect(Collectors.toList()); // transforma em lista
		
		System.out.println(Arrays.toString(newList.toArray()));
		

	}

}
