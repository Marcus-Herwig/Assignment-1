package assignment1;

public class Driver 
{
	public static void main(String[] args)
	{
		int count = 0; 
		String a = "Matthew";
		for(int i = a.length()-1; i >= 0 ; i--)
    	{
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' ||  a.charAt(i) == 'i' ||  a.charAt(i) == 'o' ||  a.charAt(i) == 'u')
			{
				count++;
			}
    	}
		System.out.println(count);
	}
}
