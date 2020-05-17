package per.kathir.javapractice.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.github.javafaker.Faker;
import per.kathir.javapractice.model.Employee;
import per.kathir.javapractice.model.Item;
import per.kathir.javapractice.model.Student;

public class ListUtil {

  public List<Student> getStudentsList(int size) {
    List<Student> studentList = new ArrayList<>();
    Faker faker = new Faker();
    for (int i = 0; i < size; i++) {
      Student student = new Student();
      student.setFirstName(faker.name().firstName());
      student.setLastName(faker.name().lastName());
      student.setRollNo("CS" + (i + 1));
      student.setId(new Random().ints(1, 1000).findFirst().getAsInt());
      student.setTotalMarks(new Random().ints(300, 499).findFirst().getAsInt());
      student.setCity(faker.address().city());
      student.setEmailAddress(faker.internet().emailAddress());
      studentList.add(student);
    }
    return studentList;
  }

  public List<Employee> getEmployeeList(int size) {
    List<Employee> employeeList = new ArrayList<>();
    Faker faker = new Faker();
    for (int i = 0; i < size; i++) {
      Employee employee =new Employee();
      employee.setFirstName(faker.name().firstName());
      employee.setLastName(faker.name().lastName());
      employee.setPosition(faker.job().position());
      employee.setTitle(faker.job().title());
      employee.setSalary(new Random().ints(9000, 199000).findFirst().getAsInt());
      employeeList.add(employee);
    }
    return employeeList;
  }
  
  public List<Item> getItemList(int size){
    List<Item> itemList = new ArrayList<>();
    Faker faker = new Faker();
    for (int i = 0; i < size; i++) {
      Item item = new Item();
      item.setAccountId(new Random().ints(1, 99999999).findFirst().getAsInt());
      item.setCurrency(faker.currency().code());
      item.setItemId(new Random().ints(1, 99999999).findFirst().getAsInt());
      item.setColor(faker.color().name());
      itemList.add(item);
      
    }
    return itemList;
  }
 
}
