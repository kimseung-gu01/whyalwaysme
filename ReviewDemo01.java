import javax.swing.*;
import java.util.Arrays;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
//ver 0.6
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true; // is 논리형 불리타입 yes or no
        int k = 2;

        while (k < number) {
            if(number % k == 0) { //입력된 수를 k로 나눴을 때 나머지 0인 경우
                isPrime = false;
                break;
            }
            //System.out.println(k);
            k++;
        }
        System.out.println(number + (isPrime ? "은 소수 !" : "은 소수가 아닙니다."));// 삼항조건 연산자 true or false
    }
}