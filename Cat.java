/**
 * Cat subclass of Pet
 * @author chungj
 */

package lab8.petstore;

public class Cat extends Pet {
   // instance vars
   private String name;
   private String breed;
   
   // constructor
   public Cat(String name, int age, String breed, boolean adoptable) 
   {
      // Complete the code below to call the Pet superclass constructor:
      super(breed, age, adoptable); 
      this.name = name;
      this.breed = breed;     
   }
   
   // methods
   @Override
   public String toString() {
      return super.toString() + "\n" +
         "Name: " + name + "\n" +
         "Breed: " + breed;
   }
}
