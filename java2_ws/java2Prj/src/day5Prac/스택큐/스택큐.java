package day5Prac.스택큐;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class 스택큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스택, 큐 => 자료구조	(데이터를 어떻게 저장할 것이냐에 대한 문제)
		//저장하는 방법, 꺼내는 방법
		
		//스택: 바닥이 막힌 통(먼저 들어간 데이터가 가장 마지막에 나옴) 1 2 3 -> 3 2 1
		//큐: 대기실(먼저 들어간 것이 먼저 나옴) 1 2 3 => 1 2 3
		
		Stack<String> st = new Stack<>();//
		
		//저장하기 push
		
		st.push("1");
		st.push("2");
		st.push("3");
		
		System.out.println("---스택---");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		//큐에 저장하기 offer
		Queue<String> q = new ArrayDeque<>();
		
		q.offer("1");
		q.offer("2");
		q.offer("3");
		System.out.println("---큐---");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

}
