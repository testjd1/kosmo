package change_teacher_review.test;
class Parent{
	final String field = "부모님꺼";
	final public void jib() {
		System.out.println("부모님이 만든거");
	}
}
class Child extends Parent{
	Child(){
	//	field = "내꺼";
	}
//	public void jib() {
//		System.out.println("내가 날림");
//	}
}
public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
	}
}
