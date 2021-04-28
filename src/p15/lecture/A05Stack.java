package p15.lecture;

import java.util.Stack;

public class A05Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3); // 스택에 넣음
		stack.push(5);
		stack.push(6);
		
		int last = stack.pop(); // 스택의 맨 위 객체를 가져오면서 스택에서 제거
		System.out.println(last);
		
		last = stack.pop();
		System.out.println(last);
		
		last = stack.pop();
		System.out.println(last);
		
//		last = stack.pop(); // 비어있는 경우 Exception 발생
//		System.out.println(last);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		last = stack.peek(); // 스택의 맨 위 객체를 가져옴
		System.out.println(last);
		
		last = stack.peek();
		System.out.println(last);
	}
}
