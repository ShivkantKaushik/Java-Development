package LambdaFuctions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ProductComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}


interface LambdaDemo {
    int add(int a, int b);
}

class MethodReference{
    static int add(int a, int b){
        return a*b;
    }
}


public class Lambda {
    public static void main(String[] args) {
       List<String> li = Arrays.asList("a", "cbc", "ef", "bcd");

// without lambda functions
//       li.sort(new ProductComparator());


    // with lambda functions
    // here .sort method is expecting an object of comparator class, so our lambda expression would create,
    // an object of comparator class, and assign the code to abstract function of that object
    li.sort( (a,b) -> a.compareTo(b));

       for(String s: li){
           System.out.println(s);
       }


       // lambda demo
        // (int a, int b) -> a+b , this statement would be the definition of abstract function
        // of interface LambdaDemo, and this statement here would create object of type LambdaDemo and assign it to ld
        LambdaDemo ld = (a,b) -> a+b;
        System.out.println(ld.add(4,5));


        //Method Reference
        //same as lambda expression,just short expression for lambda expression
        ld = MethodReference::add;
        System.out.println(ld.add(4,5)); // should return multiplication of integers

    }
}
