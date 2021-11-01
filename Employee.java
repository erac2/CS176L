package lab6.persons;
public class Employee extends Person{

	public Employee()
	{
		
	}
	
	private String officeNumb;
	private double salary;
	
	public String setOfficeNumber(String officeNumber)
	{
		return this.officeNumb = officeNumber;
	}
	
	public double setSalary(double salary)
	{
		return this.salary = salary;
	}
}
