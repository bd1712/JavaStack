package algorithmenDatenstruktur;

    /**
     * Interpolation search is an algorithm for searching for a given key in an indexed array.
     * @author
     */
    public class ProportionalSearch{

        private static int[] sorted = { 2, 9, 14, 19, 26, 32, 34, 38, 44, 53, 55, 65, 68, 69, 72, 75, 80, 89};

        // Assuming the array is sorted
        public static final int find(int value, int[] array) {
            ProportionalSearch.sorted = array;
            try {
                return recursiveFind(value, 0, ProportionalSearch.sorted.length - 1);
            } finally {
                ProportionalSearch.sorted = null;
            }
        }

        private static int recursiveFind(int value, int start, int end) {
            if (start == end) {
                int lastValue = sorted[start]; // start==end
                if (value == lastValue)
                    return start; // start==end
                return Integer.MAX_VALUE;
            }

            final int mid = start + ((value - sorted[start]) * (end - start)) / (sorted[end] - sorted[start]);
            if (mid < 0 || mid > end)
                return Integer.MAX_VALUE;
            int midValue = sorted[mid];
            if (value == midValue)
                return mid;
            if (value > midValue)
                return recursiveFind(value, mid + 1, end);
            return recursiveFind(value, start, mid - 1);
        }

        public static void main(String[] args) {
            int[] integers = {2, 9, 14, 19, 26, 32, 34, 38, 44, 53, 55, 65, 68, 69, 72, 75, 80, 89};

            //the element that should be found
            int key = 72;

            ProportionalSearch search = new ProportionalSearch();
            int atIndex = search.find(key, integers);

            System.out.println("Remember array index starts from 0");
            System.out.println("The size of the array is : " + integers.length);
            System.out.println("The element found at index : " + atIndex);
        }
    }

