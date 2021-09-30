import java.util.Scanner;

public class Operater {

	public static void main(String[] args) {
		int i, j, k;
		//산술 연산자
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 점수 입력");
		i = scn.nextInt();
		System.out.println("두 번째 점수 입력");
		j = scn.nextInt();
		
		System.out.println(i + "+" + j + " = " +(i+j));
		System.out.println(i + "-" + j + " = " +(i-j));
		System.out.println(i + "X" + j + " = " +(i*j));
		System.out.println(i + "/" + j + " = " +(i/j));

	}

}
