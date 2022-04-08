package sub.threadmgmt;


class ThreadCounter {
    static class Counter {

        private int value = 0;

        public void increment() {
            value++;
        }

        public int getValue() {
            return value;
        }
    }

    static class MyThread extends Thread {

        private Counter counter;

        public MyThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            counter.increment();
            counter.increment();
            counter.increment();
            System.out.println(counter.getValue());
        }
    }



    public static void main(String[] args) throws InterruptedException {

//        SomeClass someClass = new SomeClass();
//        MyThread t1 = new MyThread(someClass);
//        Thread anotherClass = new SomeClass();
//        anotherClass.start();

//        Counter counter = new Counter();
//
//        counter.increment();
//
//        counter.increment();
//
//        MyThread thread = new MyThread(counter);
//        thread.start();
//
//        thread.join(); // waiting for the thread
//
//        int result = counter.getValue();
//        System.out.println(result);
    }
}


