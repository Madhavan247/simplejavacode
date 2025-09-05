import java.util.Scanner;
public class addtowsum{
    public static void main(String[]args){
        String name;
        int score;
        String Dept;
    // System.out.println("Enter the number : ");
    Scanner scan = new Scanner(System.in);

    // Frist of all given by the User inputs 
    
        System.out.println("Enter your Name :");
        String Myname = scan.nextLine();
        // scan.nextLine();
        System.out.println("Enter the your Score");
        int Mark = scan.nextInt();
        System.out.println("Enter the department");
        scan.nextLine();
        String department = scan.nextLine();
    
        System.out.println("Your Name is :"+Myname);
        System.out.println("Your Mark is :"+Mark);
        System.out.println("Your department is :"+department);

        scan.close();
    }
}