package lab6.persons;
public class Student extends Person{


	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	public static final int SUPERSENIOR = 5;

	private int year;
	private String name;

	public Student()
	{
		super.setName(name);
	}

	public int setYear(int year)
	{
		if (year == 1)
		{
			return FRESHMAN;
		}
		else if(year == 2)
		{
			return SOPHOMORE;
		}
		else if(year == 3)
		{
			return JUNIOR;
		}
		else if(year == 4)
		{
			return SENIOR;
		}
		else if(year == 5)
		{
			return SUPERSENIOR;
		}
		else
		{
			System.out.println("Invalid!");
		}
		return year;
	}

}
