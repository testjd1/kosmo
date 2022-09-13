package chapter07.EX04;

import java.util.Scanner;

class Converter{ //환율 계산 클래스
	// 1. 필드 생성
	double rate; 		// 환율 저장
	
	
	// 2. 메소드 생성 ( 달러 받아서 원화 반환 ) 메소드 이름 : toKWR()
	
	
	double toKWR(double dollor){
		return dollor * rate;
	}
	/*
	double toKWR(double rate) {
		this.rate = rate;
		return rate * 0.000726;
	}
	*/

	// 3. 메소드 생성 ( 달러 받아서 원화 반환 ) 메소드 이름 : toDoller()
	
	double toDollor(double won){
		return won/rate;
	}	
	 
	/*
	double toDollor(double rate) {
		this.rate = rate;
		return 1377.5 * rate;
	}
	 */
	// 4.  setRate() 사용하여 rate 필드 값 할당
	
	
	public double getRate() {
		rate = 1375*rate;
		return rate;
	}


	public void setRate(double rate) {
		
		this.rate = rate;
	}
	
	
	
	
	
	
	
}


public class Converter_Test {

	public static void main(String[] args) {
		// 객체 생성 후 스캐너로 환률 인풋 받아  setRate()에 저장후 
		// 원화 100W -> ?$    /   726
		// $100 -> ?W           137750
		/*
		Scanner sc = new Scanner(System.in);
		
		double w = 0;
		double d = 0;
		
		Converter c = new Converter();
		System.out.println("돈을 입력하세요.(W)");

		w = sc.nextInt();
		d = c.toKWR(w);
		
		System.out.printf(" %.2f원은 %.2f $입니다.\n",w,d);
		
		System.out.println("돈을 입력하세요.($)");
		d = sc.nextDouble();
		w = c.toDollor(d);
		System.out.printf(" %.2f$은 %.2f W입니다.\n",d,w);
		
		
		Converter ab = new Converter();
		
		d= 100;
		ab.setRate(d);
		System.out.println(d + "$는" + ab.getRate() + "W 원입니다.");
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1달러에 대한 오늘 환율을 입력하세요");
		double rate = sc.nextDouble();
		
		// 객체 생성
		Converter converter = new Converter();		// 기본 생성자 호출
		
		// 스캐너로 받은 rate 변수의 값 setter 주입
		converter.setRate(rate);
		
		// 100만원  -> ?$
		
		System.out.println("원화 100만원은 "+converter.toDollor(1000000) + " $입니다.");
		
		// 100 $ -> ? W
		System.out.println("달러 100$는 " + converter.toKWR(100) + "만원 입니다.");
		
		// 1. printf() 이용
		System.out.println("== 소수 2째 자리까지 잘라서 출력 ==");
		System.out.printf("원화 100만원은 %.2f $입니다.\n",converter.toDollor(1000000));
		System.out.printf("100$는 %.2f 원입니다.\n",converter.toKWR(100));
		
		// 2. 변수에 더블 값을 할당 후 소숫점 2자리 까지 변환해서 출력
		System.out.println("=============예시 =============");
		double per2 = 3.141592;
		// String으로 변환 후 per2 의 변수의 값을 소숫점 2자리까지 출력 후 다시 더블형으로 변환
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		System.out.println("=========================================");
		double d2 = converter.toDollor(1000000);
		double d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println("100만원은 " +d1 + "$ 입니다.");
		
		double d4 = converter.toKWR(100);
		double d3 = Double.parseDouble(String.format("%.2f",d4));
		System.out.println("100$ 는 " + d3 + "원 입니다.");
		
	}

}
