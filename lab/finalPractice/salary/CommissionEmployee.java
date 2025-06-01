package finalPractice.salary;

public class CommissionEmployee extends Employee{
  double baseSalary, commission;

  public CommissionEmployee(String name, int id, double baseSalary, double commission) {
    super(name, id);
    this.baseSalary = baseSalary;
    this.commission = commission;
  }
  
  @Override
  public double calculatePay(){
    return baseSalary + commission;
  }
}
