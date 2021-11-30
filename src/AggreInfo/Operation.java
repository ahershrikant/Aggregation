package AggreInfo;

public class Operation {
	Info h;
	int b=12;
	public int num(int s) {
		h=new Info();
		int k=h.value(s);
		return b*k;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation p=new Operation();
		int e=p.num(45);
		System.out.println(e);

	}

}
