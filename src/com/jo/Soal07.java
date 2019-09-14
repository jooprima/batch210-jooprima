package jo;

public class Soal07 {
    public Soal07(String inputString) {
        Resolve(inputString);
    }
    public static void Resolve(String inputString){
        char[] arrChar = inputString.toCharArray();

        int pivot = 0;
        int up = 0;
        int down = 0;

        for (int i = 0; i < arrChar.length ; i++) {
            if(arrChar[i] == 'N'){
                if(pivot == 0){
                    up++;
                }
                pivot++;
            }else{
                if( pivot == 0){
                    down++;
                }
                pivot--;
            }
        }

        System.out.println("Gunung: "+up);
        System.out.println("Lembah: "+Math.abs(down));
    }

}
