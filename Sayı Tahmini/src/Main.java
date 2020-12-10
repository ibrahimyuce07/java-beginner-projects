import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			int can = 5;
			int sayi = random.nextInt(100);
			System.out.println("0 ve 100 arasında bir sayı giriniz.");
			int tahmin = scanner.nextInt();
			while ((tahmin != sayi) && (can > 0)) {
				if (tahmin < 0 || tahmin > 100) {
					can--;
					System.out.println("0 ve 100 arasında bir sayı giriniz.\nKalan Hak: " + can);
					tahmin = scanner.nextInt();
				} else if (tahmin < sayi) {
					can--;
					System.out.println("Tahmininiz düşük. Biraz daha yüksek bir sayı deneyin.\nKalan Hak: " + can);
					tahmin = scanner.nextInt();
				} else {
					can--;
					System.out.println("Tahmininiz yüksek. Biraz daha düşük bir sayı deneyin. \nKalan Hak: " + can);
					tahmin = scanner.nextInt();
				}
			}

			if (sayi == tahmin) {
				System.out.println("Tebrikler!");
			} else {
				System.out.println("Haklarınız bitti...");
			}
			System.out.println("Tekrar ? (e/h)");
			scanner.nextLine();
			String cevap = scanner.nextLine();
			cevap = cevap.toLowerCase();
			if (cevap.equals("e")) {
				System.out.println("Tekrar başlatılıyor...");
				Main.main(args);
			} else {
				System.out.println("Bitiriliyor...");
				return;
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("Lütfen harf kullanmayın.");
			Main.main(args);
		}

		
	}

}
