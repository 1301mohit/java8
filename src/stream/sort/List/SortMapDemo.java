package stream.sort.List;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("three", 3);
        map.put("five", 5);
        map.put("one", 1);
        map.put("nine", 9);

        map.entrySet().stream().sorted((entry1, entry2) -> entry1.getKey().compareToIgnoreCase(entry2.getKey())).forEach(System.out::println);
        map.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employee, Integer> mapOfEmp = new HashMap<>();
        mapOfEmp.put(new Employee(3, "Ram", 20), 5);
        mapOfEmp.put(new Employee(1, "Amit", 10), 7);
        mapOfEmp.put(new Employee(2, "Soham", 15), 6);
        mapOfEmp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEname))).forEach(System.out::println);
        mapOfEmp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEid).reversed())).forEach(System.out::println);

        Map<Employee, Integer> treeMapOfEmp = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        treeMapOfEmp.put(new Employee(3, "Ram", 20), 5);
        treeMapOfEmp.put(new Employee(1, "Amit", 10), 7);
        treeMapOfEmp.put(new Employee(2, "Soham", 15), 6);
        System.out.println(treeMapOfEmp);
    }

}
