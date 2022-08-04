package Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface ChangeDetails{
    int value() default 10;
}

@ChangeDetails
class Phone{
    int i = 9;
}


public class CustomAnnotations {

    public static void main(String[] args) {
        Phone ph = new Phone();
        Class c = ph.getClass();

        ChangeDetails out  = (ChangeDetails) c.getAnnotation(ChangeDetails.class);

        System.out.println(out.value());
    }
}
