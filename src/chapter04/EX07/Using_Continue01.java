package chapter04.EX07;

public class Using_Continue01 {

	public static void main(String[] args) {
/*
			for 이용 1~1000 1씩증가/ 3의배수 출력
			for 이용 1~1000 1씩증가/ 5의배수 출력
			for 이용 1~1000 1씩증가/ 3,5,7의배수 출력
*/	
/*		
		//for 이용 1~1000 1씩증가/ 3의배수 출력
		for(int i=1;i<=1000;i++) {	
				if(i%3==0) {
					System.out.printf("%d단 출력\n",i);
					for(int j=1; j<=1000; j++) {
						
						System.out.printf(" %d * %d = %d\n",i,j,i*j);
						
					}
					System.out.println("==================================================");
				}else{
						continue;
					}

		for(int i=1;i<=1000;i++) {
			if(i%3 ==0){
				System.out.printf("%d ",i);
				if(i%100==0) {
					System.out.println();
				}
			}else {
				continue;
			
		}		
			
		}
*/
/*		
		//for 이용 1~1000 1씩증가/ 5의배수 출력
		for(int i=1;i<=1000;i++) {	
			if(i%5==0) {
				System.out.printf("%d단 출력\n",i);
				for(int j=1; j<=1000; j++) {
					
					System.out.printf(" %d * %d = %d\n",i,j,i*j);
					
				}
				System.out.println("==================================================");
			}else{
					continue;
				}
		
		}
			
		for(int i=1;i<=1000;i++) {
			if(i%5 ==0){
				System.out.printf("%d ",i);
				if(i%100==0) {
					System.out.println();
				}
			}else {
				continue;
			}
		}
*/
/*		
		//for 이용 1~1000 1씩증가/ 3,5,7의배수 출력
		for(int i=1;i<=1000;i++) {	
			if((i%3==0) &&(i%5==0)&&(i%7==0)) {
				System.out.printf("%d단 출력\n",i);
				for(int j=1; j<=1000; j++) {
					
					System.out.printf(" %d * %d = %d\n",i,j,i*j);
					
				}
				System.out.println("==================================================");
			}else{
					continue;
				}
		}
*/		
/*		
		for(int i=1;i<=1000;i++) {
			if((i%3 ==0)||(i%5==0)||(i%7==0)){
				System.out.printf("%d ",i);
				if(i%100==0) {
					System.out.println();
				}
			}else {
				continue;
			
				}
			}
*/			
		
		for (int i = 0; i<5; i++) {	
			for(int k=0; k<5; k++) {
				if(k==3) {
					continue;
				}
				System.out.println(i+" ," + k);
				
			}
		}	
		System.out.println("==================================");
			out: for (int i = 0; i<5; i++) {	
				for(int k=0; k<5; k++) {
					if(k==3) {
						i = 100;						//	바깥쪽  for 문의 변수값 증대시켜 false 빠져나옴
						continue out;
					}
					System.out.println(i+" ," + k);				
				}
			}
	}
}


	
	
