package kr.hs.dgsw.java.first;

public class Rectangle {
	int height;
	int width;
	
	int calculateArea() {
		return this.height * this.width;
	}
	
	void printArea() {
		int area = calculateArea();
		
		System.out.printf("���� %d �ʺ� %d �� ������ %d �Դϴ�", height,width,area);
		
//		System.out.println("���� : " + height + "�ʺ� : " + width + "�� ������ " + area + "�Դϴ�.");
	}
}
