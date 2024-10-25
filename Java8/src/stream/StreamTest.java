package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Stream<Integer> names=Stream.empty();
		Collection<Integer> nums=Arrays.asList(1,5,4,8,2);
		Stream<Integer> s=nums.stream();
		
		String []texts= {"and","or","is","for"};
		Stream<String> s2=Arrays.stream(texts);
		
		Stream<Object> s3=Stream.builder()
							.add("or")
							.add("and")
							.add("is")
							.build();
	}
}
