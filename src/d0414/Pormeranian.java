package d0414;

public class Pormeranian extends Dog{
	public Pormeranian() {
		super("���޶�Ͼ�");
	}
	
	public static void main(String[] args) {
		Animal pormeranian = new Pormeranian();
		
		pormeranian.move();
		pormeranian.eat("����");
		pormeranian.makeSound();
		
//		pormeranian.getClass();
		//���� ���� �ִ� Ŭ������ ������Ʈ
	}
}