package d0407;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStudy {
	public void studyArray() {
		int[] array1 = new int[10];
		int array2[];
		
		String[] name = new String[5];
		
		int[] values = {1,2,3,4,5};
		
		//colors ��� ���ڿ� Ÿ���� �迭�� �����ϰ�, ���� �ʱ�ȭ �� ������.
		String[] colors = {"����","���","�Ķ�","�ʷ�","����"};
		
		System.out.println(colors[1]);
		colors[4] = "��ȫ";
		
		printLastValue(colors);
		
//		String myColor = colors[5];
//		System.out.println(myColor);
		
		//���ܰ� �߻��ϸ� �� �ٿ��� ����
		
		printColors(colors);
		
		String[] colors2 = colors;
		colors2[2]="blue";
//		System.out.println(colors[2]);

		
		ArrayCopy arrayCopy = new ArrayCopy();
		String[] colors3 = arrayCopy.copy(colors);
		colors3[3] = "green";
		System.out.println(colors[3]);
		
		
		ArrayCopy intCopy = new ArrayCopy();
		int[] value2 = intCopy.copyInt(values);
		System.out.println("value : " + Arrays.toString(values));
		value2[3] = 100;
		System.out.println("value2 : " + Arrays.toString(value2));
		
		
		System.out.println("colors : "+ Arrays.toString(colors));
		System.out.println("colors2 : "+ Arrays.toString(colors2));
		System.out.println("colors3 : "+ Arrays.toString(colors3));
		
		
	
		
	}
	
	
	
	
	public void printLastValue(String[] values) {
		int length = values.length;
		System.out.println(values[length-1]);
	}
	
	public void printColors(String[] colors) {
		for(int i = 0; i < colors.length; i++) {
			System.out.printf("%d - %s\n",i,colors[i]);
		}
		
		for (String color : colors) {
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
		study.studyArray();
	}
}
