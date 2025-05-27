package day19babstractionturfmgmt;

public class CricketTurf implements Turf
{

	@Override
	public double getHourlyPrice() {
		return 800;
	}
   
	@Override
	public String getTurfName() {
		return "Cricket Turf";
	}
}
