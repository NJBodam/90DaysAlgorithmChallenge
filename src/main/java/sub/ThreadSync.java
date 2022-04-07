package sub;

class ThreadSync extends Thread {

    // Here we demonstrate the static synchronized method and instance synchronized method

    // We first created a class ThreadSync that extends thread and give it a synchronized method
    // Then we created another class Mythread that extends thread and takes the ThreadSync object
    // as a field.

    // After which we created a main method, passed in two instances of the ThreadSync
    // and two instances of Mythread that takes in ThreadSync objects.
    // Now we have two threads with concurrent access to the same method doSomething().

    // Removing the synchronize keyword will cause multiple threads to access the method concurrently.
    // The synchronize keyword protects our code from being accessed by multiple threads concurrently

    // This demonstrates a static synchronized method. Where it is impossible for more than one thread
    // To execute the code in the method at the same time.



    // The field and constructor below are for Synchronized instance method
    private String name;

    public ThreadSync(String name) {
        this.name = name;
    }
    //

    // Static synchronized method
    public static synchronized void doSomething() {

        String threadName = Thread.currentThread().getName();
        System.out.println(String.format("%s entered the method", threadName));
        System.out.println(String.format("%s stays in the method", threadName));
        System.out.println(String.format("%s stays in the method", threadName));
        System.out.println(String.format("%s stays in the method", threadName));
        System.out.println(String.format("%s stays in the method", threadName));
        System.out.println(String.format("%s stays in the method", threadName));
        System.out.println(String.format("%s stays in the method", threadName));
        System.out.println(String.format("%s stays in the method", threadName));
        System.out.println(String.format("%s leaves the method", threadName));
    }

    // instance synchronized method
    public synchronized void doAnotherThing() {
        String threadName = Thread.currentThread().getName();
        System.out.println(String.format("%s entered the method of %s", threadName, name));
        System.out.println(String.format("%s stays in the method of %s", threadName, name));
        System.out.println(String.format("%s stays in the method of %s", threadName, name));
        System.out.println(String.format("%s stays in the method of %s", threadName, name));
        System.out.println(String.format("%s stays in the method of %s", threadName, name));
        System.out.println(String.format("%s stays in the method of %s", threadName, name));
        System.out.println(String.format("%s leaves the method of %s", threadName, name));
    }

    public static void main(String[] args) throws InterruptedException {

        // IMPLEMENTATION FOR INSTANCE SYNCHRONIZED METHODS
        ThreadSync ts1 = new ThreadSync("first-instance");
        ThreadSync ts2 = new ThreadSync("second-instance");
        Mythread t2 = new Mythread(ts1);
        Mythread t3 = new Mythread(ts1);
        Mythread t4 = new Mythread(ts2);
        t2.start();
        t3.start();
        t4.start();

        // IMPLEMENTATION FOR STATIC SYNCHRONIZED METHODS
//        ThreadSync ts1 = new ThreadSync();
//        ThreadSync ts2 = new ThreadSync();
//
//        Mythread t1 = new Mythread(ts1);
//        Mythread t2 = new Mythread(ts2);
//        t1.start();
//        t2.start();
    }

    static class Mythread extends Thread {

        private ThreadSync threadSync;

        public Mythread(ThreadSync threadSync) {
            this.threadSync = threadSync;
        }

        @Override
        public void run() {
            // Invoking static synchronized method
           // ThreadSync.doSomething();

            // Invoking instance method
            threadSync.doAnotherThing();
        }
    }
}
