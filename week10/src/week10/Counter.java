package week10;

public class Counter {
	 static int count = 0;
	    Counter() {
	        this.count++;
	        System.out.println(this.count);
	    }

	    public static void main(String[] args) {
	    	System.out.println(Math.PI);
	    	System.out.println(Math.random());
	        Counter c1 = new Counter();
	        Counter c2 = new Counter();
	        Counter c3 = new Counter();
	        
	        System.out.println(Counter.count);
	        print();
	    }
	    public static void print() {
	    	System.out.println("abcdef");
	    	System.out.println("12345");
	    }
}
