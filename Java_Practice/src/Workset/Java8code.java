package Workset;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8code {
	 public static void main(String[] args) {
		 //1
	        // List<Integer> nums=Arrays.asList(
	        //   2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	        //   nums.stream().filter(i->i%2==0)
	        //   .forEach(System.out::println);
	        
	        
	        
	        //2
	        // List<Integer> nums=Arrays.asList(
	        //   2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	        // nums.stream().map(i->i+"").filter(i->i.startsWith("1"))
	        // .forEach(System.out::println);
	        
	        
	        //3
	        // List<Integer> nums=Arrays.asList(
	        //   2,4,6,2,8,6);
	        //  nums.stream().filter(n->nums.stream().filter(x->x==n).count()>1).collect(Collectors.toSet())
	        //     .forEach(System.out::println);
	        
	        
	        //4
	        // List<Integer> nums=Arrays.asList(
	        //   2,4,6,2,8,6);
	        //   System.out.println(nums.stream().findFirst().get());
	        
	        
	        
	        //5
	        // List<Integer> nums=Arrays.asList(
	        //   2,4,6,2,8,6);
	        // System.out.println(nums.stream().count());
	        
	        
	        
	        //6
	        // List<Integer> nums=Arrays.asList(
	        //   2,4,6,2,8,6);
	        //   Integer max=nums.stream().max((a,b)->Integer.compare(a,b)).get();
	        //  System.out.println("max: "+max);
	        
	        
	        
	        
	        
	        
	        //7 non-repeated
	         String s="ppssrttfg";
	     	s.chars().mapToObj(ch->(char)ch)
	 	 	.filter(ch->s.chars()
	 	 			.mapToObj(ch2->(char) ch2)
	 	 			.filter(ch2->ch2==ch).count()<2)
	 	 	.findFirst().ifPresent(System.out::println);
	 	 	
	        
	        
	        //8- repeated
//	         String s1="helpplease";
//	 		HashSet<Character> set = new HashSet<>();
	        
//		 	s1.chars().mapToObj(ch -> (char) ch) 
//		 			.filter(ch -> !set.add(ch))
//		 			.findFirst()
//		 			.ifPresent(System.out::println);
	        
	        
	        //9
	        // List<Integer> numList=Arrays.asList(2,5,3,4);
	        // numList.stream().sorted().forEach(System.out::println);
	        
	        
	        
	        
	        //10
	        // List<Integer> numList=Arrays.asList(23,43,32,29);
	        // numList.stream().sorted(Comparator.reverseOrder())
	        // .forEach(System.out::println);
	        
	        
	        
	        //11
	        // Stream<Integer> s1=Stream.of(1,2,3,4);
	        // Stream<Integer> s2=Stream.of(5,6,7,8);
	        // Stream.concat(s1,s2).forEach(System.out::println);
	        
	        
	        //12
	        // List<String> stringList=Arrays.asList("hello",
	        //     "parcel","took","delivery");
	        // stringList.stream().filter(s->s.length()>5)
	        //                 .forEach(System.out::println);
	        
	        
	        
	        
	        //13
	         // StringJoiner joiner1 = new StringJoiner(", ");
	        // joiner1.add("Apple");
	        // joiner1.add("Banana")
	        // StringJoiner joiner2 = new StringJoiner(", ");
	        // joiner2.add("Orange");
	        // joiner2.add("Mango");
	        // joiner1.merge(joiner2);
	        // System.out.println(joiner1.toString()); 
	        
	        
	        
	        //14
	        // List<Integer> list14= Arrays.asList(23,23,34,55,43,43);
	        // LinkedHashMap<Integer,Long>  maps=list14.stream()
	        //     .collect(Collectors.groupingBy(Function.identity(),
//		 									LinkedHashMap::new,
	//	 									Collectors.counting()));
	        // System.out.println(maps);
	        
	        
	        
	        
	        //15
	        // Thread t1=new Thread( ()->{
	        //     System.out.println("t1 is running");
	        //     });
	        // t1.start();
	        
	        
	        
	        
	        //17
	        // List<String> words=Arrays.asList(
	        //     "USA", "Japan", "France", "Germany",
	        //     "Italy", "U.K.","Canada");
	            
	        // String res=words.stream().map(s->s.toUpperCase())
	        //     .collect(Collectors.joining(","));
	        // System.out.println(res);
	        
	        
	        
	        
	        //18
	        // List<Integer> nums=Arrays.asList(9,10,3,4,7,3,4);
	        // nums.stream().distinct()
	                    
	        //             .forEach(n->System.out.println(n+" -> "+
	        //             n*n));
	        
	        
	        
	       
	        
	        
	        //19
//	         List<Integer> nums=Arrays.asList(
//	            2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	        // Long count=nums.stream().count();
	        // System.out.println("count: "+count);
	        
//	         Integer sum=nums.stream().mapToInt(i->i).sum();
//	         System.out.println("sum: "+sum);
	        
	        // Integer max=nums.stream().max((a,b)->Integer.compare(a,b)).get();
	        // System.out.println("max: "+max);
	        
	        // Integer min=nums.stream().min((a,b)->Integer.compare(a,b)).get();
	        // System.out.println("min: "+min);
	        
	        // Double avg= nums.stream().mapToInt(i->i  ).average().getAsDouble();
	        // System.out.println("average: "+avg);
	        
	        //--------------------------------------------------
	        
	        // String s="hello";
	        // char ch='l';
	        // Long cnt=s.chars().filter(c->c==ch).count();
	        // System.out.println(cnt);
		 
		 
//		 String str = "Hello World";
//		 str.toLowerCase().replaceAll("[^a-z]", "");
//		 
//		 str.chars().mapToObj(c -> (char) c)
//	                .collect(Collectors.groupingBy(Function.identity(),
//	                		LinkedHashMap::new
//	                		, Collectors.counting()))
//	                .entrySet().stream().max(Map.Entry.comparingByValue())
//	                .ifPresent(e->System.out.println(e.getKey()));
		 
//		 List<Integer> arr=Arrays.asList(2,2,3,4,3,2,5);
//		 arr.stream().filter(n1-> arr.stream().filter(n2->n2==n1).count()>1)
	        
	        
		  
		 }
}
