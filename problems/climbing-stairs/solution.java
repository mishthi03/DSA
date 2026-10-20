class Solution {
    public int climbStairs(int n) {

    //   //base case i. using recursion
    //   if(n == 1){
    //     return 1;
    //   }

    //   if(n == 2){
    //     return 2;
    //   }
    //   //recursive relation
    //   int ans = climbStairs(n - 1) + climbStairs(n - 2);
    //   return ans;

    }
}

//using for loop
        if(n<=2){
            return n;
        }
        int a =1, b=2, d;
        for(int i=3; i<=n; i++){
           d = a+b;
            a=b;
            b=d;
        }
        return b;
            
    }
    }


     