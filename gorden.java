public class gorden {
    int apple_price = 20;
    int apple_count = 5;
    // create a function in Total of amount 
    void total_amount(){
        System.out.println(apple_price*apple_count);
    }
    public static void main(String[] args){
        gorden g1 = new gorden();
        g1.total_amount();
    }
}
