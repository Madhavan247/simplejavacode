public class function {
    // create a function for class
    void greeting(int a,int b){
        // System.out.println("Have a Good day There!");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
    void Hay(){
        System.out.println("Hi! I am Maddy");
    }
    public static void main(String[] args){
        // Create a object for class 
        function f1 = new function();
        f1.Hay();
        f1.greeting(10, 20);// Given by the parameter value a and b
        
    }
}
