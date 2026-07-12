import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drivar {

	public static void main(String[] args) {
		
		List<String>name = Arrays.asList("suraj", "mohan", "rohan", "raj","ravi" );
		
		System.out.println("input : "+name);
		
		Stream<String>stream =name.stream();
		
		Stream<String>uperCaseStream =stream.map(word -> word.toUpperCase());
		
		List<String>procesedName = uperCaseStream.collect(Collectors.toList());
		
		System.out.println("Proccessed : "+procesedName);

	}

}
