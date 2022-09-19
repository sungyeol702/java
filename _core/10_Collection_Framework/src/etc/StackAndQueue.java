package etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {
		// stack 구조 : 책을 바닥부터 수직으로 쌓는 모양으로 데이터가 만드어지는 형태
		//후입선출 - Last In First Out : 마지막에 쌓인 데이터를 가장 먼저 꺼낼 수 있다
		//queue 구주 : 양쪽이 열려있는 파이프에 한 쪽에서 데이터를 밀어 넣는 형태
		//선입선출 - First In First out : 먼저 쌓은 데이터부터 꺼낼 수 있는 형태
		
		Stack<Integer> stack = new Stack();
		Queue<Integer> queue = new LinkedList<>();
		
		stack.push(123);
		stack.push(4567);
		stack.push(1245);
		stack.push(7878);
		System.out.println("Stack 구조");
		System.out.println(stack);
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
		queue.offer(2112);
		queue.offer(123);
		queue.offer(2342);
		queue.offer(562);
		System.out.println("Queue 구조");
		System.out.println(queue);
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
			
		}
	}

}
