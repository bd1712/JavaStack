package ubungen1;


    public class LinkedQueue {

        /**
         * Aktuelles Warteschlangenelement (front).
         */
        int value;

        /**
         * Referenz auf Restschlange.
         */
        LinkedQueue next;

        public static LinkedQueue init() {
            return null;
        }

        public static LinkedQueue insert(int e, LinkedQueue q) {
            if (q == null) {

                LinkedQueue newElem = new LinkedQueue();
                newElem.value = e;
                newElem.next = null;
                return newElem;

            } else {

                LinkedQueue runner = q;

                while(runner.next != null) {
                    runner = runner.next;
                }

                LinkedQueue newElem = new LinkedQueue();
                newElem.value = e;
                newElem.next = null;
                runner.next = newElem;

                return q;
            }
        }

        public static LinkedQueue remove(LinkedQueue q){
            //implementieren sie falls notwendig
            return null;
        }

        public static int front(LinkedQueue q){
            //implementieren sie falls notwendig
            return 0;
        }

        public static void txt(LinkedQueue q){
            //zur Ausgabe einer Schlange
            //implementieren sie falls notwendig
        }

        public static double meanResponseTime(LinkedQueue q){
            return 0;
        }

        public static void main(String[] args) {

            LinkedQueue myQueue = init();

            int randomLength = 5 + (int)(Math.random()*25.);

            for(int i = 0; i<randomLength; i++) {

                int randomValue = 1+(int)(Math.random()*19.);
                myQueue = insert(randomValue, myQueue);

            }

            txt(myQueue);

        }

}
