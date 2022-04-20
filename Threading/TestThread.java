package Threading;

// // With extend Thread

// class hi extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class hello extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class TestThread {
//     public static void main(String[] args) {
//         // for (int j = 0; j < 5; j++) {
//         //     try {
//         //         Thread.sleep(1000);
//         //     } catch (InterruptedException e) {

//         //         System.out.println(e);
//         //     }
//         //     System.out.println(j);
//         // }

//         hi h = new hi();
        
//         h.start();
//         try {
//             Thread.sleep(10);
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//         hello h2 = new hello();
//         h2.start();
//     }
// }


// With runnable interface 


class hi implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class hello implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class TestThread {
    public static void main(String[] args) {


        hi h = new hi();
        hello h2 = new hello();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h2);

        
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();
    }
}
