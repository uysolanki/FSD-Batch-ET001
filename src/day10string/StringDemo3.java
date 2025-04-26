package day10string;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="abbaca";
		String newStr=removeDuplicates(str);
		System.out.println(newStr);
	}

	private static String removeDuplicates(String str) {
		StringBuffer s1=new StringBuffer();
		
		for(char c:str.toCharArray())
		{                         //check the char at last index in s1
			if(s1.length()>0  && s1.charAt(s1.length()-1)==c)
			{
				s1.deleteCharAt(s1.length()-1);
			}
			else
			{
				s1.append(c);
			}
		}
		return s1.toString();
	}
}