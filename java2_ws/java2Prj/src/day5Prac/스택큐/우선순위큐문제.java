package day5Prac.스택큐;

import java.util.PriorityQueue;
import java.util.Queue;

class Game implements Comparable<Game> {
	String name;
	int price;

	public Game(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Game o) {
		// TODO Auto-generated method stub
		//return this.price-o.price;//기준이 클때 양수가 전달(기준이 클때 자리 교환이 일어남)
		return o.price-this.price;
	}

}

public class 우선순위큐문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Game> q = new PriorityQueue<Game>();
		
		q.offer(new Game("미칠듯재미있는게임",100000));
		q.offer(new Game("재미있는게임",20000));
		q.offer(new Game("그냥게임",2000));
		q.offer(new Game("미친게임",80000));
		q.offer(new Game("장난아닌게임",100));

		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

}
