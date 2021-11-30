package AggreInfo;

public class Employe {
	int id;
	String name;
	Address address;
	
	public Employe(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
   void display() {
    	System.out.println(id+" "+name);
    	System.out.println(address.city+""+address.state+""+address.country);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address("umarkhed  ","maharashtra  ","India");
		Address add1=new Address("pune  ","maharashtra  ","India");
		Employe e=new Employe(111,"shri",add);
		Employe e1=new Employe(131,"Aditya",add1);
		e.display();
		e1.display();
	
		

	}

}
