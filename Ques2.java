//Find the Largest element in an array

public class Ques2 {
 
    
public static void main(String[] args) {
     int a[] = new int[] {11, 22,45,100};
     int max=a[0];

     for(int i=1;i<a.length;i++)
     {
        if(a[i]> max)
        {
            max=a[i];
        }
     }

     System.out.println("Largest number "+ max);
}

   
}
