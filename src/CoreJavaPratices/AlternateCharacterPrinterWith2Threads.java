package CoreJavaPratices;

public class AlternateCharacterPrinterWith2Threads {

    private static String inputString;
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {
        inputString = "HelloWorld";

        Thread evenThread = new Thread(new EvenCharacterPrinter());
        Thread oddThread = new Thread(new OddCharacterPrinter());

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class EvenCharacterPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < inputString.length(); i += 2) {
                synchronized (AlternateCharacterPrinterWith2Threads.class) {
                    while (!isEvenTurn) {
                        try {
                            AlternateCharacterPrinterWith2Threads.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.print(inputString.charAt(i));
                    isEvenTurn = false;
                    AlternateCharacterPrinterWith2Threads.class.notify();
                }
            }
        }
    }

    static class OddCharacterPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i < inputString.length(); i += 2) {
                synchronized (AlternateCharacterPrinterWith2Threads.class) {
                    while (isEvenTurn) {
                        try {
                            AlternateCharacterPrinterWith2Threads.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.print(inputString.charAt(i));
                    isEvenTurn = true;
                    AlternateCharacterPrinterWith2Threads.class.notify();
                }
            }
        }
    }
}
