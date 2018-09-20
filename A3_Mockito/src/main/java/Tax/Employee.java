package Tax;

public class Employee implements IEmployee{
	public int salary;
	IEmployee obj;

	public Employee(int salary) {
		this.salary=salary;
	}
	
	public void setsalary(int salary) {
		this.salary=salary;
	}
	
	public int getsalary() {
		return salary;
	}
	
	public void setobj(IEmployee obj) {
		this.obj=obj;
	}
	
	public double computeTax(int amount) {
		return obj.computeTax(amount);
	}
	
	public double weeklysalary(Employee emp) {
		return obj.weeklysalary(emp);
	}
	
	public double fortnightsalary(Employee empl) {
		return obj.fortnightsalary(empl);
	}
	
	public double computekiwisaver(Employee kiwioption) {
		return obj.computekiwisaver(kiwioption);
	}
	
}
