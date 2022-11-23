package chap08;

class Coffee {
	int price=2000;

	public class Americano {
		int caf=10;       // 아메리카노의 초기 카페인은 10이다.

		Americano(int caf){
			System.out.println(caf+this.caf);   // 아메리카노는 매개변수로 카페인을 추가할 수 있다.
		}
	}
	public Americano getAmericano() {return new Americano(10);}  // 아메리카노를 가져올 경우 카페인 10을 추가한다.
}

public class StarBucks extends Coffee {
	StarBucks() {
		Coffee typeA=new Coffee();   // A타입의 커피 객체를 만든다.
		typeA.getAmericano();        // coffee에서 getAmericanosm는 카페인 10을 추가한 아메리카노 객체를 만드는 메서드이다.

		Coffee.Americano typeB=new Americano(10);  // Coffee.Americano는 Americano형이다.
		//  따로 형변환을 해줄필요없이 typeB는 Americano 생성자를 만들수가 있다.

		Americano typeC=new Americano(10); // typeC는 Americano형이다.

		Coffee.Americano typeD=(new Coffee()).getAmericano(); // Coffe.Americano는 Americano형이기 때문에
		// getAmericano를 사용하려면 Coffee생성자를 생성해서 Coffee형으로 형변환을 해줘야한다.

		System.out.println(typeA.caf+typeA.price);
// A타입은 coffee형이라서 Americano클래스의 인스턴스 변수인 카페인을 출력할 수 없지만 coffee클래스의 price는 출력할 수 있다.

		System.out.println(typeB.caf+typeB.price);
// B타입은 Americano형이라서 Americano클래스의 인스턴스 변수인 카페인을 출력 할 수 있지만 coffee클래스의 price는 츨력할 수 없다.

		System.out.println(typeC.caf+typeC.price);
// C타입은 Americano형이라서 Americano클래스의 인스턴스 변수인 카페인을 출력 할 수 있지만 coffee클래스의 price는 츨력할 수 없다.

	}

	public static void main(String[] args) {
		new StarBucks();
		// 결과값은 모든 커피들이 다 20이란 카페인을 가진다.
	}

}
// 내부클래스에서 외부클래스를 쓸때에는 형변환이 필요하다.