
public class Rectangle {
	private int length;
    private int width;
    
    
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public int getLength() {
    	return this.length;
    }
    public int getWidth() {
    	return this.width;
    }
    
    public void draw() {
    	for (int i=0; i<this.width; i++) {
    	System.out.print(" _");
    }
    	System.out.println("");
    
    for (int k=0; k<this.length;k++) {
    	System.out.print("|");
    	for (int u=0; u<this.width*2;u++) {
        	System.out.print(" ");
        	//if (u==0)
        		
    	}
	System.out.println("|");
}
   	//System.out.println("");
    for (int y=0; y<this.width; y++) {
   	System.out.print(" -");
    }

}
    
    public void scale(int factor) {
    	this.width = this.width*factor;
    	this.length = this.length*factor;
    	
    }
    public int calcArea() {
    	int area;
    	area = this.width*this.length;
    	return area;
    }
    
    public int calcPerimeter(){
    	int perimeter;
    	perimeter = this.width*2 + this.length*2;
    	return perimeter;
    }
}
