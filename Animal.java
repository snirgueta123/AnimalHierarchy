/*An abstract class called animals which is the main parent  class in the inheritance tree where all the attributes
  and methods common to all animals will be defined
  This class provides methods for getting and setting these attributes,
  and defines two abstract methods `eat` and `sleep` that must be implemented by any subclass.*/

public abstract class Animal implements Cloneable {
	private String name;
	private int age;
	private String color;

	// Constructs an Animal.
	public Animal(String name,int age,String color) {
		this.name=name;
		this.age=age;
		this.color=color;
	}
	//  Gets the name of the animal.
	public String getName() {
		return name;
	}
	// Gets the age of the animal.
	public int getAge() {
		return age;
	}
	//Gets the color of the animal.
	public String getColor() {
		return color;
	}
	//Sets the name of the animal.
	public void setName(String name) {
		this.name=name;
	}
	//Sets the age of the animal. The age must be positive.
	public void setAge(int age) {
		if(age>0)
			this.age=age;
	}
	//Sets the color of the animal.
	public void setColor(String color) {
		this.color=color;
	}
	//Returns a string representation of the animal.
	public String toString() {
		return "Name:" + name +", Age:" + age+", Color:" + color  ;
	}

	public boolean equals(Object other) {
		Animal o = (Animal) other;
		return this.name.equals(o.name) && this.age == o.age &&  this.color.equals(o.color);

	}

	// Optional clone implementation
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // Default shallow clone
	}

	//Abstract method representing how the animal eats.
	public abstract void eat();

	// Abstract method representing how the animal sleeps.
	public abstract void sleep();

	abstract void performAction(); // Each animal will perform its specific actions

}
