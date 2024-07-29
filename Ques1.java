// Q1: Find the smallest number in  an array.

class Ques1{
     public static void main(String[] args) {
        
        int a[]= new int[]{ 10,20,6,40,3};
        int min= a[0];

        
        for( int i=1;i<a.length;i++)
        {
            if( a[i] <min)
            {
               min= a[i];
            }
        }
         System.out.println("Smallest Number "+ min);
     }
}