import java.lang.*;
import java.util.*;

public class Days_Of_Week_2 {
    public static void main(String[] args) {
        int Day = 0;
        Scanner Sc = new Scanner(System.in);

        System.out.print("\n Enter Day Number (1-7) :");
        Day = Sc.nextInt();

        if (Day <= 0 || Day > 7) {
            System.out.print("\n Invalid Day Number ");
        } else if (Day == 1) {
            System.out.print("\n Monday ");
        } else if (Day == 2) {
            System.out.print("\n Tuesday ");
        } else if (Day == 3) {
            System.out.print("\n Wednesday ");
        } else if (Day == 4) {
            System.out.print("\n Thursday ");
        } else if (Day == 5) {
            System.out.print("\n Friday ");
        } else if (Day == 6) {
            System.out.print("\n Saturday ");
        } else if (Day == 7) {
            System.out.print("\n Sunday ");
        }
        System.out.print("\n Thanks..!!! ");
    }
}