
public class Test {
	
	public static void main(String[] args) {
	
		//Book java = new Book (1234567, "Intro to Java");
		//Book csharp = new Book (7654321, "Intro into C#", "Sushil");
		
		PaperBook python = new PaperBook (1234, "Intro into Python", "Tomas", 100, 2.5f);
		PaperBook nodejs = new PaperBook (4567, "Intro to Node.js", 500, 1.2f);
		
		EBook angular = new EBook (987, "Intro into Angular Framework", "Justice", "angular.dci.com", 10);
		EBook react = new EBook (987652, "Intro into React Framework", "react.dci.com", 25.5f);
		
		
		//System.out.println(java.generateID());
		
		System.out.println(nodejs.generateID());
		
		System.out.println(angular.generateID());
			
		
		
		
		
		
		
	}
}
