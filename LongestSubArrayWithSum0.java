//{ Driver Code Starts
import java.util.*;

class LongestSubArrayWithSum0
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Key : ps value: CI
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int ans = 0;
        
        map.put(prefixSum, -1);
        
        for(int i = 0 ; i<n ; i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum))
                ans = Math.max(ans, i - map.get(prefixSum));
            else
                map.put(prefixSum,i);
        }
        
        return ans;
        
    }
}