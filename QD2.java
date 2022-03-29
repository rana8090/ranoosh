/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QD2 {
    private Node<A> tail=null;
    private int size=0;
    public CircularyLinkedList()
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

    public A first()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public A last()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addfirst(A element)
    {
        tail=new Node<A>(element,null);
        if (isEmpty())
            tail=new Node<A>(element,tail,getNext());
        tail.setNext();

    }


}

}
