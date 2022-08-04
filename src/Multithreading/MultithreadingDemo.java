package Multithreading;


//First method is to extend the Thread class and override the run method of thread class
//public class MultithreadingDemo extends Thread{
//
//    @Override
//    public void run() {
//        System.out.println(currentThread().getName());
//    }
//
//    public static void main(String[] args) {
//        var obj = new MultithreadingDemo();
//        for(int i = 0; i < 5; i++){
//            obj = new MultithreadingDemo();
//            obj.start();
//        }
//    }
//}



// 2nd way is to implement runnable interface, this functional interface has abstract run method
// which needs to be implemented, then pass this object of Runnable interface in object of Thread


import static java.lang.Thread.currentThread;

public class MultithreadingDemo{

    public static void main(String[] args) {
        Runnable r = () -> System.out.println(currentThread().getName());
        var t = new Thread(r);
//        for(int i = 0; i < 5; i++){
//            t = new Thread(r);
//            t.start();
//        }


        //ThreadGroup

        ThreadGroup threadGroup = new ThreadGroup("Group1");

        var a = new Thread(threadGroup,r,"Thread1");
        var b = new Thread(threadGroup,r,"Thread2");
        var c = new Thread(threadGroup,r,"Thread3");
        var d = new Thread(threadGroup,r,"Thread4");
        var e = new Thread(threadGroup,r,"Thread5");
        var f = new Thread(threadGroup,r,"Thread6");



        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();

        System.out.println(threadGroup.getName());
        threadGroup.list();


    }

}

