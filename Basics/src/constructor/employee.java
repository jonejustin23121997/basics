package constructor;

public class employee {
	int emp_id;
	double salary;
	char grade;
	void m()
	{
		System.out.println("emp_id"+emp_id);
		System.out.println("salary"+salary);
		System.out.println("grade"+grade);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee john=new employee();
		employee jone=new employee();
	jone.m();
	john.m();
		

	}

}
