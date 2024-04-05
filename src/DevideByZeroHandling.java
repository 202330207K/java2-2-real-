import java.util.Scanner;
public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.print("나뉨수를 입력하시오 : ");
        dividend = scanner.nextInt();
        System.out.print("나눗수를 입력하시오 : ");
        divisor = scanner.nextInt();
        try { 
            System.our.println(dividend + "를" + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
        } // dividend/divisor 의 값이 0 이면 아래의 예외 발생 
        catch(ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다."); // arithmeticException 이 발생하면 실행
        }
        fianlly{
            scanner.close(); // 예외가 발생하던말던 스캐너 닫는다
        }
    }
}
