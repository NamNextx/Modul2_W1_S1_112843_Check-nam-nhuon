import java.util.Scanner;

public class checkNamnhuon {
    public static void main(String[] args) {
     /*   Những năm chia hết cho 4 mà không chia hết cho 100 là năm nhuận

        Những năm chia hết cho 100 mà không chia hết cho 400 thì KHÔNG PHẢI là năm nhuận

        Những năm chia hết đồng thời cho 100 và 400 là năm nhuận*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int year = sc.nextInt();
        if (check(year)){
            System.out.println(year+" la nam nhuon");
        }
        else System.out.println(year+" khong phai nam nhuon");

    }

    static boolean check(int year) {
        boolean flag = false;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                flag = true;
            } else if (year % 100 == 0) {
                if (year % 400 == 0) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
