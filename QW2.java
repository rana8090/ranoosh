import java.util.Stack;
/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QW2 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<Integer>();
        stack.push(14);
        stack.push(19);
        stack.push(39);
        stack.push(26);
        stack.push(2);
        System.out.println("stack:"+stack);
        System.out.println("popped element:"+stack.pop());
        System.out.println("stack after pop o"+stack);
    }
}

}
