public class keyword{

    int bala_shop(int account)
    {

        int maddy = 500;
        int rem = 780-500;
        return rem;

    }
    String getname(){
        return "Madhavan";
    }
    String getphone(){
        return "8610566874";
    }
    public static void main(String[] args){

        // create a object for class 

        keyword k1 = new keyword();

        String myname = k1.getname();
        String mycontect = k1.getphone();
        int remainder = k1.bala_shop(780);
        System.out.println(myname);
        System.out.println(mycontect);
        System.out.println(remainder);

    }
}