package day19babstractionturfmgmt;

public class TennisTurf implements Turf
{
	@Override
	public double getHourlyPrice() {
		return 1500;
	}
	
	@Override
	public String getTurfName() {
		return "Tennis Turf";
	}
}
