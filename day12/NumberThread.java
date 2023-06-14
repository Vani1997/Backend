package day12;


    class NumberThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            // Create an instance of the NumberThread class
            NumberThread numberThread = new NumberThread();


            // Start the thread
            numberThread.start();
        }
    }


