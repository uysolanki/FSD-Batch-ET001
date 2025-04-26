package day9timecomplexity;

public class PrimeNumber3 {

	public static void main(String[] args) {
		int n=97;
		int flag=0;
		int loopCounter=0;
		for(int i=2;i<=n/2;i++)
		{
			loopCounter++;
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
		System.out.println("LoopCounter "+loopCounter);

	}
}

//T(n) =  O(n/2)
