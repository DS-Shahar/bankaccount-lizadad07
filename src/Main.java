import java.util.*;
class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        BankAccount acctLisa = new BankAccount(1000, -1000, "Lisa");
        BankAccount acctBob = new BankAccount(1000, -1000, "Bob");
        
//        System.out.println("Balance Lisa=" + acctLisa.getBalance());
//        System.out.println("Balance Bob=" + acctBob.getBalance());
//        acctLisa.transfer(acctBob, 500); // Lisa transfered to Bob 500
//        System.out.println("Balance Bob after the first transfer =" + acctBob.getBalance());
//        System.out.println("Balance Lisa after the first transfer=" + acctLisa.getBalance());
//        
//        acctBob.transfer(acctLisa,1600); // Bob transfered to Lisa 1600
//        System.out.println("Balance Lisa after the second transfer=" + acctLisa.getBalance());
//        System.out.println("Balance Bob after the second transfer=" + acctBob.getBalance());
        //System.out.println(acctLisa.toString());
        
        // Bob can transform 1600 to lisa, but lisa can't transform 1600 to Bob.
        //---------------------------------------------------------------------------
        
        Rectangle rect1 = new Rectangle(5, 5);
    	Rectangle rect2 = new Rectangle(5, 15);
    	//rect1.scale(2);
    	//rect1.draw();
//    	int areaOfRect1 = rect1.calcArea();
//    	int areaOfRect2 = rect2.calcArea();
    	
    	//int perimeterOfRect1 = rect1.calcPerimeter();
    	//int perimeterOfRect2 = rect2.calcPerimeter();
//    	System.out.println("The sum of the areas of rect1 and rect2: " + (areaOfRect1 + areaOfRect2));
//    	System.out.println("The sum of the perimeters of rect1 and rect2: " + (perimeterOfRect1 + perimeterOfRect2));
    	//------------------------------------------------------------------------------
    	Circle cir1 = new Circle(4);
    	Circle cir2 = new Circle(6);
    	System.out.println("The area of Circle1 is: " + cir1.calcArea());
    	System.out.println("The perimeter of Circle1 is: " + cir1.calcPerimeter());
    	
    	System.out.println("The area of Circle2 is: " + cir2.calcArea());
    	System.out.println("The perimeter of Circle2 is: " + cir2.calcPerimeter());
        
    }
}
