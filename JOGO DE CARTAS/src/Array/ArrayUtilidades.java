package Array;

public class ArrayUtilidades {

    public static boolean[] ArrayBol(int vet[]) {

        boolean[] vetBol = new boolean[vet.length];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > 0) {
                vetBol[i] = true;

            } else {

                vetBol[i] = false;
            }
        }

        return vetBol;

    }

}