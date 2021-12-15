package week10;

class Animal{
	public void sound() {
		System.out.println("동물이 소리를 냅니다. ");
	}
	
	public void move() {
		System.out.println("움직입니다.");
	}
	
}

class Dog extends Animal{
	public void sound() {
		System.out.println("멍멍 ");
	}
	public void move1() {
		System.out.println("움직입니다.");
	}
}


class Cat extends Animal{
	public void sound() {
		System.out.println("야옹야옹 ");
	}
	public void move2() {
		System.out.println("움직입니다.");
	}
}
 public class PQR {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		a.sound();
		b.sound();
		Dog c = (Dog)a;
		c.move1();
		
		int sum = 0;
		for(int i = 0; i <= 4; i++) {
			sum += i;
		}
		
		double avg = (double)sum / 4;
		System.out.println(avg);
		
	}
}

