package function;

public class CheckVowel {
	public static void main(String[]args) {
		String name="apple";
		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")){
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
