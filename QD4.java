/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QD4 {
    public static void main(String[] args) {
        Circular<QD4> link=new QD4<>();
        Scanner in=new Scanner(System.in);
        System.out.println("enter numberFSEVEN" );
        for (int i = 0; i <4 ; i++) {
            link.addFirst(in.nextInt());

        }
        boolean Z=link.equals(link);
        System.out.println(Z);
        System.out.println("TOP");
    }

}
}
