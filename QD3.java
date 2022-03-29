/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QD3 {
    private S element;
    private QD3<S> next;
    public QD3(S element,QD3<S> next)
    {
        this.element=element;
        this.next=next;
    }

    public S getElement() {
        return element;
    }

    public QD3<S> getNext() {
        return next;
    }

    public void setNext(QD3<S> next) {
        this.next = next;
    }
}

}
