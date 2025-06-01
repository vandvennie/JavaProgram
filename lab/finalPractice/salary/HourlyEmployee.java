package finalPractice.salary;

public class HourlyEmployee extends Employee{
  private double hourlyRate, hoursWorked;

  public HourlyEmployee(String name, int id, double hourlyRate, double hoursWorked){
    super(name, id);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double calculatePay(){
    return hourlyRate * hoursWorked;
  }
}
