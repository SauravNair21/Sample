import java.util.Scanner;
class LinearSearch { 
    
    static int search(int arr[], int n, int x) 
    { 
        for (int i = 0; i < n; i++) { 
           
            if (arr[i] == x) 
                return i; 
        } 
  

        return -1; 
    } 
  
    public static void main(String[] args) 
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
	
        
        System.out.println("Enter the element to be found :");
        int x = sc.nextInt(); 
  
        int index = search(arr, n, x); 
        if (index == -1) 
            System.out.println("Element is not present in the array"); 
        else
            System.out.println("Element found at position " + index); 
    } 
} 