package AggreInfo;

public class StudentInfo {
	RollNum n;
	String name="shrikant Suresh Aher";
	long no=98765434;
	int Class=12;
	int fee=210;
	
	public int  rollnum(int k) {
		n=new RollNum();
		int m=n.rnum(k);
		return m;
	}
	

	
	void display() {
		System.out.println("Name:"+name+"\n"+"Phone No:"+no+"\n"+"class:"+Class+"\n"+"Fee:"+fee);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		StudentInfo i=new StudentInfo();
		int j=i.rollnum(19);
		System.out.println(j);
		i.display();
		

	}

}
