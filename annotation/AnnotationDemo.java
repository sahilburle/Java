package annotation;

import java.lang.annotation.*;
import java.util.ArrayList;

/*
@FunctionalInterface
// a functional interface has exactly one abstract method
interface Abc {
    void show();
    void uu();      //if we write one more we will get an error
}

class A {
    public void showMyDataFromLastYearDatabase() {
        System.out.println("in A");
    }
}

class B extends A {

    @Deprecated     //don't use this method
    public void show() {

    }

    @Override  //to override
    //The SuppressWarning annotation is used to suppress compiler warnings for the annotated element.
    //Specifically, the unchecked category allows suppression of compiler warnings generated as a result of unchecked type casts.
    @SuppressWarnings("unchecked")      
    public void showMyDataFromLastYearDatabase() {
        ArrayList obj = new ArrayList<>();
        System.out.println("in B");
    }
}*/

//Marker Annotation     -> no value annotation
//Single Value Annotation   -> single value only
//Multi value annotation    -> multiple value

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//this is how we create annotation
@interface SmartPhone {     //when u create like this annotation it is a subclass of annotation
    String OS() default "Symbian";
    int version() default 1; //Multi-value aanotation
}

@SmartPhone(OS = "Android", version = 6)    // this will override the value mentioned above
class NokiaSeries{
    String model;
    int size;

    public NokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

public class AnnotationDemo {

    public static void main(String[] args) {
        /*B obj = new B();
        obj.showMyDataFromLastYearDatabase();

        obj.show();*/

        NokiaSeries obj = new NokiaSeries("Fire", 5);
        //System.out.println(obj.model);

        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println(s.OS());

    }

}
