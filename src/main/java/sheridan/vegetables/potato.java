package sheridan.vegetables;

public class Potato extends Vegitable{
	protected Potato (String type);
	
	public Potato(String name, String color) {
		super(name, color);
	}
	
	public boolean isTasty() {
		return false;
	}
}