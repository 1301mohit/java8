package stream.sort.List;

import java.util.*;
import java.util.stream.Collectors;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 3, 1, 4);
        System.out.println("Ascending -------------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Reverse ---------------");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("Descending -------------");
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        list.stream().sorted().forEach(System.out::print); //Ascending
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print); //Descending

        List<Employee> listOfEmp = Arrays.asList(new Employee(3, "Ram", 20),
                                                 new Employee(1, "Amit", 10),
                                                 new Employee(2, "Soham", 15));

        listOfEmp.stream().sorted((emp1, emp2) -> emp1.getEname().compareToIgnoreCase(emp2.getEname())).collect(Collectors.toList()).forEach(System.out::println);
        listOfEmp.stream().sorted((emp1, emp2) -> (int) (emp2.getSalary() - emp1.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
        listOfEmp.stream().sorted(Comparator.comparing(Employee::getEid)).collect(Collectors.toList()).forEach(System.out::println);
        listOfEmp.stream().sorted(Comparator.comparing(emp -> (int)emp.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
    }
}
