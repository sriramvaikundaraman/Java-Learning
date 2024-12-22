package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import streams.interfaces.MyInterface;
import streams.interfaces.SupplierInterface;

public class StreamsLearning {
	
	public static Double halfmaker(Integer input) {
		return input/2.0;
	}
	
	public static Boolean isEven(Integer input) {
		return input%2 == 0;
	}
	
	public static void sayHii(String input) {
		System.out.println("Hi "+ input);
	}
	
	public static String getBestCodersName() {
		return "Sriram V";
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		MyInterface obj = (a,b) -> {
			return a+b;
		};
		System.out.println(obj.sum(2, 3));
		
        Function<Integer, Double> half = a -> a / 2.0;
        Function<Integer, Double> half2 = StreamsLearning::halfmaker;

        System.out.println(half.apply(10));
        System.out.println(half2.apply(20));
        
        System.out.println("Half numbers approach");
        List<Integer> myFavouriteNumbers = Arrays.asList(10,16,21,5);
        List<Double> halfOfFavouriteNumbers = myFavouriteNumbers.stream().map(StreamsLearning::halfmaker).toList();
        halfOfFavouriteNumbers.forEach(System.out::println);
        
        System.out.println("Half numbers even filtering approach");
        List<Integer> evenFavouriteNumbers = myFavouriteNumbers.stream().filter(StreamsLearning::isEven).toList();
        evenFavouriteNumbers.forEach(System.out::println);
        
        System.out.println("Displaying Car brands with Hi");
        List<String> carBrands = Arrays.asList("Toyota", "Suzuki", "Tata", "Mahindra");
        carBrands.forEach(StreamsLearning::sayHii);
        
        SupplierInterface mySupplierInterface = StreamsLearning::getBestCodersName;
        System.out.println(mySupplierInterface.getSomeName());

        
        

	}

}
