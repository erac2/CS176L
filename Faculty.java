package lab6.persons;
public class Faculty extends Employee{

	private String rank;
	private String officeNumb;
	private double salary;
	
	public Faculty()
	{
		
	}
	
	public String setRank(String rank)
	{
		return this.rank = rank;
	}
	
	public String toString()
	{
		return super.toString() +"\nRank: " + rank;
	}
	
}
