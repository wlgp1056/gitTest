class Person {
	private int perID,milID, birthYear, birthMonth, birthDay;
	
	public Person(int perID, int milID, int bYear, int bMonth, int bDay) {
		// 생성자로 5개의 매개변수를 가짐
		this.perID = perID;
		this.milID = milID;
		// this.을 붙이면 멤버 변수라는 의미를 가짐
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay;
	}
	public Person(int pID, int bYear, int bMonth, int bDay) {
		// 생성자로 4개의 매개변수를 가짐
		this(pID, 0, bYear, bMonth, bDay);
		// this()는 생성자를 호출 - 현재 속해있는 클래스의 생성자
	}
	public void showInfo() {
		System.out.println("민번 : " + perID);
		System.out.println("생일 : " + birthYear + "/" + birthMonth + "/" + birthDay);
		if (milID != 0) {
			System.out.println("군번 : " + milID + "\n");
		} else {
			System.out.println("군과 관련 없음\n");
		}
	}
}
public class Overloading {
	public static void main(String[] args) {
		Person man = new Person(95120, 880102, 1995, 12, 3);
		// 5개의 정보를 가지고 man인스턴스 생성
		Person woman = new Person(991107, 1999, 11, 7);
		// 4개의 정보를 가지고 woman인스턴스 생성
		
		man.showInfo();
		woman.showInfo();
	}
	

}
