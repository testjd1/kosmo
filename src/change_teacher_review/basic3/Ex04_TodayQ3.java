package change_teacher_review.basic3;

import java.util.Scanner;

public class Ex04_TodayQ3 {
		
	static void multiple(){		
	}
	static	void multiple(int a, int b){
		System.out.println(a*b);
	}
		
	static void multiple(int a, char b){
		for(int i=0; i<a; i++) {
			System.out.print(b);
		}
		System.out.println();
	}
	static void multiple(int a, int b, char c){
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
		
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력");
		char c = sc.next().charAt(0);
		System.out.println("숫자 입력1");
		int n1 = sc.nextInt();
		System.out.println("숫자 입력2");
		int n2 = sc.nextInt();
		System.out.println("=======(1)번 출력================");
		multiple(n1,n2);
		System.out.println("=======(2)번 출력================");
		multiple(n1,c);
		System.out.println("=======(3)번 출력================");
		multiple(n1,n2,c);
		
		
		
		
		
	}

}
