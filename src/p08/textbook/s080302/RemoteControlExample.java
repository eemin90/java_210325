package p08.textbook.s080302;

import p08.textbook.s080205.RemoteControl;
import p08.textbook.s080301.Audio;
import p08.textbook.s080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc; 		// 인터페이스의 타입 변수 선언
		rc = new Television();	// 구현 객체 대입
		rc = new Audio(); 		// 구현 객체 대입
	}
}
