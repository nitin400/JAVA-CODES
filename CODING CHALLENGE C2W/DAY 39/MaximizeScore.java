import java.util.*;

public class Solution {

public static int maximizeScore(ArrayList<Integer> arr, int n, int k) {

int sum = 0;

for(int num: arr){

sum += num;

}

if(k == n) return sum;

int i = 0, j = 0;

int ref = 0;

int ans = 0;

while(i < n){

ref += arr.get(i);

if(i-j+1 == n-k){

ans = Math.max(ans, sum-ref);

ref -= arr.get(j);

j++;

}

i++;

}

return ans;

}

}


