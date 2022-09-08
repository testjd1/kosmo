package chapter07.EX01;

public class Using_Method06 {

	
	static int add ( int[] a) {
		// 들어오는 배열의 모든 값 더해서 return 값 돌려줌
		int sum =0 ;
		for(int i =0; i<a.length; i++) {
			 sum += a[i];
		}		
		
		return sum;				
	}
	/**/
	static int div ( int[] a) {
		// 들어오는 배열의 모든 값 빼서 return 값 돌려줌
		int sum =7 ;
		for(int i =0; i<a.length; i++) {
			if(i==0) {continue;}
			 sum -= a[i];
		}
		
		return sum;
		
	}
	
	static long mul ( int[] a) {
		// 들어오는 배열의 모든 값 곱해서 return 값 돌려줌
		long sum =1 ;
		for(int i =0; i<a.length; i++) {
			 sum *= a[i];
		}

		
		return sum;
	}
	
	static double avg ( int[] a) {
		// 들어오는 배열의 모든 값 평균 return 값 돌려줌
		double sum = 0 ;
		int count = 0;
		for(int i =0; i<a.length; i++) {
			 sum += a[i];
			 count++;
		}
		
		
		return sum/(double)count;
	}

	public static void main(String[] args) {
		// 1~100까지 7의배수만 저장 후 각 메소드 호출
		int [] b = new int[14];
			
		int count =0;
		System.out.print("배열 확인 : ");
		for(int i = 1; i<=100; i++) {
			if(i%7 == 0) {
				b[count] = i;
				System.out.print(b[count] + " ");
				count++;				
			}
			

		}
		System.out.println();

	
		int c = add(b);
		System.out.println("배열의 모든 값을 더한 값은 " +c + "입니다.");
		int d = div(b);
		System.out.println("배열의 모든 값을 뺀 값은 " +d + "입니다.");
		long e = mul(b);
		System.out.println("배열의 모든 값을 곱한 값은 " +e + "입니다.");
		double f = avg(b);
		System.out.println("배열의 모든 값의 평균 값은 " +f + "입니다.");


	}

}

