package day19babstractionturfmgmt;

public class FootballTurf implements Turf
{
	@Override
	public double getHourlyPrice() {
		return 1000;
	}
	
	@Override
	public String getTurfName() {
		return "Football Turf";
	}
}
