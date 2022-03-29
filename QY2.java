/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QY2 {
    private Node<F> head=null;
    private Node<F> tail=null;
    private int size=0;
    public SinglyLinkedList()
    {
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }

    public F first()
    {
        if (isEmpty())return null;
        return head.getElement();
    }
    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addfirst(F element)
    {
        head=new Node<F>(element,head);
        if (isEmpty())
            tail=head;
        size++;
    }
    public void addlast(F element)
    {
        Node<F> newest=new Node<F>(element,null);
        if (size==0)
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;

    }
    public E removefirst()
    {
        if (isEmpty())return null;
        F x=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return Y;
    }
    private static class Node<F>
    {
        F element;
        Node<E>next;
        public Node(F element, Node<F>next)
        {
            this.element=element;
            this.next=next;
        }
        public F getElement()
        {
            return element;
        }
        public void setElement(F element)
        {
            this.element=element;
        }
        public Node<F>getNext()
        {
            return next;
        }
        public void setNext(Node<F>next)
        {
            this.next=next;
        }
    }
}

}
