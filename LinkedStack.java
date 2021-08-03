package ubungen1;


    class StackElement {
        Object value;
        StackElement next;
    }

    public class LinkedStack {

        static Object errorelement = -1;
        static LinkedStack errorstack = null;

        private StackElement top;
        private int depth;


        public static LinkedStack init() {
            LinkedStack s = new LinkedStack();
            s.top = null;
            s.depth = 0;
            return s;

        }
        public static LinkedStack push (Object o , LinkedStack s ) {
            if (o ==errorelement) {
                return null;
            }
            if (s == errorstack) {
                return errorstack;
            }
            StackElement sc = new StackElement();

            sc.value = o;
            sc.next = s.top;
            s.depth += 1;
            s.top = sc;
            return s;
        }

        public static LinkedStack pop(LinkedStack s){
            if(s!=null){
                s.top=s.top.next;
                s.depth --;
                return s;
            }
            return null;
        }
        public static StackElement top(LinkedStack s ){
            if(s==null){
                return null;
            }else
                return s.top;
        }
        public static int depth(LinkedStack s) {
            if (s != null) {
                return s.depth;
            }
            return -1;
        }

        public static boolean empty(LinkedStack s){
            if(s==null){
                return false;
            }
            if (s.depth==0){
                return true;
            }
            else
                return false;
        }

        public static boolean isErrorStack(LinkedStack s){
            if (s==null){
                return true;
            }else
                return false;
        }

        public static void main(String[] args) {
            LinkedStack sd = LinkedStack.init ();
            if(empty(sd)){
                System.out.println("leer");
            }

            sd=push(5,sd);
            sd= push(4,sd);
            sd=push(6,sd);

            System.out.println(top(sd).value);
            System.out.println(pop(sd));
            System.out.println(depth(sd));
            System.out.println(top(sd));
        }

    }

