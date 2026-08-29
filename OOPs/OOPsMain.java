package OOPs;
public class OOPsMain {

    public static void main(String[] args) {

         // -----Default Constructor-----

    //    student s1 = new student();
    //    s1.id =1;
    //    s1.name = "Rahul";
    //    s1.age= 22;
    //    s1.course= "B.Com";
    //    System.out.println(s1.id);
    //    System.out.println(s1.name);
    //    System.out.println(s1.age);
    //    System.out.println(s1.course);

    //    s1.marks();
    //    s1.sleep();
    //    s1.eat();
    //    s1.bunk();

           // -----Parametriesed Constructer

    // student s1 = new student(1,"Rahul",22,"B.com","khushi");
    // student s2 = new student(2,"Shivam",23,"B.Sc");

    //   System.out.println(s1.name);

    // System.out.println(s2.id);
    // System.out.println(s2.name);
    // System.out.println(s2.age);

    // s2.marks();
    // s2.eat();

            // -----Copy Construction

    // student s3 = new student(s2);

    // System.out.println(s3.id);
    // System.out.println(s3.name);
    // System.out.println(s3.age);

    // s3.marks();
    // s3.bunk();

               //----Multiple Objects

        // student s4 = new student(3,"aditya",24,"B.Sc");
        // student s5 = new student(4,"varun",27,"B.Ed");
        // student s6 = new student(5,"kartik",23,"B.A");

        //    ------Inheritance-----

        Car c1 = new Car("Toyota","Fortuner",4,5,"Manual");

        System.out.println(c1.name+ " " +c1.model);

        c1.startEngine();
        c1.startAc();
        c1.stopEngine();

    }
}
     
//Class Created --
        class student{
        int id;
        String name;
        int age;
        String course;
        // private String gf;

        //1. Default Constructor

        //2. Parametriesed constructor
         student(int id, String name, int age, String course,String gf){
            this.id=id;
            this.name=name;
            this.age=age;
            this.course=course;
            // this.gf=gf;
        }

        //3. Copy Constructor
        // student(student srcobj){
        //     this.id=srcobj.id;
        //     this.name=srcobj.name;
        //     this.age=srcobj.age;
        //     this.course=srcobj.course;
            
        // }

        void marks(){
            System.out.println(name + " marks");
        }
        
        void sleep(){
            System.out.println(name+ " sleep");
        }

        void eat(){
            System.out.println(name+" eat");
        }

        void bunk(){
            System.out.println(name+" bunk");
        }

        // private void gfchatting(){
        //     System.out.println(name + " gf-chatting");
        // }
    }