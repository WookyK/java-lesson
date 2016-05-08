package homework.day5;

public class BranchingTutorial {
	public static void main(String[] args) {
		boolean isTrue = true;
		boolean nestedStatement = true;
		
		if (isTrue) {
			System.out.println("plan A");
		} else {
			System.out.println("plan B");
			if (nestedStatement) {
				System.out.println("plan B-1");
			} else {
				System.out.println("plan B-2");
			}
		}
	}

}
