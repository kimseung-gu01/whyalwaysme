import javax.swing.*;
import java.util.Arrays;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
// ver 0.3
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true; // is 논리형 불리타입 yes or no

        for (int k = 2 ; k < number; k++) {
            if(number % k == 0) //입력된 수를 k로 나눴을 때 나머지 0인 경우
                isPrime = false;
        }
        if (isPrime) // isPrime 변수 값이 true면
           System.out.println(number + "은 소수");
        else
            System.out.println("소수가 아닙니다");
    }
}
