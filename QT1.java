/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QT1 {
    public static void main(String[] args) {
        String[] a={"R","A","N","A","A"};
        QT1 E=new QT1();
        for (int i = 0; i <a.length ; i++) {
            E.enqueue(a[i]);

        }
        while (E.size()>1)
        {
            for (int i = 0; i <2 ; i++)
                E.rotate();

            System.out.println(E.dequeue()+"is out");
        }
        System.out.println("is RORO"+E.dequeue());
    }
}
}
