package com.javacourse.se;

public class Arrays_of_String {
    public static void main(String[] args) {
        int []numbers= new int[5];
        numbers[0]=11;
        numbers[1]=12;
        numbers[2]=13;
        numbers[3]=14;
        numbers[4]=15;
       for(int a=0;a<numbers.length;a++)  // чем все выходы писать , можно использовать for<-
        System.out.println(numbers[a]);
        System.out.println();
        String [] strings= new String[3];
        strings[0]="hello";
        strings[1]= "bye";
        strings[2]="how are you?";
        /*System.out.println(strings[0]); // можно и не писать , если мы используем for schleife
        System.out.println(strings[1]);
        System.out.println(strings[2]);
*/

        System.out.println();
        for(int i=0; i<strings.length;i++){
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String string: strings){   // цикл for-each удоьно для массивом
            System.out.println(string);
        }
        int[]numbers2= {5,7,8} ; //
        int sum=0;
        for(int x:numbers2){
            sum=sum+x;
        }
        System.out.println();
        System.out.println(sum);
    }

}
