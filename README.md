# Dailies
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
// Manual update to trigger green square
//begin here
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int m;
            m = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            String res = obj.compareNM(n, m);
            
            System.out.println(res);
            
        //JAVA END LINE
        
System.out.println("~");
}
    }
}


// } Driver Code Ends

// User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
      if (n<m){
          return "lesser";
      }else if (n==m){
          return "equal";
      }else{return"greater";
      }
    }
}

//end here

//{ Driver Code Starts.

// } Driver Code Ends
