package change_teacher_review.test;

public class Bank {
	String je = "Jae-Dong-Kim";
	String number = "NH: 352-1220-4520-53";
	int jan;
	int ip;
	int op;
	
	@Override
	public String toString() {
		return "Bank [예금주 :" + je + ", 계좌 번호 :" + number + ", 잔액 : " + jan + "]";
	}
	Bank(){  	
	}
	public void Tobank(int ip){
		this.ip = ip;
		jan += ip;
		System.out.println("입금하신 금액은 : " + ip + "원 입니다.");
		
	}
	public void Outbank(int op) {
		this.op = op;
		int k = 0;
		k = (jan -= op);
		if(k<0) {
			System.out.println("잔액이 부족합니다.");
			jan +=op;		
		}else {
			System.out.println("인출하신 금액은 " + op + "원 입니다.");
		}
	}
}
