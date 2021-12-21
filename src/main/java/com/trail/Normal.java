package com.trail;
import java.util.stream.IntStream;

interface parent
{
	public void method2();
}

interface parent2
{
	public void method2();
}

public class Normal implements parent,parent2 {
	
	
	public void method() {
		
	}

	
	/*
	 * public void sumofevennumber(int number) { int sum =0; for(int i=0; i<=number;
	 * i++) { if(i%2==0) { sum= sum+i; } }
	 * 
	 * }
	 */


	public void method2() {
		// TODO Auto-generated method stub
		//return null;
		IntStream.iterate(0, i->i+2).limit(10).forEach(System.out::print) ;
	}
	
	public static void main(String[] s) {
		Normal nor = new Normal();
		nor.method2();
		IntStream stream = IntStream.generate(() 
	            -> { return (int)(Math.random() * 10000); }); 
	 
	stream.limit(10).forEach(System.out::println); 
	
	 IntStream.rangeClosed(0, 5)
     .forEach( Normal::doSomething );
	 
	 //Range
	     stream = IntStream.range(5, 10); 
	    stream.forEach( System.err::println);  //5,6,7,8,9
	     
	    //Closed Range
	    IntStream closedRangeStream = IntStream.rangeClosed(5, 10); 
	    closedRangeStream.forEach( System.err::println );   //5,6,7,8,9,10
	 
	}
	private static void doSomething(int i) {
        System.out.println(i);
    }
	
	
}
