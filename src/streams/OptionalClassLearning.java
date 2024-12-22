package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassLearning {
	
	public static List<String> getSomeRandomData(){
		return null;
	}

	public static void main(String[] args) {
		
		Optional<String> optionalValue = Optional.of("Hello");
		optionalValue.ifPresent(value ->{
			System.out.println(value);
		});
		
		if (optionalValue.isPresent()) {
		    System.out.println("Value: " + optionalValue.get());
		}
		
		Optional<List<String>> optionalList = Optional.of(Arrays.asList("Sriram", "Bhavata"));
		optionalList.ifPresent(names ->{
			System.out.println(names);
		});
		
		List<String> defaultList = Arrays.asList("Sriram");
		Optional<List<String>> nullableOptionalList = Optional.ofNullable(getSomeRandomData());
		
		List<String> resultOfNullableOptionList = nullableOptionalList.orElse(defaultList);
		System.out.println("Result of Nullable option list: "+resultOfNullableOptionList);
	}

}
