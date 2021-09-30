import java.util.Scanner;

public class RelOperator {

	public static void main(String[] args) {
		int i, j;
		//관계 연산자 수와 수 연산 결과는 !!!!!!논리값!!!!!!!
		//== != >
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 점수 입력");
		i = scn.nextInt();
		System.out.println("두 번째 점수 입력");
		j = scn.nextInt();
		
		System.out.println(i + "==" + j + " => " +(i==j));
		System.out.println(i + "!=" + j + " => " +(i!=j));
		System.out.println(i + ">" + j + " => " +(i>j));
		System.out.println(i + ">=" + j + " => " +(i>=j));
		System.out.println(i + "<" + j + " => " +(i<j));
		System.out.println(i + "<=" + j + " => " +(i<=j));
	}

}
