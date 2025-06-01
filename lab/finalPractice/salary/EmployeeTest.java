package finalPractice.salary;


public class EmployeeTest {
  public static void main(String[] args) {
    Employee[] employees = new Employee[]{
      new CommissionEmployee("zz",01,23, 12),
      new HourlyEmployee("xx",02,23.5,40),
      new SalariedEmployee("gg", 03,30000),
    };
    for (Employee em : employees ){
      System.out.println(em.getInfo());
      System.out.println(em.calculatePay());
    }


  }
}
