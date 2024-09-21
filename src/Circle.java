
	public class Circle {
		private double radius;
	    
	    
	    
	    public Circle(double radius) {
	        this.radius = radius;

	    }
	    
	    public double getRadius() {
	    	return this.radius;
	    }
	    
	    
	    public double calcArea() {
	    	double area;
	    	area = (Math.PI)*(Math.pow(this.radius,2));
	    	return area;
	    }
	    
	    public double calcPerimeter(){
	    	double perimeter;
	    	perimeter = (Math.PI)*this.radius*2;
	    	return perimeter;
	    }
	}


