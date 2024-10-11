package MultiThreading;

public class DaemonThread extends Thread{
//Daemon Thread is runs in the background, performing tasks like garbage collection or other low-priority operations.
// Unlike regular threads (called user threads), daemon threads do not prevent the JVM from exiting.
// When all user threads finish their execution, the JVM terminates, even if there are daemon threads running.

        @Override
        public void run() {

            while (true) {
                Thread daemonThread1=new Thread(()->{
                    System.out.println("In DT1");
                });
                System.out.println("Thread State: "+ Thread.currentThread().getName());
                System.out.println("Thread State: "+ Thread.currentThread().getState());
                System.out.println("Daemon thread is running...");

//                daemonThread1.start();
                try {
                    Thread.sleep(1000000000);
                   // daemonThread1.interrupt();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }}


    class DaemonEx {
        public static void main(String[] args) {
            System.out.println("Thread State: "+ Thread.currentThread().getName());
            System.out.println("Thread State: "+ Thread.currentThread().getState());
            MultiThreading.MethodsOfMultiT daemonThread = new MultiThreading.MethodsOfMultiT();
            daemonThread.setDaemon(true); // Set this thread as daemon
            daemonThread.start();
//            daemonThread.stop();
//            daemonThread.interrupt();
              System.out.println("Main thread is finished");
            System.out.println(daemonThread.isAlive());



            System.out.println("Thread State: "+ Thread.currentThread().getName());
            System.out.println("Thread State: "+ Thread.currentThread().getState());
            // The JVM will exit once the main thread finishes, terminating the daemon thread
        }
    }

