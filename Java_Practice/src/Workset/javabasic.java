package Workset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class javabasic {
	public static void main(String[] args) {
		
		
		
		//3  reverse a given string. i/p="Capgemini"
//		String s="capgemini";
//		String res="";
//		for(int i=s.length()-1;i>=0;i--) {
//			res+=s.charAt(i);
//		}
//		System.out.println(res);
		
		
		
		
		
		
		
		
		//4
		//write a code to find missing number in Integer List
	  //  Test cases :
	   //     a) 1,2,3,4,5,7,8,9,10
	     //   b)2,4,6,10,12,14,16,18,20
	      //  c)1,3,5,9,11,13,15,17
		int[] nums= {1,3,5,9,11,13,15,17};
		int diff=nums[1]-nums[0];
		int j=0;
		for(int i=nums[0];i<=nums[nums.length-1];i+=diff) {
			if(i!=nums[j]) {
				System.out.println(i);
				break;
			}
			else {
				j++;
			}
			
		}
		
		
		
		
		
		
		
		//5
		
		//Write a program to get the occurrence of a specific letter in a given String.
		//  i/p="Hello"
		//		   i/p=l
		//		   o/p=2 
//		 String s="hello";
//	     char ch='l';
//	     Long cnt=s.chars().filter(c->c==ch).count();
//	     System.out.println(cnt);
		
		
		
		
		
		
		
		
		//6
		//Write a java program for palindrome in normal way as well as using Command line arguments.
		//  i/p="MADAM"
		//		  o/p MADAM is a Pallendrome
//		String s="madam";
//		boolean flag =true;
//		for(int i=0;i<=s.length()/2;i++) {
//			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
//				flag=false;
//				break;
//			}
//			
//		}
//		if(flag) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
		
		
		
		
		
		
		
		
		
		//9
		//write a program to a sort a Array of String in ascending oreder alphabetially
		//   i/p String s=["Capgemini","Accenture","TCS","EPAM"]
		//		   o/p =[Accenture,Capgemini,EPAM,TCS]
//		String[] strings= {"Capgemini","Accenture","TCS","EPAM"};
//		Arrays.stream(strings).sorted()
//		.forEach(System.out::println);
		
		
		
		
		
		
		
		//13
		//Write a program to implement the defalut method in a Fuctional interface and override it.
	
//		interface MyFunctionalInterface {
//		    // Abstract method
//		    void abstractMethod();
//
//		    // Default method
//		    default void defaultMethod() {
//		        System.out.println("This is a default method.");
//		    }
//		}
//

//		class MyClass implements MyFunctionalInterface {
//		    // Overriding the abstract method
//		    @Override
//		    public void abstractMethod() {
//		        System.out.println("Abstract method implementation in MyClass.");
//		    }
//
//		    // Overriding the default method (optional)
//		    @Override
//		    public void defaultMethod() {
//		        System.out.println("Overridden default method in MyClass.");
//		    }
//		}
//
//		public class Main {
//		    public static void main(String[] args) {
//		        // Create an instance of MyClass
//		        MyClass obj = new MyClass();
//
//		        // Call the abstract method
//		        obj.abstractMethod();
//
//		        // Call the default method
//		        obj.defaultMethod();
//		    }
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		//14
		//write a program to Count the number of alphabets in a given sentence
	    //i/p="Capgemini"
	    //o/p = {C-1,a-1,p-1,g-1,e-1,m-1,i-2,n-1}
//		String s="capgemini";
//		LinkedHashMap<Character, Long> res=s.chars()
//                .mapToObj(ch->(char)ch)
//                .collect(Collectors.groupingBy(Function.identity(),
//                		LinkedHashMap::new,
//                		Collectors.counting()));
//		System.out.println(res);
		
		
		


		
	
		
		//17 Program to calculate no of words in a sentence
//		
//		String s="capgemini training";
//		String words[]=s.split("\\s+");
//		System.out.println(words.length);
		
		
		
		
		
		
		
		
//18 )Write a program to Reverse a string="Capgemini Training"		
		
//	String s="capgemini Training";
//	String res="";
//	for(int i=s.length()-1;i>=0;i--) {
//		res+=s.charAt(i);
//	}
//	System.out.println(res);
		
		
		
		
		
		
//22
//		int n=122;
//		String s=n+"";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev+=s.charAt(i);
//		}
//		int r=Integer.parseInt(rev);
//		System.out.println(r==n);
		
		
		
		//25
//		int n=82;
//		int sum=0;
//		while(n>=1) {
//			sum+=n%10;
//			n=n/10;
//		}
//		int sum2=0;
//		while(sum>=1) {
//			sum2+=sum%10;
//			sum=sum/10;
//		}
//		if(sum2==1) {
//			System.out.println("magic");
//		}
//		else {
//			System.out.println("not magic");
//		}
		
		
		
		

		
		
		
		
		//32
//		String s="hgFak";
//		if(s.matches("[A-Za-z]+")){
//			System.out.println("Alphabet only");
//		}
//		else {
//			System.out.println("contains digits  also");
//		}
//		
		
		
		
		//35
//		String s1="left";
//		String s2="felt";
//		char[] c1=s1.toCharArray();
//		char[] c2=s2.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		boolean flag=Arrays.equals(c1, c2);
//		if(flag) {
//			System.out.println("Anagram");
//		}
//		else {
//			System.out.println("Not angram");
//		}
		
		
		
		//39
//		int arr[]= {3,7,5,6,2};
//		int max=Integer.MIN_VALUE;
//		int min=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println("max:"+max+" min:"+min);
		
		
		
		
		//42
		
//		String s="fsg5%vsssns^&s";
//		String regex="[^a-z]";
//		s.replaceAll(regex,"");
//		System.out.println(s);
		
		
		//44	
//		int a=0,b=1,c;
//		do {
//			System.out.print(a+" ");
//			c=a+b;
//			a=b;
//			b=c;
//			
//		}while(a<31);
		
//		int n=5;
//		for(int i=0;i<n;i++) {
//			if(i!=n-1) {
//				System.out.println('*');
//			}
//			else {
//				for(int j=0;j<n;j++) {
//					System.out.print("*");
//				}
//			}
//		}
		
		
		//48
//		List<Integer> numList=Arrays.asList(2,3,3,3,65,4,3,3,2);
//		Set<Integer> set = new LinkedHashSet<>(numList);
//		List<Integer> uniqueList=new ArrayList<>(set);
//		uniqueList.forEach(System.out::println);
//			
			
	
//		String ss="capgemini";
//		IntStream.range(0,ss.length()).mapToObj(i->i%2==1?'$':ss.charAt(i))
//		.forEach(System.out::println);
		List<String> list=Arrays.asList("hi","hello","tac");
		list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		
		
	}
	
}
