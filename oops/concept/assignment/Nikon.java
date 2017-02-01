package oops.concept.assignment;

public class Nikon implements Camera {
	
	private final int ISO=2001;
	
	
	public int getISO() {
		return ISO;
	}

	@Override
	public void snap() {
		System.out.println("Nikon is taking picture");
	}

	@Override
	public void print() {
		System.out.println("Nikon is printing picture");
	}

	@Override
	public void flash() {
		System.out.println("Nikon flash going off");
		
	}

}
