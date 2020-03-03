package mystring;

public class countofandinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jone="make hay while the sun shine and unity is diversity";
		String justin[]=jone.split(" ");
		int count=0;
		for(int i=0;i<justin.length;i++)
		{
		if(justin[i].equals("and"))
		{
			count=count+1;
		}
		
		}System.out.println(count);
	}

}
