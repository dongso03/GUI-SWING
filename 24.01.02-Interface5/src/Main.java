// 작가
class Author{
   //객체 의존성
	private Writeable tool;

	public Author(Writeable tool) {
		super();
		this.tool = tool;
	}

	public void writeArticle() {
		tool.write("책내용");
	}

	public void setTool(Writeable tool) {
		this.tool = tool;
	}

}

// (글을 적을 수 있는 도구(가지고 있어야 한다)가 필요하다)
//글을 적을수 있음
interface Writeable {
	public void write(String line);
}

//연필 
//문자열 콘솔 출력 가능
class Pencil implements Writeable {

	@Override
	public void write(String line) {
		System.out.println("연필로 " + line + " 적습니다.");
	}

}
//볼펜 
//문자열 콘솔 출력가능
class BallPen implements Writeable{

	@Override
	public void write(String line) {
		System.out.println("볼펜으로 " + line + " 적습니다.");
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Pencil pc = new Pencil();
		BallPen bp = new BallPen();
		Author aut = new Author(pc);
		aut.writeArticle();
		
		aut.setTool(bp);
		aut.writeArticle();
		
		System.out.println("-------------");
		pc.write("상추 나쁜아이");
		bp.write("다시는 안먹는다");

	}
}
