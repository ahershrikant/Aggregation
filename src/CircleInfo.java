
public class CircleInfo extends Radius{
	Radius r;
	double pi=3.14;
	
	public double area (int k) {
		r=new Radius();
		int rsq=r.radius(k);
		return pi*rsq;
		
	}

}
