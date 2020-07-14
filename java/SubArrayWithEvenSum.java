// Java program to count number  
// of sub-arrays whose sum is  
// even using brute force  
// Time Complexity - O(N^2) 
// Space Complexity - O(1)  

  
class GFG 
{ 
static int countEvenSum(int arr[],  
                        int n) 
{ 
    int result = 0; 
  
    // Find sum of all subarrays  
    // and increment result if 
    // sum is even 
    for (int i = 0; i <= n - 1; i++) 
    { 
        int sum = 0; 
        for (int j = i; j <= n - 1; j++) 
        { 
            sum = sum + arr[j]; 
            if (sum % 2 == 0) 
                    result++; 
        } 
    } 
  
    return (result); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
int arr[] = {1, 2, 2,  
             3, 4, 1}; 
int n = arr.length; 
  
System.out.print("The Number of Subarrays"+  
                     " with even sum is "); 
                       
System.out.println(countEvenSum(arr, n)); 
} 
} 
