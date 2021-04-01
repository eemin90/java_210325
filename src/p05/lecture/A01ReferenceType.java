package p05.lecture;

import java.util.Scanner;

public class A01ReferenceType {
	public static void main(String[] args) {
		// 자료형 (2가지)
		// 1. 기본타입(원시타입) primitive type
		//    byte, short, char, int, long, float, double, boolean
		
		// 2. 참조타입 reference type
		//    기본타입 외 모두
		
		// 차이점
		// 기본타입은 데이터를 저장
		// 참조타입은 데이터를 저장한 객체의 참조를 저장
		
		// 예제
		int i; // 4byte 크기의 공간 할당
		i = 3; // 할당된 4byte 크기의 공간에 3이란 데이터를 저장
		
		// 예제(참조타입)
		Scanner scanner; // 공간 할당
		scanner = new Scanner(System.in); // 할당된 공간에 = 객체의 참조(주소값)를 저장
	}
}
