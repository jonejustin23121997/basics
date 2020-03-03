package mystring;

public class emailidvalidcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="jonejustin2312@gmail.com";
				if(email.contains("@") && (email.endsWith(".com")) && email.indexOf('@')>1)
			{
				System.out.println("valid");
			
			}
			else
			{
				System.out.println("invalid");
			}
			
			
			
		
	System.out.println(email.substring(email.indexOf("@")+1,email.lastIndexOf(".")));
		


	}

}
