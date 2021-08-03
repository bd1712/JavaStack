package algorithmenDatenstruktur;

public class ProportionalSuchen {
    int[] arraySorted = {2, 9, 14, 19, 26, 32, 34, 38, 44, 53, 55, 65, 68, 69, 72, 75, 80, 89};
    int w = 72;
    int wmin;
    int wmax;

    public int search() {
        if (w < wmin || w > wmax)
            return -1;
        int s = (int) (((long) (w - wmin) * (long) (arraySorted.length - 1)) / (long) (wmax - wmin));
        if (w == arraySorted[s])
            return s;
        return 0;
    }

    public static void main(String[] args) {
        int[] integers = {2, 9, 14, 19, 26, 32, 34, 38, 44, 53, 55, 65, 68, 69, 72, 75, 80, 89};

        //the element that should be found
        int key = 72;
        ProportionalSearch search = new ProportionalSearch();
        int atIndex = search.find(key, integers);
        System.out.println("Remember array index starts from 0");
        System.out.println("The size of the array is : " + integers.length);
        System.out.println(" der Wert befindet sich in index : "+ atIndex);
    }
}