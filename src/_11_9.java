import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class _11_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n=input.nextInt();
        int [][]array=new int[n][n];
        int[]array1=new int[n];
        int[]array2=new int[n];
        int max1=0;
        int max2=0;
        int cot=0;
        for(int i=0;i<n;i++){
            cot=0;
            for(int j=0;j<n;j++){
                array[i][j]=(int)(Math.random()*2);
                cot=cot+array[i][j];
            }array1[i]=cot;
            max1=Math.max(max1,cot);
        }
        for(int j=0;j<n;j++){
            cot=0;
            for(int i=0;i<n;i++){
                cot=cot+array[i][j];
            }
            array2[j]=cot;
            max2=Math.max(max2,cot);
        }
        System.out.println("The random array is");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("The largest row index: ");
        int num =0;
        for(int i=0;i<n;i++){
            if(array1[i]==max1){

                if(num!=0){
                    System.out.print(", ");

                }
                System.out.print(i);
                num++;
            }
        }
        System.out.print("\nThe largest column index: ");
       num=0;
        for(int i=0;i<n;i++){
            if(array2[i]==max2){


                if(num!=0){
                    System.out.print(", ");

                }
                System.out.print(i);num++;
            }
        }
    }
}
