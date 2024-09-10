package CoreJavaPratices;

public class FileThread {

    int x = 5;

    public void printValue() {
        int x = 100;
        System.out.println(x);
    }

    public static void main(String[] args) {
        FileThread fileThread = new FileThread();
        fileThread.printValue();
//            thread's priority is represented by an integer value ranging from 1 to 10
        Thread myThread = new Thread(() -> {
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        });
        myThread.setPriority(Thread.MIN_PRIORITY);
//            myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
    }
}
