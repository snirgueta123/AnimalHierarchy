/*
 *  The Birds class is an abstract subclass of the Animal class.
 *  This class represents birds and introduces attributes and behaviors specific to birds.
 */
public abstract class Birds extends Animal {

	private int numOfFeathers;

	//Constructs a Bird.
	public Birds(String name, int age, String color,int numOfFeathers) {
		super(name, age, color);
		this.numOfFeathers=numOfFeathers;
	}

	//Returns a string representation of the bird, including the number of feathers.
	public String toString() {


		return super.toString() + ", Num of feathers: "+numOfFeathers;
	}

	// Abstract method defining how the mammal eats.
	public abstract void eat(); 

	// Abstract method defining how the mammal sleeps.
	public abstract void sleep();

	//* Checks the number of feathers the bird has.
	public int getNumOfFeathers() {
		return numOfFeathers;
	}

	// Sets the number of feathers for the bird.
	public void setNumOfFeathers(int numOfFeathers) {
		if(numOfFeathers>0)
			this.numOfFeathers=numOfFeathers;

	}

	//Prints a message indicating that the bird is flying.
	public abstract void fly();

}
