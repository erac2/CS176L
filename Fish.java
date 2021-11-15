/**
 * Fish subclass of Pet
 * @author 
 */

package lab8.petstore;

public class Fish extends Pet {
	// instance vars
	private String type; // "catfish", "goldfish", "shark", etc.
	private String size; // "small", "medium", "large", etc.


	/* Complete the code below: */

	// constructor (similar to Cat class)
	public Fish(String species, int age, boolean adoptable, String type, String size)
	{
		super(species, age, adoptable);
		this.type = type;
		this.size = size;

	}


	// methods (just the toString() method)


	public String toString() {
		return super.toString() + "\n" +
				"Type: " + type + "\n" +
				"Breed: " + size;
		//@Override



	}
}
