package sub.threadmgmt;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

  //     StartingRunnables.createRunnable("did it", 3).run();

        String  textArea = "When forty winters shall besiege thy brow\n" +
                "And dig deep trenches in thy beauty’s field,\n" +
                "Thy youth’s proud livery, so gazed on now,\n" +
                "Will be a tattered weed of small worth held.\n" +
                "Then being asked where all thy beauty lies,\n" +
                "Where all the treasure of thy lusty days,\n" +
                "To say within thine own deep-sunken eyes\n" +
                "Were an all-eating shame and thriftless praise.\n" +
                "How much more praise deserved thy beauty’s use\n" +
                "If thou couldst answer “This fair child of mine\n" +
                "Shall sum my count and make my old excuse,”\n" +
                "Proving his beauty by succession thine.\n" +
                "This were to be new made when thou art old\n" +
                "And see thy blood warm when thou feel’st it cold.\n";

        String foundText = "thy";

        ArrayList<Integer> searchIndexes = new ArrayList<>();

        searchIndexes.add(textArea.indexOf(foundText));

        int start = searchIndexes.get(0) + foundText.length();
        System.out.println(start);
        while ((start = textArea.indexOf(foundText, start)) != -1) {
            System.err.println(start + "   " + textArea.indexOf(foundText, start));
            searchIndexes.add(start);
            start += foundText.length();
            System.err.println(start + "  " + textArea.indexOf(foundText, start));
        }
        System.err.println(searchIndexes);

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


