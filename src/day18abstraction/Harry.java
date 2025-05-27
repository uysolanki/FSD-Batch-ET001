package day18abstraction;

public abstract class Harry implements Husband
{
	@Override
	public void accomodation() {
		System.out.println("3 BHK");

	}

	@Override
	public void fooding() {
		System.out.println("Every Weekend");

	}
}
