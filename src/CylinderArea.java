
public class CylinderArea {
	Num r;
	double pi=3.14;
	int h=2;
	
	 public double  area(int k) {
        r=new Num();
		double sq=r.num(k);
		return 2*(pi*sq*h)+2*(pi*sq*sq);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method s
		CylinderArea he=new CylinderArea();
		double rsq=he.area(3);
		System.out.println(rsq);

	}

}
