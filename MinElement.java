import java.util.*; 
  
class MinElement { 

    public static int findMinRec(int A[], int n) 
    { 
      if(n == 1) 
        return A[0]; 
          
        return Math.min(A[n-1], findMinRec(A, n-1)); 
    } 

    public static void main(String args[]) 
    { 
      
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array :");
        int count=sc.nextInt();
        int[] arr =new int[count]; 
        int n = arr.length; 
        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }		
		
          
        System.out.println("Smallest Element :"+findMinRec(arr, n)); 
    } 
} 