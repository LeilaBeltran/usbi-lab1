import java.util.Scanner;
public class Physicist {
    public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int x = 0, y = 0, z = 0;
		for (int i = 0; i < n; i++) {
                        x += num.nextInt();
			y += num.nextInt();
			z += num.nextInt();
		}
		if (x == 0 && y == 0 && z == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
