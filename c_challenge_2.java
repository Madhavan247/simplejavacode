import java.util.Scanner;
public class c_challenge_2 {
    String passorfail(int score){

        if(score < 35){
            return "Fails";
        }
        else{
            return "Pass";
        }
    }
    
    public static void main(String[] args){

        // create a scanner with in user input
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the your mark : ");
        int mark = s1.nextInt();

        // create a objact for class 

        c_challenge_2 c1 = new c_challenge_2();
        String result = c1.passorfail(mark);
        System.out.println(result);

    }
}
