package cbnits;

public class Twodararray {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int[][] array=new int[5][3];
        for(int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                array[i][j]=0;
            }

        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.println(array[i][j]);
            }
            System.out.println();
        }

    }
}
