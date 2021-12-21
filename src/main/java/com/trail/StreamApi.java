package com.trail;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		List<String> list = List.of("jk","mjk","rmk","lk","jj","juh");
		list.stream().filter(j->j.startsWith("j")).collect(Collectors.toList()).forEach(System.err::println);
		
		
		
		IntStream intStream = IntStream.of(1,44,23,76,45,768,12,00);
		
		intStream.map(e->e*e).forEach(System.out::println);
		
		Stream<Integer> stream = Stream.of(1,44,23,76,45,768,12,00);
		
		stream.sorted().forEach(System.err::println);
		
		Stream.of(1,44,23,76,45,768,12,00).map(e->e+e).collect(Collectors.toList()).forEach(System.out::println);
		
		list.stream().sorted().collect(Collectors.toList()).forEach(System.err::println);
		
		
	}

}
