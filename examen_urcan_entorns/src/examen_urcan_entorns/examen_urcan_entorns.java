package examen_urcan_entorns;

public class examen_urcan_entorns {

	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();

	}
	
	public static void printOne() {
		System.out.println("Hello World");
	}
	
	public static void printTwo() {
		printOne();
		printOne();
	}
	

}
