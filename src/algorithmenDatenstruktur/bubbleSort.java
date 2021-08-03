package algorithmenDatenstruktur;

public class bubbleSort {     // ПУЗЫРКОВАЯ СОРТИРОВКА

    public static void main(String[] args) {
        int[] array = new int[]{64, 36, 87, 38, 90, 26, 57, 34, 67, 53, 37, 69};
        bubbleSort(array);
        System.out.println(arrayToString(array)); //
    }

   public static void bubbleSort(int[]array){
        boolean isSorted = false;        //angenommen ist sortiert
        while(!isSorted) {             //solange wenn es noch nicht sortiert
            isSorted = true;                    // sortiert

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {         //wenn rechte Seite grosser als linke Seite
                    int temp = array[i];           //wir verstauschen es mit belibigen Variable
                    array[i] = array[i - 1];
                    array[i - 1] = temp;            //  wurde Vertauschung gemacht
                    isSorted = false;           //sonst geben wir zuruck false
                }
            }
        }
        }

    private static String arrayToString(int []array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<array.length;i++) {
            if(i>0) {
                sb.append(",");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

