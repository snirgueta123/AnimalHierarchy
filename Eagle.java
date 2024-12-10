/*
 * The Eagle class represents an eagle, a specific type of bird.
 * It extends the Birds class and adds a unique attribute for the size of the eagle's wings.
 * This class defines specific behaviors for eating, sleeping, and hunting (prey).
 */
public class Eagle extends Birds  {
	private int wingSize;

	//Constructs an Eagle.
	public Eagle(String name, int age, String color,int numOfFeathers,int wingSize ) {
		super(name, age, color, numOfFeathers);
		this.wingSize=wingSize;

	}

	//Returns a string representation of the eagle, including its attributes and wing size.
	public String toString() {
		return super.toString() + " Wing size "+wingSize;
	}
	public int getWingSize() {
		return wingSize;

	} 

	//Sets the size of the eagle's wings, ensuring the size is positive.
	public void setWingSize(int WingSize) {
		if(WingSize>0)
			this.wingSize=WingSize;
		else 
			throw new IllegalArgumentException("Wing size must be a positive number.");
	} 

	//Prints a message indicating that the eagle is eating meat.
	public void eat() {

		System.out.println("Eagle hunts and eats meat.");
	}

	// Prints a message indicating that the eagle sleeps in its nest.
	public void sleep() {
		System.out.println("Eagle sleeps in its nest.");
	}

	/*Compares the current eagle with another object for equality.
	 Two eagles are considered equal if all their attributes (name, age, color, number of feathers, and wing size) match.
	 */
	public boolean equals(Object other) {
		if(!(other instanceof Eagle))
			return false;
		Eagle f=(Eagle)other;
		return super.equals(other) && this.getNumOfFeathers()==f.getNumOfFeathers() && this.getWingSize()==f.getWingSize(); 

	}
	public void performAction() {
		System.out.println("The predatory eagle.");
		fly();
	}

	///Prints a message indicating that the bird is flying.
	public  void fly() {
		System.out.println("The Eagle flew ");
	}


}
