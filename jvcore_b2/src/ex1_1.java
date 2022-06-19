
import java.util.Scanner;

public class ex1_1 {
    public enum Month {
        THANG1(31), THANG2(28), THANG3(31), THANG4(30),
        THANG5(31), THANG6(30), THANG7(31), THANG8(31),
        THANG9(30),THANG10(31), THANG11(30), THANG12(31);

        private int days;
        Month(int days) {
            this.days = days;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang can tim (1-12): ");
        int n = sc.nextInt();

        Month m = Month.values()[n - 1];

        switch (m) {
            case THANG1, THANG2, THANG3, THANG4,
                    THANG5, THANG6, THANG7, THANG8,
                    THANG9, THANG10, THANG11, THANG12: {
                System.out.println("Thang " + n + " co " + m.days + " ngay.");
                break;
            }
        }
    }
}
