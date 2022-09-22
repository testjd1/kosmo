package change_teacher_review.basic4;
import java.util.Scanner;


public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count =0;
		while(true) {
		
		System.out.println("정수 1 입력");
		int n1 = sc.nextInt();
		System.out.println("정수 2 입력");
		int n2 = sc.nextInt();
		CalculatorExpr c = new CalculatorExpr();
		if(count>0) {
			c.io(n1, n2);	
		}
	
		c.getAddition(n1, n2);
		c.getSubtraction(n1, n2);
		c.getMultiplication(n1, n2);
		c.getDivision(n1, n2);
		count++;
		System.out.println("계속 하시겠습니까?(Y/N)");
		sc.nextLine();
		
		String ch = sc.nextLine();
		String ch2 = "Y";
		
		if(ch.equalsIgnoreCase(ch2)) {
			continue;
		}else {
			System.out.println("반복문을 종료합니다.");
			break;
		}	
		

	}
	}
}
