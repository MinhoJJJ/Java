package chap08;

public class Builder {

	public static void main(String[] args) {
		StringBuilder coffee=new StringBuilder("Aspreso");
		String coffee2="Americano";
		String coffee3="CafeLatte";


		coffee.append(" Double");                // 스트링 빌더는 append()로 추가한다.
		coffee2=coffee2.concat(" Double");       // 기존 문자열에 concat()함수를 사용하였다.
		coffee3=coffee3+" Double";               // 기존 문자열에 +를 해서 붙여주었다.

		System.out.println(coffee);
		System.out.println(coffee2);
		System.out.println(coffee3);
		//속도는 StringBuilder - + - concat()순으로 빠르다.
	}
}
