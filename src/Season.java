import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("월(1~12)을 입력하시오 : ");
        int month = scanner.nextInt();
        if (month == 3 || month == 4 || month == 5){
            System.out.println("봄입니다.");
        }
        else if (month == 6 || month == 7 || month == 8){
            System.out.println("여름입니다.");
        }
        else if (month == 9 || month == 10 || month == 11) {
            System.out.println("가을 입니다.");
        }
        else if (month == 12 || month == 1 || month == 2){
            System.out.println("겨울입니다.");
        }
        else{
            System.out.print("다시써");
        }
    }
}