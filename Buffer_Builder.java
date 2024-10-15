package String;//package String;
//
//class Buffer_Builder {
//
//        // Shared resources
//        static StringBuffer stringBuffer = new StringBuffer();
//        static StringBuilder stringBuilder = new StringBuilder();
//
//        public static void main(String[] args) throws InterruptedException {
//            // Create two threads for StringBuffer
//            Thread thread1 = new Thread(() -> appendStringBuffer("Thread 1 "));
//           // Thread thread2 = new Thread(() -> appendStringBuffer("Thread 2 "));
//
//            // Create two threads for StringBuilder
//            Thread thread3 = new Thread(() -> appendStringBuilder("Thread 3 "));
//            //Thread thread4 = new Thread(() -> appendStringBuilder("Thread 4 "));
//
//            // Start threads for StringBuffer
//            thread1.start();
//           // thread2.start();
//
//            // Wait for both threads to finish
//            thread1.join();
//            //thread2.join();
//
//            // Print result for StringBuffer (synchronized, so thread-safe)
//            System.out.println("StringBuffer result: " + stringBuffer);
//
//            // Start threads for StringBuilder
//            thread3.start();
//           // thread4.start();
//
//            // Wait for both threads to finish
//            thread3.join();
////            thread4.join();
//
//            // Print result for StringBuilder (non-synchronized, so not thread-safe)
//            System.out.println("StringBuilder result: " + stringBuilder);
//        }
//
//        // Method to append data using StringBuffer (synchronized)
//        public static void appendStringBuffer(String str) {
//            for (int i = 0; i < 10; i++) {
//                stringBuffer.append(str).append(i).append(" ");
//            }
//        }
//
//        // Method to append data using StringBuilder (not synchronized)
//        public static void appendStringBuilder(String str) {
//            for (int i = 0; i < 10; i++) {
//                stringBuilder.append(str).append(i).append(" ");
//            }
//        }
//
//
//}

public class Buffer_Builder {

    static StringBuilder stringBuilder = new StringBuilder();
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> appendStringBuilder("Thread1"));
        Thread thread2 = new Thread(() -> appendStringBuilder("Thread2"));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        Thread thread3 = new Thread(() -> appendStringBuffer("Thread1"));
        Thread thread4 = new Thread(() -> appendStringBuffer("Thread2"));

        System.out.println("Final StringBuilder result: " + stringBuilder);

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();

        System.out.println("Final StringBuffer result: " + stringBuffer);
    }

    private static void appendStringBuffer(String str) {
        for (int i = 0; i < 100; i++) {
//            stringBuffer.append(str).append(" "+ i);\
            System.out.println(stringBuffer+" "+i);
        }
    }


    public static void appendStringBuilder(String str) {
        for (int i = 0; i < 100; i++) {
//            stringBuilder.append(str).append(" "+ i);
            System.out.println(stringBuilder+" "+i);
        }
    }
}
