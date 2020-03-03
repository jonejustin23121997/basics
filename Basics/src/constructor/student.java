package constructor;

public class student {
	int rollno;
	double total;
	char grade;
	student(int rollno,double total,char grade)
	{
		this.rollno =rollno;
		this.total=total;
		this.grade=grade;
	}
	void m()
	{
		System.out.println("rollno"+rollno);
		System.out.println("total"+total);
		System.out.println("grade"+grade);
		
	}
	
		
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student jone=new student(1,95,'A');
		student john=new student(1,98,'B');
		jone.m();
		john.m();
				
				
	}

}
