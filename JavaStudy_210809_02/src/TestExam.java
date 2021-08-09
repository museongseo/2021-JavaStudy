import java.util.Scanner;

public class TestExam {

    public static void methodTest() {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("연산기호(+,-,*,/,%)를 입력하시오: ");
        char ch = sc.nextLine().charAt(0);

        double result = 0;
        if (ch == '+'){
            result = num1 + num2;
        }
        else if (ch == '-'){
            result = num1 - num2;
        }
        else if (ch == '*'){
            result = num1 * num2;
        }
        else if (ch == '/'){
            if (num2 != 0){
                result = num1 / num2;
            }
            else{
                System.out.println("0으로 나눌 수 업습니다.");
                result = 0;
            }
        }
        else if (ch == '%'){
            result = num1 % num2;
        }
        else{
            System.out.println("연산기호를 잘못 입력하였습니다.");
        }

        System.out.println("연산 결과: " + result);
    }
    
    public static void main(String[] args){
        methodTest();
    }
}
