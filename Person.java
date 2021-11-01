/**
 * Define the Person superclass.

 * @author linuxuser
 *
 */
package lab6.persons;
import java.lang.Object.getClass;
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
		return java.lang.Object.getClass() + name;
	}
	
	
}
