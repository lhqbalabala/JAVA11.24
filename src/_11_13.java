import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class _11_13 {
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i< list.size();i++){
            int a=list.get(i);
            if(!list1.contains(a)){
                list1.add(a);
            }
        }
        list.clear();
        for (int i=0;i<list1.size();i++){
            list.add(list1.get(i));
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        int n=10;
        System.out.print("Enter ten integers: ");
        for(int i=0;i<n;i++){
            arrayList.add(input.nextInt());
        }
        removeDuplicate(arrayList);
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }



    }
}
