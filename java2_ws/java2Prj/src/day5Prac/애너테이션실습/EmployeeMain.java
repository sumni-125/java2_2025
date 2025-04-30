package day5Prac.애너테이션실습;

import java.lang.reflect.Field;

public class EmployeeMain {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		Employee e = new Employee("이수민", "Monday");
		검증하기(e);

		Employee e2 = new Employee("이수민", "Thursday");
		검증하기(e2);

	}

	private static void 검증하기(Object obj) throws IllegalArgumentException, IllegalAccessException {

		// 클래스정보
		Class clazz = obj.getClass();

		Field[] fields = clazz.getDeclaredFields();

		for (Field item : fields) {

			// item => 필드객체

			// 애너테이션 값 가져오기

			WeekDaysAvail a = item.getAnnotation(WeekDaysAvail.class);
			
			if(a!=null) {
				String value = (String) item.get(obj);
				String[] days = a.value();	//{"M","F"}
				
				//확인
				
				boolean r = false;
				for(String day:days) {
					if(value.equals(day)) {
						r=true;
					}
				}
				
				if(r) {
					System.out.println("해당요일에쉴수있다");
				}else {
					System.out.println("해당요일에쉴수없다");
				}
				
			}
			
			
			
		}

	}
}
