class Person {
	private int perID,milID, birthYear, birthMonth, birthDay;
	
	public Person(int perID, int milID, int bYear, int bMonth, int bDay) {
		// �����ڷ� 5���� �Ű������� ����
		this.perID = perID;
		this.milID = milID;
		// this.�� ���̸� ��� ������� �ǹ̸� ����
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay;
	}
	public Person(int pID, int bYear, int bMonth, int bDay) {
		// �����ڷ� 4���� �Ű������� ����
		this(pID, 0, bYear, bMonth, bDay);
		// this()�� �����ڸ� ȣ�� - ���� �����ִ� Ŭ������ ������
	}
	public void showInfo() {
		System.out.println("�ι� : " + perID);
		System.out.println("���� : " + birthYear + "/" + birthMonth + "/" + birthDay);
		if (milID != 0) {
			System.out.println("���� : " + milID + "\n");
		} else {
			System.out.println("���� ���� ����\n");
		}
	}
}
public class Overloading {
	public static void main(String[] args) {
		Person man = new Person(95120, 880102, 1995, 12, 3);
		// 5���� ������ ������ man�ν��Ͻ� ����
		Person woman = new Person(991107, 1999, 11, 7);
		// 4���� ������ ������ woman�ν��Ͻ� ����
		
		man.showInfo();
		woman.showInfo();
	}
	

}
