package kr.hs.dgsw.ex1;

public class People {
	String name;
	float tall;
	float kg;
	
	float bmi() {
		return kg/((tall/100)*(tall/100)); 
	}
	
	void print() {
		float bmi = bmi();
		if(bmi >= 25) {
			System.out.printf("%s�� �񸸵��� %f�̰� ��ü���Դϴ�\n",name,bmi);
		}
		else if(bmi >= 20) {
			System.out.printf("%s�� �񸸵��� %f�̰� ǥ��ü���Դϴ�\n",name,bmi);
		}
		else if(bmi < 20){
			System.out.printf("%s�� �񸸵��� %f�̰� ��ü���Դϴ�\n",name,bmi);
		}
	}
}
