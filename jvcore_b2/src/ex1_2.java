import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang can tim (1-12): ");
        int n = sc.nextInt();

        switch (n) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang " + n + " co 31 ngay.");
                break;

            case 2:
                System.out.println("Thang " + n + " co 28 ngay.");
                break;

            case 6, 9, 11:
                System.out.println("Thang " + n + " co 30 ngay.");
                break;

            default:
                System.out.println("Nhap lai");
        }
    }
}
