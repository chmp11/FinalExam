package QuestionC;

public class IllegalRectangle extends Exception{
	private int x;
	private int y;
	public IllegalRectangle(){
		System.out.print("Cannot have negative length.");
	}
}
