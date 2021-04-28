package p15.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class A06Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(9);
		queue.offer(6);
		queue.offer(3);
		
		int first = queue.poll();
		System.out.println(first);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll()); // 비어있는 경우 Null
		
		queue.offer(30);
		queue.offer(10);
		queue.offer(20);
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}
}
