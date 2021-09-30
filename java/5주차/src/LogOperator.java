import java.util.Scanner;

public class LogOperator {

	public static void main(String[] args) {
		
		//論理演算子　論理値と論理値の演算　結果は論理値
		
		//右シフト演算子　よくわからん
		
		
		
		boolean i,j;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫 번째 논리값 입력");
		i = scn.nextBoolean();
		System.out.println("두 번째 논리값 입력");
		j = scn.nextBoolean();
		
		System.out.println(" !" + i + " => " +(!i));
		System.out.println(i + "&&" + j + " => " +(i&&j));
		System.out.println(i + "||" + j + " => " +(i||j));

	}

}
