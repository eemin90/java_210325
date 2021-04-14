package p08.textbook.s080401;

import p08.textbook.s080205.RemoteControl;
import p08.textbook.s080301.Television;
import p08.textbook.s080303.Searchable;
import p08.textbook.s080303.SmartTelevision;
import p08.textbook.s080402.Audio;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null; // 인터페이스 변수 선언
		
		rc = new Television(); // Television 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		
		rc = new Audio(); // Audio 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new SmartTelevision(); // SmartTelevision 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.turnOff();
		
		Searchable s1 = new SmartTelevision(); // 인터페이스 변수 선언하고 SmartTelevision 객체를 인터페이스 타입에 대입
		s1.search("daum");
		
		System.out.println(rc instanceof RemoteControl);
		System.out.println(rc instanceof SmartTelevision);
		System.out.println(rc instanceof Searchable);
	}
}
