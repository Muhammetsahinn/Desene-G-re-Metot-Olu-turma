import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		int n;
		Scanner inp = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		n = inp.nextInt();
		recursiveMethod(n);
	}

	public static void recursiveMethod(int n) {
		System.out.println(n); // Sayıyı yazdır

		if (n <= 0) {
			return;
		} else {
			recursiveMethod(n - 5); // 5 rakamını çıkararak metodu tekrar çağır
			System.out.println(n); // Sayıyı tekrar yazdır
		}
	}
}