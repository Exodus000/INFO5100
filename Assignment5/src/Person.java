import javax.print.attribute.standard.RequestingUserName;

class Person implements Comparable {
	private String firstName;
	private String lastName;

	public Person() {
		super();
	}

	public Person(String s, String t) {
		this.firstName = s;
		this.lastName = t;
	}

	// set name
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		int d = getFirstName().compareTo(p.getFirstName());
		if (d == 0)
			d = getLastName().compareTo(p.getLastName());
		return d;
	}

	@Override
	public boolean equals(Object o) {
		Person p = (Person) o;
		if (firstName == p.firstName && lastName == p.lastName) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode();
	}

	@Override
	public String toString() {
		return "FirstName: " + this.firstName + " LastName: " + this.lastName;
	}

	// main is not needed for a class.
	public static void main(String[] args) {

	}

}
