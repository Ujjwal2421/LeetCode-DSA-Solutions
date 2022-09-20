package StackPractise;

import java.util.Stack;

public class PermutationCount {
    public static void main(String[] args) {
        System.out.println(countNumber(100));
    }
    static int countNumber(int n)
    {
        int result = 0;

        // Pushing 1 to 9 because all number from 1
        // to 9 have this property.
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 9; i++)
        {

            if (i <= n)
            {
                s.push(i);
                result++;
            }

            // take a number from stack and add
            // a digit smaller than or equal to last digit
            // of it.
            while (!s.empty())
            {
                int tp = s.pop();

                for (int j = tp % 10; j <= 9; j++)
                {
                    int x = tp * 10 + j;
                    if (x <= n) {
                        s.push(x);
                        result++;
                    }else {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
