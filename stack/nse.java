import java.util.*;
public class nse {
    public static void main(String args[]) {
        int[] arr = {4, 8, 5, 2, 25};
        int [] ans = next_smaller_element(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    static int[] next_smaller_element(int[] arr)
    {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[i] >stack.peek())
            {
                ans[i]=stack.pop();
            }
            ans[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }

}