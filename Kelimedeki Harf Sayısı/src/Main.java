import java.util.Scanner;

public class Main {
	
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kelime:");
		String kelime = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < kelime.length(); i++) {
			kelime.charAt(i);
			count++;
		}
		System.out.println("Kelimedeki harf sayısı: " + count);
		
	}

}
