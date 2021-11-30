
public class Trapezium {
	Hight hg;
	int base1=3;
	int base2=4;
	
	
	public int area(int j){
		hg=new Hight();
		int hgt=hg.hight(j);
		return (base1+base2)*hgt/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trapezium f=new Trapezium();
		int t=f.area(6);
		System.out.println(t);

	}

}
