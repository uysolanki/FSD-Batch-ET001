package day8scanner;

public class StringReverse {

	public static void main(String[] args) {
		String name="madam";
//		StringBuffer buffer=new StringBuffer(name);   without using predefined function
//		System.out.println(buffer.reverse());
		
//		String revName="";							//without using second string  m ma mad mada madam
		int loopCounter=0;
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			 loopCounter++;
//			revName=revName+name.charAt(i);
//		}
//		
//		System.out.println(revName);
//		if(name.compareTo(revName)==0)
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");
//		System.out.println("Number of Iteration "+loopCounter);
																					//j
			//T(n) = O(n)  Linear Time Complexity														//i     
																	//0     1    2    3
//		char[] str=name.toCharArray();								//D     E    M    O
//		int i=0;
//		int j=str.length-1;
//		
//		while(i<=j)
//		{
//			char temp=str[i];											//temp= 'A'
//			str[i]=str[j];
//			str[j]=temp;
//			i++;
//			j--;
//		}
//		
//		System.out.println(str);
		
		
		char[] str=name.toCharArray();
		int i=0;
		int j=str.length-1;
		int flag=0; //assuming Palindrome String
		while(i<=j)
		{
			 loopCounter++;
			if(str[i]!=str[j])
			{
				flag=1;   //flag being set to 1 means its not a palindrome
				break;
			}
			i++;
			j--;
		}
		
		if(flag==0)
			System.out.println("Palindrome!!!!!");
		else
			System.out.println("Not Palindrome!!!!!");
		
		System.out.println("Number of Iteration "+loopCounter);
		
		//T(n) = O(n/2)  //130000   65000x2
	    //Asymptotic Notation big O  //worst case		
	}

}


//mom
