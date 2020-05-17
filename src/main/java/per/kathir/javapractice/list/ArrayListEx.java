package per.kathir.javapractice.list;

import java.util.List;
import java.util.stream.Collectors;
import per.kathir.javapractice.model.Employee;
import per.kathir.javapractice.model.Item;
import per.kathir.javapractice.util.ListUtil;

public class ArrayListEx {

  public static void main(String[] args) {

    ListUtil listUtil = new ListUtil();
    List<Employee> empList = listUtil.getEmployeeList(10);

    /* 1. Print all 100 Employee first and last name using Streams */
    empList.stream().forEach(emp -> {
      System.out.println(emp.getFirstName() + " " + emp.getLastName());
//      System.out.println(emp.getPosition());
//      System.out.println(emp.getTitle());
      System.out.println(emp.getSalary());
    });

    List<Employee> empListNew =
        empList.stream().filter(emp -> emp.getFirstName().startsWith("S")).collect(Collectors.toList());
    System.out.println("Total Emp names starts with S..." + empListNew.size());
    
    
//    List<Item> itemList = listUtil.getItemList(1000);
//    
//    Map<Integer, List<Item>> accountItemsMap = itemList.stream().flatMapToLong(mapper)
    
    
  }

}
