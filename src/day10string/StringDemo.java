package day10string;

public class StringDemo {

	public static void main(String[] args) {
		
//		//display vowels chars from a string
//		String name="alice";
//		
//		//scope of variable , life of a variable
//		for(int i=0;i<name.length();i++)			//i		name.charAt(i)
//		{											//0		a
//			
//		if(name.charAt(i)=='a' || name.charAt(i)=='e'|| name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u')
//		{
//			System.out.print(name.charAt(i));
//		}
//		}
//
//		
//		
//		int arr[]= {123,456,450};   //actually also interested in the position of the element
//		int sum=0;
//		int j;
//		for(j=0;j<arr.length;j++)
//		{
//			sum=sum+arr[j]; //sum+=arr[i];
//		}
//		System.out.println(sum);
//		
//		
//		//enhanced for loop  forEach loop
//		int sum1=0;
//		for(int n:arr)									//n
//			sum1+=n;									//10
//			System.out.println(sum1);	
			
			
//		//sum of digit
//			int n2=123;
//			int sum2=0;
//			
//			while(n2>0)
//			{
//				int r=n2%10;
//				sum2+=r;
//				n2=n2/10;
//			}
//			System.out.println(sum2);
//			
			
			int arr3[]= {123,456,450};
			for (int i = 0; i < arr3.length; i++) 
			{
				int n2=arr3[i];
				int sum2=0;
				
				while(n2>0)
				{
					int r=n2%10;
					sum2+=r;
					n2=n2/10;
				}
				System.out.println(String.format("sum of number %d is %d",(i+1),sum2));
			}
			}
	
	
	//sum of number 1 is 6
	//sum of number 2 is 15
	//sum of number 3 is 9
	
	
	

}
