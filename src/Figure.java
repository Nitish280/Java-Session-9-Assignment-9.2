
abstract class Figure {
	public abstract void area();

	public abstract void perimeter();
}

class Circle extends Figure {
	double dem1=6.4;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println (Math.PI * dem1 * dem1);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println (2 * Math.PI * dem1);
	}

}

class Rectangle extends Figure {
	double dem1=15.24; 
	int   dem2=5;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println( dem1 * dem2);
	}

	@Override
	public void perimeter() {
		System.out.println(2 * (dem1 + dem2));
	}

}

class Traingle extends Figure {
	double dem1=3.4;
	 int dem2=4;
	 int dem3=6;

	@Override
	public void area() {
		double s = (dem1 + dem2 + dem3) / 2;
		System.out.println (Math.sqrt(s * (s - dem1) * (s - dem2) * (s - dem3)));
	}
    @Override
	public void perimeter() {
		// TODO Auto-generated method stub
    	System.out.println( dem1 + dem2 + dem3);
	}

}

	