# Dailies
//{ Driver Code Starts
//Initial Template for Java
// Manual update to trigger green square
//begin here
class GFG {
    public static void main(String[] args) throws IOException {
   
            
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
