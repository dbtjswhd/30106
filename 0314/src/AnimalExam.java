

public class AnimalExam {
	public static void main(String[] args) {
		Cat c1 = new Cat("고양이");
		c1.eat();
        c1.eat();
	}
}
class Animal{
	String name;
	int food = 0;
	
	public Animal() {}
	
	public void eat() {
		food += 10;
		System.out.println("냐미~");
	}
}
class Cat extends Animal{
	int age = 3;
	public Cat(String name) {
		this.name = name;
		System.out.println("동물의 종류는 "+this.name+"이고, 나이는 "+age+" 살 입니다");
	}
	public void eat() {
		food += 10;
		System.out.println("먹은거 = "+food+"g 임");
	}
	
}