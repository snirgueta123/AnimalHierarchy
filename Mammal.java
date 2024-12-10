/*
 * The Mammal class is an abstract subclass of the Animal class.
 * This class adds the concept of warm-bloodedness to animals.
 * and provides a method to indicate that mammals drink breast milk.
 * */
public abstract class Mammal extends Animal {
	private boolean isWarmBlooded;
	//Constructs a Mammal.
	public Mammal(String name, int age, String color,boolean isWarmBlooded ) {
		super(name, age, color);
		this.isWarmBlooded=isWarmBlooded;

	}

	//* Checks if the mammal is warm-blooded.
	public boolean getWarmBlooded() {
		return isWarmBlooded;
	}

	//Sets whether the mammal is warm-blooded.
	public void setWarmBlooded(boolean isWarmBlooded) {
		this.isWarmBlooded=isWarmBlooded;
	}
	//Returns a string representation of the mammal, including its warm-blooded status.
	public String toString() {
		return super.toString() + ", Warm blood : "+isWarmBlooded;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//Prints a message indicating that mammals drink breast milk.
	public abstract void drink();
}





