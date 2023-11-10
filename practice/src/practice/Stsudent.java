package practice;

public class Stsudent {
   
	String name;
	

	public Stsudent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stsudent [name=" + name + "]";
	}
	
}
