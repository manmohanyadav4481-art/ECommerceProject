import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drivar0 {

	public static void main(String[] args) {
		
		List<String>name = Arrays.asList("suraj", "mohan", "rohan", "raj","ravi", "solayam" );
		
		// Task : from a given list can you find the brand starting "s" and convert those to upperCase
		
		List<String>procesedName = name.stream().filter(b->b.startsWith("s")).map(word->word.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Proccessed : "+procesedName);

	}

}