package lambda.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeInfo {

    public static void main(String args[]) {
        EmployeeInfo info = new EmployeeInfo();
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Mickey", 100000));
        emps.add(new Employee("Timmy", 50000));
        emps.add(new Employee("Annny", 40000));

       List<Employee>bySalary= info.sort(emps, SortMethod.BYSALARY);
       System.out.println("by salary");
       bySalary.stream().forEach(employee->System.out.println("name="+employee.getName() +" salary="+employee.getSalary()));
       System.out.println("by name");
       List<Employee>byNames=info.sort(emps,SortMethod.BYNAME);
       byNames.stream().forEach(employee->System.out.println("name="+employee.getName() +" salary="+employee.getSalary()));

       boolean isCharPresent=info.isCharacterPresentInAllNames(bySalary,"A");
       System.out.println("char present="+isCharPresent);
    }

    enum SortMethod {
        BYNAME,
        BYSALARY
    }


    public List<Employee> sort(List<Employee> emps, final SortMethod method) {
        if (method == SortMethod.BYSALARY) {
            List<Employee> sortedBySalary = emps.stream().sorted((e1, e2) -> e1.getSalary() - e2.getSalary()).collect(Collectors.toList());
            return sortedBySalary;
        }

        List<Employee> byName = emps.stream().sorted((e1, e2) -> {
            String name1 = e1.getName();
            String name2 = e2.getName();
            int result = name1.compareTo(name2);
            return result;
        }).collect(Collectors.toList());

        return byName;

    }

    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
        Stream<Employee> stream = entities.stream();
        long size = stream.filter(employee -> {
            String name = employee.getName();
            boolean result = name.startsWith(character);
            return result;
        }).count();

        return size > 0;

    }

}
