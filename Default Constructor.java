package chap08;

class Decaf{
	Decaf(){System.out.print("디카페인 ");} // 매개변수가 없다.
}

class Coffee extends Decaf{
	Coffee(String coffeeType){ System.out.println(coffeeType);}
	// 원래는 상속을 하면 부모클래스의 생성자를 호출해야하지만 아무것도 없기때문에 따로 넣지 않아도 디폴트 생성자가 자동으로 생성된다.  
}

public class StarBucks extends Coffee {
	StarBucks() {
		super("아메리카노");   // Coffee생성자에 아메리카노를 넣는다. 이때 자연스럽게 디카페인 클래스의 내용도 상속을 받아 같이 출력된다.
		new Coffee("카페라떼");
	}

	public static void main(String[] args) {
		new StarBucks();  // 스타벅스 생성자를 호출한다.
	}
}