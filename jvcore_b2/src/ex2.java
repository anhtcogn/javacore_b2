//Viết chương trình tính ra số ngày giữa 2 mốc thời điểm người dùng nhập vào.
//        Dữ liệu nhập vào của người dùng sẽ có dạng y1 m1 d1 y2 m2 d2.
//        Với điều kiện mốc thời gian 1 lớn hơn mốc thời gian 2.

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] base = new int[6];
        for (int i = 0; i < 6; i++) {
            base[i] = sc.nextInt();
        }
        String endDate = String.valueOf(base[0]) + " " + String.valueOf(base[1]) + " " + String.valueOf(base[2]);
        String startDate = String.valueOf(base[3]) + " " + String.valueOf(base[4]) + " " + String.valueOf(base[5]);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");

        try {
            Date end = sdf.parse(endDate);
            Date start = sdf.parse(startDate);

            long value = end.getTime() - start.getTime();
            if (value > 0) {
                long res = value / (1000*60*60*24);
                System.out.println("So ngay chenh lech la: " + res);
            }
            else {
                System.out.println("Nhap moc thoi gian 1 lon hon.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
