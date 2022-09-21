package change_teacher_review.basic3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_TodayQ4 {
	
	static void solution( int votes[],int n1) { // 가변 길이 배열 입력 매개변수
		int [] count = new int[100];
		int max = 0;
		int maxn = 0;
		for(int i=0; i<votes.length; i++) {
			
			if(votes[i]==1) {
				count[0]++;				
			}else if(votes[i]==2) {
				count[1]++;
			}else if(votes[i]==3){
				count[2]++;
			}else if(votes[i]==4) {
				count[3]++;
			}else if(votes[i]==5) {
				count[4]++;
			}
		}	
			
			
			
		
		
		for(int i = 0; i<n1; i++) {
			for(int j=0;j<i; j++) {
				if(count[j]>count[j+1]) {
					max = count[i];
					maxn = i+1;
				}
			}
			System.out.printf("* %d번 후보가 %d표\n",(i+1),count[i]);
		}
		System.out.printf("이 경우 %d번 후보가 %d표로 가장 많은 표를 얻었습니다.\n",maxn,max);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=0;
		int n2=0;
		int [] votes = new int[100];
		
		System.out.println("후보의 수를 입력하세요.");
		n1= sc.nextInt();
		sc.nextLine();							// 엔터키 오류 방지

		System.out.println("투표할 인원의 수를 입력하세요.");
		n2= sc.nextInt();
		sc.nextLine();							// 엔터키 오류 방지
		System.out.println("투표결과를 입력하세요");
		String vot = sc.nextLine();

		for(int i = 0; i<n2; i++) {
			
			StringTokenizer score = new StringTokenizer(vot,",");		// /로 입력받은 갑 구분	
			for(int j=0; score.hasMoreTokens();j++) {
				String vot2 = score.nextToken();
				votes[j] = Integer.parseInt(vot2);			// 입력 받은 값들 votes에 저장				
			}	
		}
		
		
		System.out.printf("1번부터 %d 번까지 %d개의 후보가 있으며, 투표결과는 [",n1,n1);
		for(int i = 0; i<n2; i++) {
			if(i==0) {
			System.out.print(votes[i]);
			}else {
			 System.out.print(","+ votes[i]);
			}
		}
		System.out.println("] 입니다. 각 후보의 득표수는 다음과 같습니다.");
		solution(votes,n1);
		
	}

}
// 1,5,4,3,2,5,2,5,5,4
