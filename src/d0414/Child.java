package d0414;

public class Child extends Parent{

	private int age;
	
	public void showAge() {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.age);
		System.out.println("name" + child.name);
		child.sayHello();
		
		//int weight = child.weight;
		
		Parent parent = new Child();//�ڽ� ������Ʈ�� �θ� Ŭ������ ���尡��
		Parent realparent = new Parent();
		//Child child1 = new Parent();
		
		parent.sayHello();
		//parent.showAge();
		
		System.out.println(parent + " " + parent.getClass());
		System.out.println(realparent + " " + realparent.getClass());
		
		Child child1 = (Child)parent;
		//Child child2 = (Child)realparent;
	}
}
