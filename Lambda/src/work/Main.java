package src.work;

public class Main {
    public static void main(String[] args) {

        System.out.println("My system starts..");

//        MyInter myInter = new MyInterImpl();
//        myInter.sayHello();

        MyInter i=new MyInter() {
            @Override
            public void sayHello() {

            }
        };

        i.sayHello();

        
    }
}
