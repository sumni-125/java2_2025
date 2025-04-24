package day1prac.정렬;

//Acorn크ㅜㄹ래스 -> Acorn 객체를 만드는 설계

//public  class Acorn extends Object

public class Acorn implements Comparable {
	String id;
	String name;
	int point;
	
	
	public Acorn(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
	public Acorn() {
		// TODO Auto-generated constructor stub
	}
	@Override//비교대상 객체
	public int compareTo(Object o) {//나 자신과 other 객체
		// TODO Auto-generated method stub //양수, 음수, 0, 양수가 전달되면 라이브러리에서 정렬수행함
		
		Acorn acornOther = (Acorn)o;
		return this.point - acornOther.point;//기준-비교대상(기준이양수가 가면)
	}
}
