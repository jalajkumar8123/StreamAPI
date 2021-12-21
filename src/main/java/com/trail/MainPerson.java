package com.trail;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.person.Gender;
import com.person.Person;

public class MainPerson {

	public static void main(String[] args) {

		//Filtering only female
		getPersonList().stream().filter(person->person.getGender().equals(Gender.FEMALE))
		.collect(Collectors.toList()).forEach(System.err::println);
		
		//sorting on age
		getPersonList().stream().sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList()).forEach(System.out::println);
		
		//getting highest age 
		getPersonList().stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::print);
		
		//getting lowest age
		getPersonList().stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::print);
		
		//all elements in a list should match age >25
		boolean allMatch = getPersonList().stream().allMatch(person->person.getAge()>25); System.err.println(allMatch);
		
		//any one element in a list should match age > or equal 3
		boolean anyMatch = getPersonList().stream().anyMatch(person->person.getAge()>=3); System.err.println(anyMatch);
		
		//grouping by gender
		Map<Gender, List<Person>> groupbygender = getPersonList().stream().collect(Collectors.groupingBy(Person::getGender));
		
		//printing the map way one
		groupbygender.forEach((gender, person)-> {System.err.println(gender); person.forEach(System.out::println);});
		
		//printing the map way two
		groupbygender.forEach((gender, person)-> {System.err.println(gender);System.err.println(person);});
		
		//getting highest age of female
		String name = getPersonList().stream().filter(person->person.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(Person::getAge))
	    .get().toString();
		System.err.println(name);
			
		}
		
	

	private static List<Person> getPersonList()
	{
		return List.of(new Person("Munindrakumar", 60, Gender.MALE), new Person("Shantha", 49, Gender.FEMALE), 
				new Person("Kempamma", 70, Gender.FEMALE),new Person("Anu", 32, Gender.FEMALE), new Person("Aruna", 31, Gender.FEMALE),
				new Person("jalaj", 30, Gender.MALE),new Person("Anil", 42, Gender.MALE),
				new Person("Nanjappa", 40, Gender.MALE), new Person("prapul", 13, Gender.MALE),new Person("vaiduria", 12, Gender.FEMALE), 
				new Person("tanish", 9, Gender.MALE),new Person("nihal", 3, Gender.MALE));
		
		
		
	}
}
