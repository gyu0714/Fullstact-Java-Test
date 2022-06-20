package test;

class Person1 {
	String name;
	int age;
	int weight;
	
	Person1() {}
	Person1( String name, int age, int weight ) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void wash() { System.out.println( "wash" ); }
	void study() { System.out.println( "study" ); }
	void play() { System.out.println( "play" ); }
}

interface Allowance {
	
	abstract void in( int price, String name );
	abstract void out( int price, String name );
}

interface Train {
	abstract void payTuitionFee( int tuitionFee, String name );
}

class Student1 extends Person1 implements Allowance, Train {
	Student1() {}
	Student1( String name, int age, int weight ) {
		super( name, age, weight );
	}
	
	public void in( int price, String name ) { System.out.printf( "%s 에게서 %d원 용돈을 받았습니다.%n", name, price ); }
	public void out( int price, String name ) { System.out.printf( "%d원 금액을 지출했습니다. [지출용도 --> %s]%n", price, name ); }
	public void payTuitionFee( int tuitionFee, String name ) { System.out.printf( "[%s --> %d원 입금완료]%n", name, tuitionFee ); }
}

public class Test5 {
	public static void main(String[] args) {
		
		
		// Test5 결과 출력하기 & extends와 implements중에서 우선적으로 적용되는 것은 무엇인지 확인해보기
		/* 
		 * wash
		 * study
		 * play
		 * 엄마 에게서 10000원 용돈을 받았습니다.
		 * 5000원 금액을 지출했습니다. [지출용도 --> 편의점]
		 * [훈련비 --> 50000원 입금완료]
		 */
		
		// 우선순위
		// 1. 클래스(extends)가 항상 우선권을 가진다. 클래스나 슈퍼클래스에서 정의한 메소드가 디폴트 메소드보다 우선권을 가짐.
		// 2. 1번 외의 상황이 있을 시 서브인터페이스가 우선권을 가짐. 상속 관계를 갖는 두 개의 인터페이스에서 같은 시그치러르
		// 		갖는 메소드를 정의한다면, 서브 인터페이스가 이긴다.
		
		Student1 st1 = new Student1();
		st1.in(10000, "엄마");
		st1.out(5000, "편의점");
		st1.payTuitionFee(50000, "훈련비");
		
	}
}
