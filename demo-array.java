import java.util.Scanner;
class array{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int mark =scan.nextInt();

            if(mark > 90){
                System.out.println("Excellent");
            }
            else if(mark >= 80){
                System.out.println("Good");
            }
            else if(mark >= 45){
                System.out.println("I need to improve");
            }
            else if(mark > 44){
                System.out.println("not eligible");
            }
        }
    }