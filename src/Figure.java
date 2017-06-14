/* creating the abstract class */
abstract class Figure {
	/* creating the abstract method of two different type */
	public abstract void area();

	public abstract void perimeter();
}
/*here extending the class with the parent Class */
class Circle extends Figure {
	double dem1=6.4;
/* here override the method */
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println (Math.PI * dem1 * dem1);
	}
/* here override the method */
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println (2 * Math.PI * dem1);
	}

}
/*here extending the class with the parent Class */
class Rectangle extends Figure {
	double dem1=15.24; 
	int   dem2=5;
/* here override the method */
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println( dem1 * dem2);
	}
/* here override the method */
	@Override
	public void perimeter() {
		System.out.println(2 * (dem1 + dem2));
	}

}
/*here extending the class with the parent Class */
class Traingle extends Figure {
	double dem1=3.4;
	 int dem2=4;
	 int dem3=6;
/* here override the method *
	@Override
	public void area() {
	/* calculation */
		double s = (dem1 + dem2 + dem3) / 2;
		System.out.println (Math.sqrt(s * (s - dem1) * (s - dem2) * (s - dem3)));
	}
/* here override the method */
    @Override
	public void perimeter() {
		// TODO Auto-generated method stub
    	System.out.println( dem1 + dem2 + dem3);
	}

}

	
