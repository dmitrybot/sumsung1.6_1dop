import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print(30);
                break;
            case 2:
                System.out.print(28);
                break;
            default:
                System.out.print(0);
        }
    }
}