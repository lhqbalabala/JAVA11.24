import java.util.Scanner;
class point{
    public double x;
    public double y;
    point(){
        this.x=0;
        this.y=0;
    }
}
public class _11_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int n=input.nextInt();
        System.out.println("Enter the coordinates of the points:");
        point[] list=new point[n];
        for(int i=0;i<n;i++){
            list[i]=new point();
        }
        for (int i=0;i<n;i++){
            list[i].x=input.nextDouble();
            list[i].y=input.nextDouble();
        }
        float temp=0;
        for(int i=0;i<n-1;i++){
            temp+=(list[i].x-list[i+1].x)*(list[i].y+list[i+1].y);
        }
        temp+=(list[n-1].x-list[0].x)*(list[n-1].y+list[0].y);
        System.out.print("The total area is "+-temp/2);
    }
}
