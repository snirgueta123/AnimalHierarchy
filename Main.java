import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		//Section B.
		ArrayList<Animal> pets = new ArrayList<>();//A collection of animals that inhabit a pet boarding house.
		//Owner definition.
		Owner owner1=new Owner("snir","0509765876");
		Owner owner2=new Owner("eli","0509765876");
		Owner owner3=new Owner("meir","0509765876");
		Owner owner4=new Owner("did","0509765876");
		Owner clonedPerson = (Owner) owner1.clone();//owner duplication.
		//Setting up an animal with an owner.
		pets.add(new Dog("aa",12,"red",true,true,clonedPerson));
		pets.add(new Dog("aa",12,"red",true,true,clonedPerson));
		pets.add(new Cat("cc",7,"red",true,true,owner2));
		pets.add(new Cat("cc",7,"red",true,true,owner2));
		pets.add(new Parrot("gg",7,"red",54,true,clonedPerson));
		pets.add(new Parrot("gg",7,"red",54,true,clonedPerson));
		pets.add(new Cat("dd",12,"red",true,true,owner2));
		pets.add(new Parrot("ll",12,"red",44,true,owner4));
		pets.add(new Eagle("gg",7,"red",54,43));
		pets.add(new Eagle("gg",7,"red",54,43));
		pets.add(new Eagle("gg",7,"red",54,1));
		pets.add(new Dog("bb",9,"red",true,false,owner2));
		pets.add(new Dog("gg",9,"red",true,false,owner3));


		for (int i = 0; i < pets.size(); i++) {
			Animal currentPet = pets.get(i);//Store the current pet to avoid repetitive calls
			processAnimal(currentPet);
			for (int j = i + 1; j < pets.size(); j++) 
			{
				if (currentPet.equals(pets.get(j)))
					System.out.println("Duplicate pets found: " + currentPet);
			}
		}



		//Section C.
		Owner owner5=new Owner("David","0509765456");//Owner definition.
		Dog originalDog = new Dog("Ringo", 5, "Brown", true,true, owner5);//Create a dog with an owner.
		Dog clonedDog = (Dog) originalDog.clone();//Replicating an animal with an owner.

		//Shows the details of the animals before the change.
		System.out.println("Original Dog: " + originalDog);
		System.out.println("Cloned Dog: " + clonedDog);
		//Changing the cloned animal's owner details.
		clonedDog.getOwner().setNameOwner("yuli cohen");
		clonedDog.getOwner().setPhoneOwner("742776");



		// Shows the details of the animals after the change.
		System.out.println("Original Dog: " + originalDog);
		System.out.println("Cloned Dog: " + clonedDog);
	}


	public static void processAnimal(Animal currentPet) {
		currentPet.eat();
		currentPet.sleep();
		currentPet.performAction();// Polymorphism - let the specific animal handle its own behavior.
		System.out.println(currentPet.toString());
	}
}
