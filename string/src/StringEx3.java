
public class StringEx3 {
	public static void main(String[] args) {
		String str1 = "880505-1234567";
		String str2 = "890308-2234567";
		String str3 = "001015-3234567";
		String str4 = "021112-4234567";
		
		// �ֹε�Ϲ�ȣ�� �̿��Ͽ� ������ϰ� ������ ���
		// void birthdayPrint(String str) : ������� ���
		// void genderPring(String str) : ����(��, ��) ���
		
		birthdayPrint(str1);	birthdayPrint(str2);
		birthdayPrint(str3);	birthdayPrint(str4);
		genderPrint(str1);		genderPrint(str2);
		genderPrint(str3);		genderPrint(str4);
		
		birthdayPrint2(str1);	birthdayPrint2(str2);
		birthdayPrint2(str3);	birthdayPrint2(str4);
		genderPrint2(str1);		genderPrint2(str2);
		genderPrint2(str3);		genderPrint2(str4);
	}
	
	public static void birthdayPrint(String str) {
		// ������� ��� �޼ҵ�
		// 880505-1234567 : 1988�� 05�� 05�� ��
		String chk=""; // 1900���� 2000��븦 ������ ��
		char gn = str.charAt(7); // ���������� ����
		if (gn == '1'|| gn == '2') {
			chk = "19";
		}
		else {
			chk = "20";
		}
		String year = chk+str.substring(0,2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		System.out.println(year + "�� " + month + "�� " + day + "�� ��");
	}
	public static void genderPrint(String str) {
		// ���� ��� �޼ҵ�
		char gn = str.charAt(7);
		// ���� ������ ����
		if(gn == '1' || gn == '3') {
		// gn�� char�� ������ �̹Ƿ� �񱳽� ������ �ƴ� char�� �����ͷ� '1'�� '3'�� ��
			System.out.println("����");
			} else {
				System.out.println("����");
			}
	}
	public static void birthdayPrint2(String str) {
		String chk = "";
		int gn = str.charAt(7);
		if (gn < 51) {	// char�� �����ͷ� '1'�� ������ 49�� �ǹ�
			chk = "19";
		} else {
			chk = "20";
		}
		String year = chk + str.substring(0, 2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		System.out.println(year + "�� " + month + "�� " + day + "�� ��");
	}

	public static void genderPrint2(String str) {
		int gn = str.charAt(7);
		if (gn % 2 == 1) {	// char�� �����͸� int������ ���� �� Ȧ���̸�
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
	



}
