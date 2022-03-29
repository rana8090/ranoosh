/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QT2 {
    static int QT2(int n,int R)
    {
        if (n==2)
            return  2;
        else
            return (josephus(n-1,R)+R-1)%n+2;
    }

    public static void main(String[] args) {
        int n=10;
        int R=7;
        System.out.println("the RARO is");
        System.out.println(QT2(n,R));
    }
}

}
