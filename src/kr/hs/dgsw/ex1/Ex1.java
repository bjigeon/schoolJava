package kr.hs.dgsw.ex1;

public class Ex1 {
	public static void main(String[] args) {
		People kim = new People();
		kim.name = "��";
		kim.tall = 165;
		kim.kg = 55;
		
		People kwon = new People();
		kwon.name = "��";
		kwon.tall = 180;
		kwon.kg = 80;
		
		kim.print();
		kwon.print();
	}
}
