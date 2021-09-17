import javax.swing.*;
import java.util.Arrays;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

//ver 0.2

import java.util.Scanner;
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt = 0;

        for (int k = 1 ; k<=number; k++) {
            if(number % k == 0)
                cnt ++;
        }
        if (cnt == 2)
            System.out.println(number + "은 소수");
        else
            System.out.println("아닙니다");
    }
}


