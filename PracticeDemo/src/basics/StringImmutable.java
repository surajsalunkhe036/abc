package basics;

public class StringImmutable {

	public static void main(String[] args) {
		
		
		String abc1="aa";
		String abc2="pqr";
	
		System.out.println(" "+abc1);
		System.out.println(" "+abc2);

		
		StringBuffer bff1=new StringBuffer("aaa");
		StringBuffer bff2=new StringBuffer("fff");
		
		abc1=abc1+abc2;
		
		System.out.println(" "+bff1);
		
	}
}
