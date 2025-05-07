package day4.prac.실습;

public class Warrior implements Job {

   
	@Override
	public String use(String skillName1, String skillName2) {
		return "전사가 " + skillName1 + "와 " + skillName2;
	}
    

//    public static void main(String[] args) {
//        Warrior w = new Warrior();
//        w.use("검던지기", "도끼던지기"); 
//    }



	
}
