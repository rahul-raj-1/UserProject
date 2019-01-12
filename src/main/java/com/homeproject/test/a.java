package com.homeproject.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class a {

	public static void main(String[] args) {

		
		
		List<String> names = new ArrayList<>();
		names.add("AA");
		names.add("BB");
		names.add("CC");

		//names.remove(1);
		
		
		List<String> createList = names.stream()
			.map(m-> names.remove(1))
			.map(m->names.remove(0))
		   .collect(Collectors.toList());
		
		
		createList.forEach(System.out::println);
	}

}
