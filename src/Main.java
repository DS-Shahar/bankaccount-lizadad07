package volcanoPro;
import java.util.Scanner;
class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        Volcano v1 = new Volcano("v1",10);
        
        int randomNum;
        for (int i=0; i<7; i++) {
        	randomNum = (int)(Math.random()*(2001));
        	v1.add(randomNum);
        	
        }
        v1.print();
        System.out.println();
        
        v1.delete(1);
        v1.print();
        System.out.println();
        
        
        v1.fix(3,900);
        v1.print();
        System.out.println();
        
        System.out.println(v1.average());
        System.out.println(v1.maxUnder(100));
        System.out.println(v1);
        
        
        
     
    }
}
