package p08.textbook.s080402;

import p08.textbook.s080205.RemoteControl;
import p08.textbook.s080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOff();
		rc.setMute(true);
	}
}
