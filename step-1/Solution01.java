package codesquad;

import java.util.*;

public class Solution01 {
	
	//왼쪽으로 밀어내는 메소드 
	static String leftshift(String str, int n) {
		String result = str.substring(n) + str.substring(0, n);
		return result;
	}
	
	//오른쪽으로 밀어내는 메소드 
	static String rightshift(String str, int n) {
		return leftshift(str, str.length() - n);
	}
	
	public static void main(String[] args) {
		
		//입력 받기 
		Scanner sc = new Scanner(System.in);
		System.out.println("단어 입력:");
		String text = sc.next();
		System.out.println("정수 입력:");
		int i = sc.nextInt();
		System.out.println("L 또는 R 입력:");
		String direction = sc.next();
		
		//방향 분기 
		if(direction.equalsIgnoreCase("L")) {
			System.out.println(leftshift(text, i));
		} else if(direction.equalsIgnoreCase("R")) {
			System.out.println(rightshift(text, i));
		} else {
			System.out.println("잘못 입력하였습니다");
		}
		
		
		//입력값 테스트
		System.out.println(text);
		System.out.println(i);
		System.out.println(direction);
		
	}

}
