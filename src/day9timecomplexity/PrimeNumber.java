package day9timecomplexity;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=97;
		int counter=0;
		int loopCounter=0;
		for(int i=1;i<=n;i++)
		{
			loopCounter++;
			if(n%i==0)
				counter++;
		}
		
		if(counter==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
		System.out.println("LoopCounter "+loopCounter);

	}

}
//T(n) =  O(n)
