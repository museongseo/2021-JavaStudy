import java.util.Scanner;

public class Test {
    public static void Count(){
        {
            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.print("문자열을 입력해주세요: ");
                String str = sc.nextLine();
                if (str == "abc") {
                    break;
                }
                else {
                    System.out.println(str.length() + "글자 입니다.");
                }
            }

            System.out.println("프로그램을 종료합니다.");
        }
    }

    public static void main(String[] args){
        Count();
    }
}