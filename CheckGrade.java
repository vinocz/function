package function;

public class CheckGrade {
	public static void main(String[]args) {
		int mark=60;
		if (mark>=0&&mark<=40) {
			System.out.println("e grade");
		}
		else if (mark>40&&mark<=60) {
			System.out.println("c grade");
			
		}
		else if(mark>60&&mark<=80) {
			System.out.println("b grade");
			
		}
		
		else {
			System.out.println("s grade");
		}
	}

}
