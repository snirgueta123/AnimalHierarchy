
public class Owner implements Cloneable {

	private String name;
	private String number;

	//Constructor to initialize the name and phone number of the owner.
	public Owner(String name,String number) {
		this.name=(name!=null ) ? name : "unknown";
		this.number=(name!=null && name.length()==10 ) ?number : "----------";
	}

	//Performs a shallow copy of the Owner object.
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}



	//Returns the name of the owner, followed by a space.
	public String getNameOwner() {
		return name + " ";

	} 

	// Returns the phone number of the owner.
	public String getPhoneOwner() {
		return number ;

	}

	// Sets the owner's name if the provided name is not null.
	public void setNameOwner(String nameOwner) {
		if(nameOwner!=null )
			name=nameOwner;
	}

	// Sets the owner's phone number if it is not null and has exactly 10 characters.
	public void setPhoneOwner(String numberOwner) {
		if( numberOwner!=null && numberOwner.length()==10)
			number=numberOwner;

	}

}
