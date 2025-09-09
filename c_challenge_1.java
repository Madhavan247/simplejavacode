import java.util.Scanner;
public class c_challenge_1 {
    void evenorodd(int num)
    { 
         for(int i=0;i<=num;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number : "+i);
            }}
            for(int j=0;j<=num;j++){
            if(j%2==1)
                System.out.println("Odd Number : "+j);
            }
    }
    public static void main(String []args){

        // create a scanner 
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value");
        int num =s1.nextInt();
        c_challenge_1 c1 = new c_challenge_1();
        c1.evenorodd(num);
    
        // create a for loop function 

       
        }
        }
    

