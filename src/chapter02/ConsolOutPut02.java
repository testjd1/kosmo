package chapter02;

public class ConsolOutPut02 {
	public static void main(String[] args) {
		// printf 
		// %d :정수 값
		// %o : 8진수
		// %x : 16진수
		// %s : 문자열
		// %f : 실수
		// %4.2f : 소수점이하 2자리 + 전체 네자리

		System.out.printf("%d살 입니다.\n",30);
		System.out.printf("%o : 8진수 출력 \n",30);
		System.out.printf("%x : 16진수 출력 \n",30);
		System.out.printf("%s : 문자열 출력\n","목요일 입니다");
		System.out.printf("%f : 실수 출력\n",5.8);
		System.out.printf("%4.2f : 실수 출력\n",5.8);
		
		System.out.printf("당신의 나이는 %d이고, 몸무게는 %f입니다.\n",35,70.5);
		System.out.printf("%d, %f, %s\n",10,30.2,"나이");
	}
}
