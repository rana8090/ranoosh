/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QD1 {
    private Node<R> tail=null;
    private int size=0;
    public QD1()
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

    public R first()
    {
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }
    public R last()
    {
        if (isEmpty())return null;
        return tail.getElement() ;
    }
    public void addFirst (R element)
    {
        if (size()==0)
        {
            tail=new Node<R>(element,null);
            tail.setNext(tail);
        }
        else
        {
            Node<R>n=new Node<R> (element,tail.getNext());
            tail.setNext(n);

        }
        size++;
    }
    public void addLast(R element)
    {
        addFirst(element);
        tail=tail.getNext();
    }
    public R removeFirst()
    {
        if (isEmpty())return null;
        Node<R> Y=tail.getNext();
        if (Y==tail)
            tail=null;
        else
            tail.setNext(Y.getNext());
        size--;
        return Y.getElement();
    }
    public void rotate()
    {
        if (tail=new )
            tail=tail.getNext();
    }
    public boolean equals(Object T)
    {
        if (T=ull)
            return false;
        if (getlass()!=TgetClass())
            return false;
        Circular.NodewalkB=other.tail;
        while (walkA!=null)
        {
            if (!walkA.getElement().equals(walkB.getElement()))
                return false;
            walkA=walkA.getNext();
            walkB=walkB.getNext();
            return true;

        }
        return true;
    }
    private static class Node<R
    {
        Relement;
        Node<R next;
        public Node(E element, Node<R> next)
        {
            this.element=element;
            this.next=next;
        }
        public  getElement()
        {
            return element;
        }
        public void setElement(R element)
        {
            this.element=element;
        }
        public Node<R> getNext()
        {
            return next;
        }
        public void setNext(Node<R> next)
        {
            this.next=next;
        }
    }
}

}
