package lab6.persons;
public class Student extends Person{


	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	public static final int SUPERSENIOR = 5;

	private int year;

	public void setYear(int year)
	{
		if (year == FRESHMAN)
		{
			this.year = 1;
		}
		else if(year == SOPHOMORE)
		{
			this.year = 2;
		}
		else if(year == JUNIOR)
		{
			this.year = 3;
		}
		else if(year == SENIOR)
		{
			this.year = 4;
		}
		else if(year == SUPERSENIOR)
		{
			this.year = 5;
		}
		else
		{
			System.out.println("Invalid!");
		}
	}
	
	public String toString()
	{
		return super.toString() + "\nYear: " + year;
	}

}
