import java.util.Scanner;

public class UnOperator {

	public static void main(String[] args) {
		//단항 연산자 単項
		//부호 ! - ++ --
		//a와b를 더합니다 
		
		int i,j;
		
		i = 0;
		i += 1;
		System.out.println(i);
		
		i = 0;
		i = i++;
		System.out.println(i);
		
		i = 0;
		i = ++i;
		System.out.println(i);
		
		i = 0;
		j = ++i;
		System.out.println("i = " + i + ",j =" +j  );
		
		i = 0;
		j = i++;
		System.out.println("i = " +i+ ",j =" +j );
		
		
		i = 0;
		j = ++i + ++i + ++i;
		System.out.println("i = " + i + ",j =" +j  );
		
		i = 0;
		j = i++ + i++ + i++;
		System.out.println("i = " +i+ ",j =" +j );
	}

}
