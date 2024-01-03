import java.util.Arrays;

// 학생
// 이름
// 국, 영, 수

// 학생 관리 소프트웨어를 만들고자 합니다.
// 콘솔 입출력

// 학생 목록 관리
// 명단 등록
// 명단 접근
// 학생 찾기
// 학생 접근
public class Main {
	public static void main(String[] args) {
		StudentManage manager = new StudentManageImpl();
		Student s = new Student("길동", 100, 90, 80);
		manager.register(s);
		manager.register(new Student("둘리", 90, 80, 70));
		manager.register(new Student("도우너", 80, 70, 60));
		manager.register(new Student("마이콜", 70, 60, 50));

		Student[] arr = manager.getStudents();
		System.out.println(Arrays.toString(arr));
		
		System.out.println(manager.getOne(0));
		System.out.println(manager.findOne("둘리"));
	}
}






