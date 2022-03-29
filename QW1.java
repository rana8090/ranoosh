import javafx.beans.binding.StringExpression;

import java.util.Stack;
/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QW1 {
    static int prec(char RA)
    {
        if (RA=='+'||RA=='-')
            return 1;
        if (RA=='*'||RA=='/')
            return 2;
        if (RA=='^')
            return 3;
        return -1;

    }
    static String Expression(String exp)
    {
        String result =new String("");
        StackPostfix<Character> stack=new StackPostfix<>();
        for (int i = 0; i <exp.length() ; i++) {
            char W=exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                result+=c;
            else if (W=='(')
                stack.push(W);
            else if (W==')')
            {
                while (!stack.isEmpty()&&prec(W)<=prec(stack.top()))
                {
                    result +=stack.pop();
                }
                stack.puch(W);
            }
        }
        while (!stack.isEmpty())
        {
            if (stack.top()=='(')
                return "";
            result+= stack.pop;
        }
        return result;
    }

    public static void main(String[] args) {
        String exp="((8+3)*(5-1)/2";
        System.out.println(Expression(exp));
    }

}


