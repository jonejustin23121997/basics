package inheritence;

  class acess_modifiers {
	 void q(){
		final int a=1;
		int b=2;
		 int c=a+b;
		 
		System.out.println("csk "+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ac3 ipl=new ac3();
ipl.q();
ipl.q2();
ipl.q2(1,2);


//reassigning can't happen



	}

}
class ac2 extends acess_modifiers{
	void q(){
		System.out.println("mi");
	}
	 void q2(){
		final int a=2;
		int b=2;
		int c=a+b;
		System.out.println("mi "+c);
	}
}
class ac3 extends ac2{
	 void q(){

		System.out.println("rcb");
		
			
		}
	 int q2(int a,int b){
		 int c=a+b;
		 System.out.println("mi vs csk");
		 return c;
	}
}