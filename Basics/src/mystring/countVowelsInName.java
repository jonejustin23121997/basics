package mystring;

public class countVowelsInName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="payilagam";
		char c[]=new char[s.length()];
		char d[]={'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
		if(c[i]==d[j])
		{
			count=count+1;
						
		}
					
		}
		}System.out.println(count);
	}

}
