package day5Prac.애너테이션실습;

public class Food {
	String name;
	@MaxCalorie
	int cal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", cal=" + cal + "]";
	}
	public Food(String name, int cal) {
		this.name = name;
		this.cal = cal;
	}
	
	public Food() {
		// TODO Auto-generated constructor stub
	}
}
