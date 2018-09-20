package Tax;

public interface IEmployee {
	public double computeTax(int amount);
	public double weeklysalary(Employee emp);
	public double fortnightsalary(Employee emp);
	public double computekiwisaver(Employee kiwioption);

	//Declaring salary ,tax, minimum kiwisaver and total number of weeks details
	int salary=30000;
	double tax=0.4;
	double kiwisaver=0.3;
	int totalnumberofweeks=52;
	
	
}
