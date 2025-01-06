package ch4;

public class Box {
	private int width, height; // 박스의 너비와 높이 
	private char fillChar; // 박스를 그리는 데 사용하는 문자
	public Box() { // 매개 변수 없는 생성자
		this(10,1);
	}
	public Box(int width, int height){
		this.width = width;
		this.height = height;
	}
	public void draw(){
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++)
				System.out.print(fillChar);
			System.out.println();
		}
	}
	
	public void fill(char c){
		this.fillChar = c;
	}

	public static void main(String[] args) {
		Box a = new Box();
		Box b = new Box(20,3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}

}
