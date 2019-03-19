package basics;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="aba";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		
		System.out.println("Str :"+str);
		System.out.print("Str Reverce :"+rev);
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(" Is Pallendrom");
		}
		else
		{
			System.out.println(" Not Pallendrom");
		}
	}
	
}
