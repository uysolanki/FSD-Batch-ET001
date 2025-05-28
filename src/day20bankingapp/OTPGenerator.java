package day20bankingapp;

import java.util.Random;

public class OTPGenerator {
public static int generateOTP()
{
	Random random=new Random();
	int otp=random.nextInt(900000)+100000;
	return otp;
}
}
