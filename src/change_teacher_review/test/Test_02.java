package change_teacher_review.test;
import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하시오. : ");
		int ip = sc.nextInt();
		b.Tobank(ip);
		
		System.out.println("출금할 금액을 입력하시오 : ");
		int op = sc.nextInt();
		b.Outbank(op);
		
		System.out.println(b.toString());
	}
	
}
