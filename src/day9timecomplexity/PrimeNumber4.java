package day9timecomplexity;

public class PrimeNumber4 {

	public static void main(String[] args) {
		int n=97;
		int flag=0;
		int loopCounter=0;
		for(int i=2;i<=Math.sqrt(n);i++)
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
								//n=100
//T(n)=  O(n)					100			
//T(n) = O(n-2)					98
//T(n) = O(n/2)					50
//T(n) = O(sqrt(n)-1)			9
//faster
