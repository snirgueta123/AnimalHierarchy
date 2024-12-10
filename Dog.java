/*
 * The Dog class is a subclass of Mammal and represents a dog.
 * It adds unique attributes and behaviors such as the ability to identify if a dog is a house dog.
 * This class also implements the `Cloneable` interface
 * to allow cloning of dog instances, including deep cloning of the associated owner.
 */
public class Dog extends Mammal implements Cloneable {

	private boolean isHouseDog;
	private Owner owner;

	//Constructs a Dog.
	public Dog(String name, int age, String color,boolean isWarmBlooded,boolean isHouseDog,Owner owner) {
		super(name, age, color,isWarmBlooded);
		this.isHouseDog=isHouseDog;
		this.owner=owner;
	}
	//Creates a clone of the Dog instance, including deep cloning of the owner.
	protected Object clone() throws CloneNotSupportedException {

		Dog cloned = (Dog) super.clone();
		cloned.owner = (owner != null) ? (Owner) owner.clone() : null; // Deep clone the owner if not null
		return cloned;
	}

	public Owner getOwner() {
		return owner;

	} 

	//Returns a string representation of the dog, including its attributes and owner's details.
	public String toString() {


		return super.toString() + ", Is house dog: "+isHouseDog+ ", owner :" + owner.getNameOwner() + ", Phone:" + owner.getPhoneOwner();
	}

	// Checks whether the dog is a house dog.
	public boolean getHouseDog() {
		return isHouseDog;

	} 
	//Sets whether the dog is a house dog.
	public void setHouseDog(boolean isHouseDog) {
		this.isHouseDog=isHouseDog;
	}

	/*Compares the current dog with another object for equality.
	Two dogs are considered equal if all their attributes, including the owner's details, match.
	 */
	public boolean equals(Object other) {
		if(!(other instanceof Dog))
			return false;
		Dog f=(Dog)other;	
		return  super.equals(other) && this.getWarmBlooded()==f.getWarmBlooded() && this.isHouseDog==f.isHouseDog && this.owner.getNameOwner().equals(f.owner.getNameOwner()) && this.owner.getPhoneOwner().equals(f.owner.getPhoneOwner());

	}

	//Prints a message indicating that the dog is eating.
	public void eat() {

		System.out.println("Dog eats bones.");
	}

	//Prints a message indicating that the dog is sleeping.
	public void sleep() {
		System.out.println("Dog sleeps on its bed.");
	}
	public void performAction() {
		System.out.println("The dog bites.");
		drink();
	}

	//Prints a message indicating that mammals drink breast milk.
	public  void drink() {
		System.out.println("Dog drink breast milk ");
	}

}
