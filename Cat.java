/*
 * The Cat class represents a cat, a specific type of mammal.
 * It adds unique attributes and behaviors for cats, such as the softness of their fur,their scratching behavior, and their association with an owner.
 * This class also implements the `Cloneable` interface to enable cloning, 
 * including deep cloning of the associated owner.
 * */
public class Cat extends Mammal implements Cloneable {

	private boolean hasSoftFur;
	private Owner owner;

	//Constructs a Cat.
	public Cat(String name, int age, String color,boolean isWarmBlooded,boolean hasSoftFur,Owner owner) {
		super(name, age, color,isWarmBlooded);
		this.hasSoftFur=hasSoftFur;
		this.owner=owner;

	}

	//Creates a clone of the Cat instance, including deep cloning of the owner.
	protected Object clone() throws CloneNotSupportedException {
		Cat cloned = (Cat) super.clone();
		cloned.owner = (owner != null) ? (Owner) owner.clone() : null; // Deep clone the owner if not null
		return cloned;
	}

	public Owner getOwner() {
		return owner;

	} 

	//Checks whether the cat has soft fur.
	public boolean getHasSoftFur() {
		return hasSoftFur;
	} 

	//Sets whether the cat has soft fur.
	public void setHasSoftFur(boolean hasSoftFur) {
		this.hasSoftFur=hasSoftFur;

	}

	//Returns a string representation of the cat, including its attributes and owner's details.
	public String toString() {


		return super.toString() + ", Has soft fur: "+hasSoftFur+ ", owner: " + owner.getNameOwner() + ", Phone: " + owner.getPhoneOwner();
	}

	/*Compares the current cat with another object for equality.
	 Two cats are considered equal if all their attributes, including the owner's details, match.
	 */
	public boolean equals(Object other) {
		if(!(other instanceof Cat))
			return false;
		Cat f=(Cat)other;
		if (this.owner == null || f.owner == null) 
			return false;
		return super.equals(other) && this.getWarmBlooded()==f.getWarmBlooded() && this.hasSoftFur==f.hasSoftFur && this.owner.getNameOwner().equals(f.owner.getNameOwner()) && this.owner.getPhoneOwner().equals(f.owner.getPhoneOwner());
	}

	//Prints a message indicating that the cat is eating.
	public void eat() {

		System.out.println("The cat eats fish.");
	}

	//Prints a message indicating that the cat is sleeping.
	public void sleep() {
		System.out.println("Cat sleeps for long hours.");
	}

	public void performAction() {
		System.out.println("The cat scratches.");
		drink();
	}

	//Prints a message indicating that mammals drink breast milk.
	public  void drink() {
		System.out.println("Cat drink breast milk ");
	}

}

