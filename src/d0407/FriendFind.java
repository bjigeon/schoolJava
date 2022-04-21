package d0407;

import java.util.Scanner;

public class FriendFind {
	private Scanner scanner;
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
	public void closeScanner() {
		this.scanner.close();
	}
	
	public Scanner getScanner() {
		return this.scanner;
	}
	
	public static void main(String[] args) {
		String[] friend = {"������","������","����","����","��μ�","������","�ں���","�ڼ���","������","������","�տ�","����","����","������","������", "�̽¹�", "����ȣ","�ֹ���","�ѻ��"};
		
		FriendFind find = new FriendFind();
		find.prepareScanner();
		
		Scanner scanner = find.getScanner();
		
		System.out.println("��ȣ�� �Է��ϼ���");
		int value = scanner.nextInt();
		
		if(value == 0 || value > 19) {
			System.out.println("���� ��ȣ �Դϴ�");
		}
		else {
			System.out.printf("%s\n",friend[value-1]);
		}
		
		System.out.println("�̸��� �Է��ϼ���");
		String value1 = scanner.next();
		//System.out.println(value1);
		
		for (int i = 0; i < friend.length; i++) {
			if (friend[i].equals(value1) ) {
				System.out.printf("%s �� %d�� �Դϴ�\n", value1, i+1);
				break;
			}
		}
		
		
		find.closeScanner();
		System.out.println("���ɳ� ����");
	}
}
