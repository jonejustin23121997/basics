package while_important_programm;

public class number_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=141;
		int rev=0;
		int numberbackup=num;
		while (num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(numberbackup==rev)
		{
		System.out.println("p");
		}
		else{
			System.out.println("np");
		}


	}}


