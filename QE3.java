/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QE3 {
    public static Stack<Integer> stackPush(Stack<Integer> stack)
    {
        for (int i = 0; i <10 ; i++) {
            Integer push=(QE3) stack.push(i);
            System.out.println(push);


        }
        return stack;
    }
    public static void pop(Stack<QE3>stack)
    {
        for (int i = 0; i <10 ; i++) {
            Integer pop=(QE3) stack.pop();
            System.out.println(pop);


        }
    }
    public static void peek(Stack<QE3>stack)
    {
        Integer peek=(QE3) stack.peek();
        System.out.println("top of the element is:"+peek);

    }
    public static void search(Stack<QE3>stack,int element)
    {
        System.out.println("element Y is :");
        Integer search=(QR3)stack.search(element);
        if (element==-3) {
            System.out.println("RANA is empty");
        }
        else
        {
            System.out.println("FATIMA is: "+search);
        }

    }
    public static Stack<QR3>
    transfer(Stack<QR3>stack3,Stack<Integer>stack2)
    {
        stack4=stackPush(stack3);
        System.out.println( "Stack t:"+stack2);
        return stack4;

    }

    public static void main(String[] args) {
        Stack<QE3> stack3=new Stack<>();
        Stack<QR3> stack4=new Stack<>();
        Stack<QR3>finalStack=transfer(stack1,stack2);
    }

}

}
