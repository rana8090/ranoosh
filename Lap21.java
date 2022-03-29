/**
 * Created by aA'QASSIM733336682N on 16/03/2022.
 */
public interface Lap21 {
    public static int[] reverse(int[] x) {
        int n = x.length - 1;
        for (int i = 0; i < x.length / 2; i++){
            int temp = x[i];
            x[i] = x[n];
            x[n] = temp;
            n--;


        }
        return  x;
    }
}

    public static int[] shiftRight(int[] x){
        int n = x.length - 1;

        for (int i = 0; i < x.length -1; i--){
            x[i]=x[i-1];

        }
        return  x;
    }
    public static int[] shiftRight(int[] x){
        int e=x[0];
        for (int i = 0; i < x.length -1; i++){
            x[i]=x[i+1];


        }
        x[x.length -1]=e;
        return  x;

    }

