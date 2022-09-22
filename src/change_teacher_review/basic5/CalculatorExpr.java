package change_teacher_review.basic5;

public class CalculatorExpr {
	
	
	private int n1;
	private int n2;

	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	void io(int n1,int n2) {
		this.n1= n1;
		this.n2=n2;
		System.out.printf("추출 된 값 : %d, %d\n",n1, n2);
	}
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
		// TODO Auto-generated method stub

	}

}
