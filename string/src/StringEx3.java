
public class StringEx3 {
	public static void main(String[] args) {
		String str1 = "880505-1234567";
		String str2 = "890308-2234567";
		String str3 = "001015-3234567";
		String str4 = "021112-4234567";
		
		// 주민등록번호를 이용하여 생년월일과 성별을 출력
		// void birthdayPrint(String str) : 생년월일 출력
		// void genderPring(String str) : 성별(남, 여) 출력
		
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
		// 생년월일 출력 메소드
		// 880505-1234567 : 1988년 05월 05일 생
		String chk=""; // 1900년대와 2000년대를 구분할 값
		char gn = str.charAt(7); // 성별구분자 추출
		if (gn == '1'|| gn == '2') {
			chk = "19";
		}
		else {
			chk = "20";
		}
		String year = chk+str.substring(0,2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		System.out.println(year + "년 " + month + "월 " + day + "일 생");
	}
	public static void genderPrint(String str) {
		// 성별 출력 메소드
		char gn = str.charAt(7);
		// 성별 구분자 추출
		if(gn == '1' || gn == '3') {
		// gn이 char형 데이터 이므로 비교시 정수가 아닌 char형 데이터로 '1'과 '3'을 비교
			System.out.println("남자");
			} else {
				System.out.println("여자");
			}
	}
	public static void birthdayPrint2(String str) {
		String chk = "";
		int gn = str.charAt(7);
		if (gn < 51) {	// char형 데이터로 '1'은 정수로 49를 의미
			chk = "19";
		} else {
			chk = "20";
		}
		String year = chk + str.substring(0, 2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		System.out.println(year + "년 " + month + "월 " + day + "일 생");
	}

	public static void genderPrint2(String str) {
		int gn = str.charAt(7);
		if (gn % 2 == 1) {	// char형 데이터를 int형으로 받은 뒤 홀수이면
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}
	



}
