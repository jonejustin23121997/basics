package mystring;

public class countVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jone="doing things right doing right things";
		char justin[]=new char[jone.length()];
		char jo[]={'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<jone.length();i++)
		{
			justin[i]=jone.charAt(i);
		}
			for(int i=0;i<justin.length;i++)
			{
				for(int j=0;j<jo.length;j++)
				{
					if(justin[i]==jo[j])
					{
						count=count+1;
					}
				}
			}System.out.println(count);
				
			
		
	}

}
