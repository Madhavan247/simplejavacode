class student{
    public String name;
    public int age=22;
    public int mark;
    public String dept;
// Create a consistor function --->
public student(){
        this.name="Maddy";
        this.mark=348;
        this.dept="Ece";
    }
}
class vehical {
    public String bike_name;
    public String model;
    public String registration;
    public int bike_no=9318;
// simple code of java
public  vehical(){
    this.bike_name = " Pulser";
    this.model="fifth generation ";
    this.registration="Tiruvannamalai";
}
}
class Demo{
    public static void main(String[] args){
        // vehical object 
        vehical v1 = new vehical();
        System.out.println("Bike name is :"+v1.bike_name);
        System.out.println("Bike model is :"+v1.model);
        System.out.println("Bike registration :"+v1.registration);
        System.out.println("Bike number is :"+v1.bike_no);
        // student object 
        student s1 = new student();
        System.out.println("Student name is : "+s1.name);
        System.out.println("Student age is : "+s1.age);
        System.out.println("Student mark is :" +s1.mark);
        System.out.println("Student Dept is : "+s1.dept);

    }
}