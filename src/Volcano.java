package volcanoPro;
public class Volcano {
	private int count;
	private int size;
    private int [] degrees;
    private String name; 
    
    
    
    public Volcano( String name, int size) {
        this.degrees = new int [size];
        this.size = size;
        this.name = name;
        count=0;
    }
    public Volcano(Volcano v) {
        this.size = v.size;
        this.name = v.name;
        this.count=v.count;
        this.degrees = new int [size];
        
        for (int i=0; i<size; i++) {
        	this.degrees[i]=v.degrees[i];
        }
    }
    
    
    
    public String getName() {
    	return this.name;
    }
    public int getCount() {
    	return this.count;
    }

  
	public boolean add(int deg) {
        if (this.count < this.degrees.length) {
        	degrees[count]=deg;
        	this.count++;
        	return true;
        }
        return false;
    }
	
	public void delete(int index) {
		
		for (int i=index; i<count-1; i++) {
			degrees[i]=degrees[i+1];
			
		}
		count--;
		
    }
    public void deleteAll() {
		count=0;
    }
    public void fix(int index, int deg) {
	degrees[index]=deg;
	
     }
    public double average() {
    	double avg=0;
    	for (int i=0; i<count; i++) {
    		avg+=degrees[i];
			
		}
    	avg = avg/count;
    	return avg;
    	
       }
    
    public int maxUnder(int x) {
    	int maxUnderTemp = -1;
    	int indexMaxUnderTemp = 0;
    	for (int i=0; i<count; i++) {
    		if (maxUnderTemp<degrees[i] && degrees[i]<x) {
    			maxUnderTemp = degrees[i];
    			indexMaxUnderTemp = i;
    		}
		}
    	return indexMaxUnderTemp;
    	
    	
       }
    
	public void print() {
		
		for (int i=0; i<count; i++) {
			System.out.println(i+1 + ") " + degrees[i]);
		}
		
    }
    

	public String toString() {
        String s = "The count of the degrees: " + this.count;
        s+= ", The size or the arr: " + this.size;
        return s;
    }


}

