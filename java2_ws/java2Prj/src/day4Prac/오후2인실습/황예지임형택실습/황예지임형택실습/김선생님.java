package 황예지임형택실습;

public class 김선생님 implements Teach {

	@Override
	public String teach(String subject) {
		System.out.println("김선생님 수업듣기");
		return subject;
	}

	@Override
	public void 국어수업듣기() {
		System.out.println("김선생님 수업듣기");
		
	}

	@Override
	public void 영어수업듣기() {
		System.out.println("김선생님 수업듣기");
		
	}

	@Override
	public void 수학수업듣기() {
		System.out.println("김선생님 수업듣기");
		
	}

}
