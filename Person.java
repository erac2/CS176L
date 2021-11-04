/**
 * Define the Person superclass.

 * @author linuxuser
 *
 */
package lab6.persons;
public class Person {
	
	// data
	
	public Person()
	{
		
	}
	private String name;
	
	// methods
	/**
	 * set Person's name
	 */
	public String setName(String name) 
	{
		return this.name = name;
	}

	/**
	 * Return the Person's class and name.
	 */
	
	public String toString()
	{
		return this.getClass() + "\nName: " + name;
	}
	
	
}
