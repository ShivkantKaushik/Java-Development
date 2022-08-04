package ForTesting;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Best {
    int add (int a, int b){
        return a + b;
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(3);

        List li = arr.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
    }
}
