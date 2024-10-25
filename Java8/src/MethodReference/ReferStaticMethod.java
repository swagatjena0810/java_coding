package MethodReference;

import java.util.Arrays;
import java.util.List;

public class ReferStaticMethod {
	public static void main(String[] args) {
		List<String> messages=
			Arrays.asList("hi","bye","for","let");
		messages.stream().map(String::toUpperCase)
		.forEach(System.out::println);
		
	}
}
