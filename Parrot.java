/* 
 * The Parrot class represents a parrot, a specific type of bird. 
 * It extends the Birds class and adds the ability for parrots to speak, along with an owner.
 * This class defines behaviors for eating, sleeping, speaking, and cloning.
 */
public class Parrot extends Birds implements Cloneable {
	private boolean speak;
	private Owner owner;

	//Constructs a Parrot.
	public Parrot(String name, int age, String color,int numOfFeathers,boolean speak,Owner owner) {
		super(name, age, color, numOfFeathers);
		this.speak=speak;
		this.owner=owner;
	}

	// Clones the current Parrot object and returns a copy with a cloned owner.
	protected Object clone() throws CloneNotSupportedException {
		Parrot cloned = (Parrot) super.clone();
		cloned.owner = (owner != null) ? (Owner) owner.clone() : null;
		return cloned;
	}

	public Owner getOwner() {
		return owner;

	} 

	/*
	 * Returns a string representation of the parrot, including its speaking ability, owner details, 
	 * and the attributes inherited from the Birds class.
	 */
	public String toString() {
		return super.toString() + ", Is speak: "+speak + ",  owner:" + owner.getNameOwner() + ", Phone:" + owner.getPhoneOwner();
	}	

	// Gets the speaking ability of the parrot.
	public boolean getspeak() {
		return speak;
	} 

	//Sets whether the parrot can speak or not.
	public void setSpeak(boolean speak) {
		this.speak=speak;
	}
	//Defines the eating behavior of the parrot, printing a message about its diet.
	public void eat() {
		System.out.println("Parrot eats seeds and fruits.");
	}

	//Defines the sleeping behavior of the parrot, printing a message about where it sleeps.
	public void sleep() {
		System.out.println("Parrot sleeps in its cage.");
	}

	/*Compares the current Parrot object with another object for equality. 
	 * Two parrots are considered equal if all their attributes (name, age, color, feathers, speak, and owner) are the same.
	 */
	public boolean equals(Object other) {
		if(!(other instanceof Parrot))
			return false;
		Parrot f=(Parrot)other;
		if (this.owner == null || f.owner == null) return false;
		return  super.equals(other) && this.getNumOfFeathers()==f.getNumOfFeathers() && this.speak==f.speak && this.owner.getNameOwner()==f.owner.getNameOwner() && this.owner.getPhoneOwner()==f.owner.getPhoneOwner();

	}
	public void performAction() {
		System.out.println("The parrot sings.");
		fly();
	}

	///Prints a message indicating that the bird is flying.
	public  void fly() {
		System.out.println("The Parrot flew ");
	}

}
