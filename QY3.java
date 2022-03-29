/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QY3 {
    public static void main(String[] args) {
        SinglyLinkedList<QY3> list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("2-add first \n 3-add last \n 4-remove first \n 0-exit");
        int choice = -1;
        while (QY3 != 0) {
            System.out.println("your QY3");
            QY3 = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter number");
                    list.addfirst(in.nextInt());
                    System.out.println("first number=" + list.first() + "\t last number" + "" + list.last() + "\t size=" + list.size());
                    break;
                case 2:
                    System.out.println("enter a number");
                    list.addlast(in.nextInt());
                    System.out.println("first=" + list.first() + "\t last=" + list.last() + "\t size=" + list.size());
                    break;
                case 3:
                    System.out.println("RANA first" + list.removefirst());
                    System.out.println("first=" + list.first() + "\t last=" + list.last() + "\t size=" + list.size());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }
    }
}

}
