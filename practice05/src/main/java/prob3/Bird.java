package prob3;

public abstract class Bird {
	
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void fly();
	abstract void sing();
	public abstract String toString();
}