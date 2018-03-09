// JDK -> 1.8
import java.util.ArrayList;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        // creating a list of employees. 
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        

//        employeeList.forEach(employee -> System.out.println(employee));      // iterating through the list.
//
//        System.out.println(employeeList.get(1));                             // printing second element of the list
//
//        System.out.println(employeeList.isEmpty());



        employeeList.set(1, new Employee("John", "Adams", 4568));              // iterating through the list.
        //employeeList.forEach(employee -> System.out.println(employee));

        //System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));
        //employeeList.forEach(employee -> System.out.println(employee));      // iterating through the list using lambda expression.
        
        
          // converting list to array.
          
//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }



        // trying out some functions of Arraylist class.
        
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
        
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
        

    }

}
