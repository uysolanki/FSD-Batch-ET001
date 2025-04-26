package day10string;

public class StringDemo2 {

	public static void main(String[] args) {
		
		//display vowels chars from a string
		String name="fullstack";
		
		//scope of variable , life of a variable
//		for(int i=0;i<name.length();i++)			//i		name.charAt(i)
//		{											//0		a
//			
//		if(name.charAt(i)=='a' || name.charAt(i)=='e'|| name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u')
//		{
//			System.out.print(name.charAt(i));
//		}
//		}

	
		
		//enhanced for loop
		//"alice"   ==>  'a'  'l'  'i' 'c'  'e'
		for(char c:name.toCharArray())
		{
			if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				System.out.print(c);
			}
		}
	}
	
	
	

}
