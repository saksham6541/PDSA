import java.util.*;
public class pse {
    public static void main(String args[]) {
        int[] arr = {4, 8, 5, 2, 25};
        int [] ans = previous_smaller_element(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    static int[] previous_smaller_element(int[] arr)
    {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[i] <stack.peek())
            {
                stack.pop();
            }
            ans[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }

}