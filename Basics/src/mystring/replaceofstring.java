package mystring;

public class replaceofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String jone="doing things right and doing right things";
 String justin[]=jone.split(" ");
  String search="and";
  String replace="@!#";
  for(int i=0;i<justin.length;i++)
  {
	  if(justin[i].equals(search))
	  {
		 justin[i]=replace;
  }
 
	
 
	

  }}
}
