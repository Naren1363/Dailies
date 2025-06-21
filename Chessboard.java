import java.util.Scanner;

public class Chessboard {
    public static String determineColor(String s) {
        char colChar= s.charAt(1);
        int row= Character.getNumericValue(s.charAt(1));
        int col= colChar -'a' + 1 ;
        int sum = col + row ;
        if (sum % 2 ==0){
            return "Black";
        } else {
        return "White";
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
        scanner.close();
    }
    
}