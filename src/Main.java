import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number != 0){
            int tmp;
            int counter1 = 1, counter2 = 1;
            int answer1 = 1, answer2 = 1;
            while(number != 0){
                tmp = number;
                number = sc.nextInt();
                if(number > tmp && number != 0) {
                    counter1++;
                }
                else{
                    if(counter1 > answer1) {
                        answer1 = counter1;
                    }
                    counter1 = 1;
                }
                if(tmp > number && number != 0) {
                    counter2++;
                }
                else{
                    if(counter2 > answer2) {
                        answer2 = counter2;
                    }
                    counter2 = 1;
                }
                if(number == 0){
                    break;
                }
            }
            

            if(answer1 > answer2)
                System.out.println(answer1);
            else
                System.out.println(answer2);
        }
        else{
            System.out.println(0);
        }
    }
}