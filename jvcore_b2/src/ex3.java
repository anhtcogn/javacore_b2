//Viết một chương trình tính tổng các số nguyên tố từ 1 đến 10_000 với 3 cách. Mỗi cách yêu cầu sử dụng 1 cấu trúc lặp
//khác nhau bao gồm: while, do while và for.

public class ex3 {
    public static void main(String[] args) {
        sumWhile();
        sumDoWhile();
        sumFor();
    }

    public static void sumFor() {
        long sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i)){
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố từ 1 đến 10_000 là: " + sum);
    }
    public static void sumDoWhile() {
        long sum = 0;
        int i = 1;
        do {
            if (isPrime(i)) {
                sum += i;
            }
            i++;
        } while (i < 10001);
        System.out.println("Tổng các số nguyên tố từ 1 đến 10_000 là: " + sum);
    }

    public static void sumWhile() {
        long sum = 0;
        int i = 1;
        while (i < 10001){
            if (isPrime(i)) {
                sum += i;
            }
            i++;
        }
        System.out.println("Tổng các số nguyên tố từ 1 đến 10_000 là: " + sum);
    }
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
