package src.work;

public class Main {
    public static void main(String[] args) {

        System.out.println("My system starts..");

//        MyInter myInter = new MyInterImpl();
//        myInter.sayHello();

//        MyInter i=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is 1st anonymous class");
//            }
//        };
//
//        i.sayHello();
//
//        MyInter i2 = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is 2nd anonymous class");
//            }
//        };
//
//        i2.sayHello();

        //using our interface with the help of lambda

        MyInter i = () -> {
            System.out.println("this is first time i am using lambda");
        };

        // this is 2nd way
        MyInter i2 = () -> System.out.println("this is 2nd time i am using lambda");

        i.sayHello();
        i2.sayHello();

        SumInter s = (int a, int b) -> {
            System.out.println("printing sum");
            return a+b;
        };

        System.out.println(s.sum(1,2));

        LengthInter l = str -> str.length();

        System.out.println(l.getLength("btao kya length hai"));

    }
}
