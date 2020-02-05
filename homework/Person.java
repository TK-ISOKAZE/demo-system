package homework;

public class Person {
	private String name;
	private int age;
	private String sex;
	public Person(String name){
		this.name=name;
		age=22;
		sex="男";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
