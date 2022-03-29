/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QY1 {
    int data;
    QY1 next;
    QY1 (int T)
    {
        this.data=T;
        this.next=null;
    }
    static class LinkedList
    {
        QY1 start;
        LinkedList()
        {
            start=null;

        }
        public void push(int data)
        {
            if (this.start==null)
            {
                QY1 temp=new QY1(data);
                this.start=temp;
            }
            else
            {
                QY1 temp=new QY1(data);
                temp.next=this.start;
                this.start=temp;
            }
        }
        public int findSecandLastNode(QY1 ptr)
        {
            QY1 temp=ptr;
            if (temp==null||temp.next==null)
                return -1;
            while (temp.next.next!=null)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        public static void main(String[] args) {
            LinkedList b=new LinkedList();
            T.push(19);
            T.push(56);
            T.push(98);
            T.push(79);
            T.push(33);
            System.out.println(b.findSecandLastNode(T.start));


        }
    }

}

}
