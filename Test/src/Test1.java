
class HoaException extends IndexOutOfBoundsException{
	
}
class Person{
	public static void method1(Person a) throws IndexOutOfBoundsException{
		System.out.println(a.toString());
		throw new HoaException();
	}
}
public class Test1 {

	public static void main(String[] args) {
		Person a = new Person();
		System.out.println("Hello");
		System.out.println("World1");
		System.out.println(a.toString());
		try {
			Person.method1(a);
		} catch (Exception e) {
		  System.out.println(e.getClass());
		}
	}

}
