package chapter02;

public class ConsolOutPut03 {
	public static void main(String[] args) {
/*	//System.out.println();
	System.out.println("안녕 하세요");
	System.out.println("안녕"+"하세요"); 	// 문자+문자 : 문자열 <연결 연산자>
	System.out.println(2+4); 			// 정수+정수 : 정수 <계산 연산자>
	System.out.println(2+"4"); 			// 정수+문자 : 문자취급, 연결
	System.out.println("문자"+1); 		// 문자+정수 : 문자취급, 연결
	System.out.println("문자"+1+3);		// 문자+정수+정수: 문자취급, 연결
	System.out.println(1+3+ "문자");		// 정수+정수+문자: 정수값은 계산 후 문자취급, 연결
	System.out.println();
	System.out.println();
	
	int a = 5;
	String b = "하세요";
	int c = 7;
	System.out.println(a);
	System.out.println(b);
	System.out.println("안녕"+b); 		// 안녕하세요
	System.out.println(a+b);			// 5하세요
	System.out.println(a+c);			// 12
	System.out.println(a+"안녕"+b);		// 5안녕하세요
*/	
	
	
	
	//System.out.print();
/*		
	System.out.print("반갑");			// 반갑
	System.out.print("습니다");			// 반갑습니다
	System.out.print(7);				// 반갑습니다7
	System.out.print(5+3);				// 반갑습니다78
	System.out.print("\n");
	System.out.print("\n");
*/
	//System.out.printf();
	
		int d = 45;
	String e = "화요일";
	String f = "남자";
	System.out.println("당신의 나이는 "+d+"세이고, 오늘은 "
	+ e +"이며, 당신은 "+f+"입니다." );
	System.out.printf("당신의 나이는 %d이고, 오늘은 %s이며,"
			+ " 당신은 %s입니다.\n",d,e,f);
		
	int g = 100;
	String h = "일요일";
	String i = "여자";
	
	//여자는 평균 나이가 100살이 될 것입니다. 평균적으로 일요일에 많이 태어났습니다.
	
	System.out.println(i+"는 평균 나이가 "+g+"살이 될 것입니다. 평균적으로 "+
	h + "에 많이 태어났습니다.");
	System.out.printf("%s는 평균 나이가 %d살이 될 것입니다. 평균적으로 %s에"
			+" 많이 태어났습니다.",i,g,h);
	
	
	
	}
}
