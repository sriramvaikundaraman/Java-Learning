package streams;

import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    List<String> phoneNumbers;

    public Employee(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
    
}
public class FlatmapLearning {

	public static void main(String[] args) {
		
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Arrays.asList("123", "456")),
                new Employee("Bob", Arrays.asList("789", "012")),
                new Employee("Charlie", Arrays.asList("345", "678"))
            );
        
        System.out.println(employees);
        
        // I need to get only phone numbers list
        
        List<String> phoneNumbers = employees.stream().flatMap(employee -> employee.getPhoneNumbers().stream()).toList();
        System.out.println(phoneNumbers);
        

	}

}
