package day18abstraction;

public class Tom implements Husband {

	@Override
	public void accomodation() {
		System.out.println("1 BHK");

	}

	@Override
	public void fooding() {
		System.out.println("Once in 14 Days");

	}

	@Override
	public void healthCare() {
		System.out.println("Local Family Dr");


	}

	@Override
	public void travel() {
		System.out.println("Once in a Year");


	}

	@Override
	public void clothing() {
		System.out.println("Festival/marriage");

	}

}
