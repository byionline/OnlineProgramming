// Java program to count number  of SubArray
// Time Complexity - O(N^2) 
// Space Complexity - O(1)  

  
class CountSubArray 
{ 
static int count(int arr[], int n) 
{ 
    int count = 0; 
  
    // Find No. of Subarrays  
    
    for (int i = 0; i <= n - 1; i++) 
    { 
       
        for (int j = i; j <= n - 1; j++) 
        { 
            count++; 

        } 
    } 
  
    return (count); 
} 
  
public static void main (String[] args)  
{ 
int arr[] = {1, 2, 2, 3, 4, 1}; 
int n = arr.length; 
  
System.out.print("The Number of Subarrays"+ " "); 
                       
System.out.println(count(arr, n)); 
} 
} 
