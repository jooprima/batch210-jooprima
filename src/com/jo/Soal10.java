package jo;

public class Soal10 {
    public Soal10(int inputValue) {
        Resolve(inputValue);
    }

    public static void Resolve(int inputValue) {
        int[] arrInt = new int[inputValue];
        int num = inputValue;
        int newindex = 0;
        for (int i = 2; i <= inputValue; i++) {
            for (int j = 2; j < i; j++) {
                if (num % j == 0) {
                    //System.out.print(j + " ");
                    arrInt[newindex] = j;
                    num = num / j;
                    newindex++;
                }
            }
        }
        if (num == inputValue) {
            arrInt[0] = inputValue;
            arrInt[1] = 1;
        }

        jo.Utility.sortAscending(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            if(arrInt[i] != 0){
                System.out.print(arrInt[i]+" ");
            }

        }
    }
}
