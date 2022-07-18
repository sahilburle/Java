package src.work;

public class Main {
    public static void main(String[] args) {

        System.out.println("My system starts..");

//        MyInter myInter = new MyInterImpl();
//        myInter.sayHello();

        MyInter i=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is 1st anonymous class");
            }
        };

        i.sayHello();

        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is 2nd anonymous class");
            }
        };

        i2.sayHello();

    }
}
