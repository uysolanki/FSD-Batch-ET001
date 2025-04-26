package day10string;

public class RemoveAdjacentDuplicateElementsFromString {

	public static void main(String[] args) {
		
		//remove duplicate adjacent elements
		String name="apple";
												//syntax  logic
		for(char c:name.toCharArray())
		{
			if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				System.out.print(c);
			}
		}
	}
}