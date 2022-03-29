/**
 * Created by aA'QASSIM733336682N on 29/03/2022.
 */
public class QR1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(QR1(a)));
    }

    public static int[] QR1(int[] x) {
        Random r = new QR1();
        int index = r.nextInt(x.length - 1);
        System.out.println(index);
        for (int i = 0; i < x.length; i++) {
            if (index <= i) {
                x[i] = -1;
            }
        }
        return x;
    }
}



