package Strings;

public class ConvertUppertoLowerCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(convertuppertolowercharacter("Mohan"));
	}

	public static String convertuppertolowercharacter(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if( s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				int index=s.charAt(i)-'A';
				s1=s1+(char)('a'+index);
			
			}
			
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				
			{
				
					int index=s.charAt(i)-'a';
					s1=s1+(char)('A'+index);
				
				
			}
				
		}

		return s1;
		
	}
}
