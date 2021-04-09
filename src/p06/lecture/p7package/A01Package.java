package p06.lecture.p7package;

public class A01Package {
	// 클래스를 선언할 때 패키지를 명시할 수 있음
	// 클래스의 fullName 패키지.className
	
	// 이 클래스의 fullName: p06.lecture.p7package.A01Package
	
	// 패키지 명시: 파일 첫 줄 package 키워드 + 패키지 경로
	// 패키지 작명법: 대소문자, $, _, 숫자 조합
	//                숫자가 앞에 오면 안됨
	// 작명 관습: 회사마다 다름(lowerCamelCase, lower_snake_case)
	
	// A회사: ex1.test.Car
	// B회사: ex1.test.Car
	// 이름이 중복되는 문제를 피하기 위해 회사의 도메인을 패키지명에 포함
	
	// A회사: choongang.net --> net.choongang.ex1.test.Car
	// B회사: samsung.com --> com.samsung.ex1.test.Car
}
