/**
 * Represents a pet store that contains a variety of pets.
 * @author chungj
 */

package lab8.petstore;

import java.util.ArrayList;

public class PetStore {

	// instance vars
	// Complete the code below to declare an ArrayList of Pet called pets:
	ArrayList<Pet> pets = new ArrayList<>();

	// Named constants for readability:
	private final static int ALL = 0;
	private final static int CAT = 1;
	private final static int FISH = 2;


	// no constructor (just use the default)

	// methods
	/**
	 * Complete this code:
	 *
	 * Add a Pet to the pets ArrayList
	 *
	 * @param a Pet object
	 */
	public void addPet(Pet pet) 
	{
		pets.add(pet);
	}


	/**
	 * Complete this code:
	 * 
	 * List Pet objects in pets ArrayList.
	 *
	 * Modify the listPets() method to accept an int parameter that represents either CAT or FISH or ALL.
	 * If ALL, list all pets.
	 * If CAT, list only Cats.
	 * If FISH, list only Fish.
	 *
	 * @param int value which is ALL, CAT or FISH
	 */
	
	public void listPets(int choice)
	{
		int count = 1;
		
		if (choice == ALL)
			for (Pet critter : pets) 
			{
				System.out.println(count + ":\n" + critter); // triggers toString() of critter object
				count++;
			}

		if(choice == CAT)
		{
			for (Pet cat:pets)
			{
				System.out.println(count + ":\n" + cat);
				count++;
			}
		}

		if (choice == FISH)
		{
			for (Pet fish:pets)
			{
				System.out.println(count + ":\n" + fish);
				count++;
			}
		}
	}




	public static void main(String[] args) {
		// Construct a PetStore object
		PetStore mystore = new PetStore();

		// Construct and add a number of Cat objects to mystore
		Cat fuzzy = new Cat("Fuzzy", 50, "Mix", true);
		mystore.addPet(fuzzy);
		mystore.addPet(new Cat("Wuzzy", 90, "Manx", false));


		// Complete the code below:

		// Call the listPets method to list all pets:
		mystore.listPets(ALL);

		// Construct a number of Fish objects and add them to the pets ArrayList, 
		Fish newFish = new Fish("Fish", 10, true, "Goldfish", "small");
		mystore.addPet(newFish);
		mystore.addPet(new Fish("Fish", 10, true, "Shark", "large"));


		// and then list all the pets again. 

		mystore.listPets(ALL);
		// Call the listPets method to print only Cats.
		mystore.listPets(CAT);

		// Call the listPets method to print only Fish
		mystore.listPets(FISH);
	}

}
