package change_teacher_review.basic5;

import java.util.Scanner;

public class Ex01_Class {
	
	
	int n1;
	int n2;

	
	void getAddition(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
		System.out.printf("(%d) + (%d) = %d\n",n1,n2,(n1 + n2));
	}
	void getSubtraction(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
		System.out.printf("(%d) - (%d) = %d\n",n1,n2,(n1 - n2));
	}	
	void getMultiplication(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
		System.out.printf("(%d) * (%d) = %d\n",n1,n2,(n1 *n2));
	}
	void getDivision(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
		System.out.printf("(%d) / (%d) = %.2f\n",n1,n2,(double)(n1 / n2));

	}
			
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
		System.out.println("정수 1 입력");
		int n1 = sc.nextInt();
		System.out.println("정수 2 입력");
		int n2 = sc.nextInt();
		Ex01_Class c = new Ex01_Class();
		c.getAddition(n1, n2);
		c.getSubtraction(n1, n2);
		c.getMultiplication(n1, n2);
		c.getDivision(n1, n2);
		
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
