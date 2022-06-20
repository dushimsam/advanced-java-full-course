public class Multithreading {

    public static void main(String[] args) throws Exception {

        
            MultithreadingThing thing = new MultithreadingThing();
            Thread thread1 = new Thread(thing);
            thread1.setName("Thread - 1");
            
            Thread thread2 = new Thread(thing);
            thread2.setName("Thread - 2");

            
            // Get the priority of the thread
            // By default the both threads have the same priority
            // Range of priorities  1 - 10
            // 1 - means lowest priority
            // 10 - means highest priority
            // 5 - general priority
            thread2.setPriority(10);


            // Get the name of the thread
            System.out.println("Thread's name is " + thread1.getName());

            thread1.start();
            thread2.start();
          
            // Join avoids the multithreading behaviour , waits for one thread to finish
            // before it takes another one
            thread1.join();


            // Check if the thread is still running . In order words it has not completed
            // it's intended iterations
            System.out.println("Thread-1 is running  " + thread1.isAlive());

            // Check the thread1's priority
            System.out.println("Thread-1's priority is  " + thread1.getPriority());

            // Number of the running threads
            System.out.println("Number of threads "+Thread.activeCount());

        }
    }

