
public class StringEx2 {
	public static void main(String[] args) {
		String str1 = "test@test.com";
		String str2 = "testtest.com";
		String str3 = "test@testcom";
		String str4 = "te.st@testcom";

		// str1 ~ 4�� ���ڿ��� �����ּҰ� �´��� ���θ� �˻��Ͽ� ����ϴ� �޼ҵ� ����
		// �޼ҵ���� isMail(String str) �� ���ϰ�, �������� �����ּ� ���θ� ����
		if (isMail(str1)) {
			System.out.println(str1 + "�� �����ּҰ� �½��ϴ�.");
		} else {
			System.out.println(str1 + "�� �����ּҰ� �ƴմϴ�.");
		}
		if (isMail(str2)) {
			System.out.println(str2 + "�� �����ּҰ� �½��ϴ�.");
		} else {
			System.out.println(str2 + "�� �����ּҰ� �ƴմϴ�.");
		}
		if (isMail(str3)) {
			System.out.println(str3 + "�� �����ּҰ� �½��ϴ�.");
		} else {
			System.out.println(str3 + "�� �����ּҰ� �ƴմϴ�.");
		}
		if (isMail(str4)) {
			System.out.println(str4 + "�� �����ּҰ� �½��ϴ�.");
		} else {
			System.out.println(str4 + "�� �����ּҰ� �ƴմϴ�.");
		}
	}

	public static boolean isMail(String str) {
	// ���� �˻�� �޼ҵ�� �˻�� �߸��� �κк��� �˻縦 �ؾ� ��
		int atPos = str.indexOf('@');	// str���� '@'�� ��ġ �ε���
		int dotPos = str.lastIndexOf('.');	// str���� '.'�� ������ ��ġ �ε���

		if (atPos < 1) {
		// 1. �����ּҿ� '@'�� ���ų� ù���� ��ġ�� ������
			return false;
		} else if (dotPos < 3) {
		// 2. �����ּҿ� '.'�� ���ų� ����°���� �տ� ������
			return false;
		} else if (atPos > dotPos) {
		// 3. '.'�� ��ġ�� '@'���� �տ� ������
			return false;
		}

		return true;
	}
}
