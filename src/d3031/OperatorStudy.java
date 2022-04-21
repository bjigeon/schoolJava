package d3031;

public class OperatorStudy {
	public void studyArithmeticOperators() {
		int value;
		
		value = 3 + 4;
		value = 3 - 4;
		value = 3 * 4;
		value = 3 / 4;
		value = 3 % 4;
		
		value += 3;
		value -= 3;
		value *= 3;
		value /= 3;
		value %= 3;
		
		int value1 = ++value;
		value1 = value--;
		
	
	}
	
	public void studyComparisionOperators() {
		boolean flag;
		
		flag = 3 > 4;
		flag = 3 < 4;
		flag = 3 >= 4;
		flag = 3 <= 4;
		
		flag = 3 == 4;
		flag = 3 != 4;
	}
	
	public void studyLogicalOperators() {
		int value;

		//AND
		// 두개가 1일때만 1 
		//  0011
		//& 0010
		//  0010
		value = 3 & 2;
		
		//OR
		// 두개 중 한개만 1
		//  0011
		//| 0010
		//  0011
		value = 3 | 2;
		
		//XOR
		// 
		value = 3 ^ 2;
		
		//왼쪽 방향으로 밀어줌
		// 0001
		// 0010
		// 0100
		value = 1 << 2;
		
		//123 * 2
		value = 123 << 1;
		
		
		//오른쪽으로 밀어줌
		//0011
		//0001
		value = 3 >> 1;
		
		
		//1000 0000
		//0100 0000
		//1100 0000
		//맨 앞에는 부호 연산자
		value = -128 >> 1;
		//-64
		byte value1 = -128;
		byte result = (byte)((byte)value1 >> 1);
		
		int a = 40;
		int b = 23;
		
		int max;
		if(a<b) {
			max = a;
		}
		else {
			max = b;
		}
		
		max = ( a > b ) ? a : b;
		
		
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		OperatorStudy study = new OperatorStudy();
		study.studyLogicalOperators();
	}
}
