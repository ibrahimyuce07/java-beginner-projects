import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();



			System.out.println("Taş Kağıt Makas");
			System.out.println("1 - Taş\n" + "2 - Kâğıt\n" + "3 - Makas");
			int bilgSecimi = random.nextInt((3 - 1) + 1) + 1;
			int seninSecimin = scanner.nextInt();
			System.out.println("Bilgisayarın seçimi: \t" + bilgSecimi);
			System.out.println("Senin seçimin: \t\t" + seninSecimin);
			if (bilgSecimi == seninSecimin) {
				System.out.println("Beraberlik.");
			} else if (bilgSecimi == 1 && seninSecimin == 3 || bilgSecimi == 2 && seninSecimin == 1
					|| bilgSecimi == 3 && seninSecimin == 2) {
				System.out.println("Bilgisayar kazandı.");
			} else {
				System.out.println("Sen kazandın.");
			} 
			System.out.println("Tekrar? (#0)");
			int tekrar = scanner.nextInt();
			if (tekrar == 0) {
				Main.main(args);
			}
		}
	

}
