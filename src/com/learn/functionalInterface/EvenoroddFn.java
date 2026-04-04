package com.learn.functionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EvenoroddFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate<Integer> isEven = i -> (i%2==0);
		Predicate<Integer> isGreaterThan = i -> i >50 ;
		
		System.out.print("48 is Even: "+isEven.test(48));
		System.out.println("   48 > 50:  "+isGreaterThan.test(48));
		System.out.print("72 is Even "+isEven.test(72));
		System.out.print("    72 > 50: "+isGreaterThan.test(72));
System.out.println();
		
		Predicate<Integer> isCombined = isEven.and(isGreaterThan);
		System.out.println("72 is even AND >50  "+isCombined.test(72));;
		Function<String, String> addGreeting = name -> "Hello, " + name + "!  ";

       
        System.out.print(addGreeting.apply("Alice"));
        System.out.print(addGreeting.apply("Bob"));
        System.out.println();
        Consumer<String>printUppercase = str->System.out.println(str.toUpperCase());
        List <String> list = List.of("java","streams","Lambda");
        list.forEach(printUppercase);
        Supplier<Double> randomNumber = () -> Math.random()*100;
        for(int i=0;i<3;i++)
		System.out.print("Score " + randomNumber.get()+"  ");
                
               
                
	}

}
