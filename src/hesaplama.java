import java.util.Scanner;
public class hesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Aracınız kaç kuruş yakıyor? örnek(0,32)");
		double kurus = scan.nextDouble();
		System.out.print("Aracınız kaç km yol  yaptı?");
		int km = scan.nextInt();
		System.out.println("Ödeyeceğiniz tutar :" + (kurus*km)+"tl'dir");
		
		}

}
