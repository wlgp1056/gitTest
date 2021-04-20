
public class StringEx2 {
	public static void main(String[] args) {
		String str1 = "test@test.com";
		String str2 = "testtest.com";
		String str3 = "test@testcom";
		String str4 = "te.st@testcom";

		// str1 ~ 4의 문자열이 메일주소가 맞는지 여부를 검사하여 출력하는 메소드 제작
		// 메소드명은 isMail(String str) 로 정하고, 실행결과로 메일주소 여부를 리턴
		if (isMail(str1)) {
			System.out.println(str1 + "는 메일주소가 맞습니다.");
		} else {
			System.out.println(str1 + "은 메일주소가 아닙니다.");
		}
		if (isMail(str2)) {
			System.out.println(str2 + "는 메일주소가 맞습니다.");
		} else {
			System.out.println(str2 + "은 메일주소가 아닙니다.");
		}
		if (isMail(str3)) {
			System.out.println(str3 + "는 메일주소가 맞습니다.");
		} else {
			System.out.println(str3 + "은 메일주소가 아닙니다.");
		}
		if (isMail(str4)) {
			System.out.println(str4 + "는 메일주소가 맞습니다.");
		} else {
			System.out.println(str4 + "은 메일주소가 아닙니다.");
		}
	}

	public static boolean isMail(String str) {
	// 메일 검사용 메소드로 검사시 잘못된 부분부터 검사를 해야 함
		int atPos = str.indexOf('@');	// str에서 '@'의 위치 인덱스
		int dotPos = str.lastIndexOf('.');	// str에서 '.'의 마지막 위치 인덱스

		if (atPos < 1) {
		// 1. 메일주소에 '@'가 없거나 첫글자 위치에 있으면
			return false;
		} else if (dotPos < 3) {
		// 2. 메일주소에 '.'이 없거나 세번째글자 앞에 있으면
			return false;
		} else if (atPos > dotPos) {
		// 3. '.'의 위치가 '@'보다 앞에 있으면
			return false;
		}

		return true;
	}
}
