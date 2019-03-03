package githubpractice;

public class Person {

	private String name;
	private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

    @Override
    public String toString() {
        return "The person's name is: " + getName() + "The person's address is: " +
                getAddress();
    }
}