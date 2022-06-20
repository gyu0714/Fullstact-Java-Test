package test;

class Person{
	private String personName = "person";
	public void method1() {
		System.out.println("person");
	}
	
}
class Student extends Person{
	private String studentName = "student";
	public void method1() {
		System.out.println("student");
	}
	// Getter와 Setter 생성?
	
}

public class Test1 {
	public static void main(String[] args) {
		
		// Test1-1 객체 생성 방법이 잘못된 부분과 그 이유는?
//		Student student1 = new Student();  자기 자신 타입, 객체 가능
//		Person student2 = new Student();  부모타입 자기 자신 객체 가능
//		Person person1 = new Person(); 자기자신 타입, 객체 가능	
//		Student person2 = new Person(); 자식 타입, 부모 객체 불가능 => 형변환 해줘야함
		
		// Test1-2 student3에서 자식의 메소드 호출하고 student4에서 부모의 메소드를 호출하려면?
		// 부모 타입, 객체로 변형 
		Student student3 = (Student) new Person(); // 형변환
		System.out.println(student3);
		
		Person student4 = new Student(); // 부모타입 자식객체 가능
		System.out.println(student3);
	}
}
