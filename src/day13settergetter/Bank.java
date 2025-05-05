package day13settergetter;

public class Bank {

	public String username;   //instance variable
	private String password;  //instance variable
	private int atmpin;       //instance variable
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAtmpin() 
	{
		return atmpin;
	}
	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}
	
	
	
}
