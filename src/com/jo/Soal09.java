package jo;

public class Soal09 {
    public Soal09(int inputValue) {
        Resolve(inputValue);
    }
    public static void Resolve(int inputValue){
        int pulsa = inputValue;
        int point = 0;
        if(pulsa >=10001 && pulsa <= 30000){
            point = (pulsa - 10000) / 1000;
        }else if(pulsa >= 30001 ){
            point = (pulsa - 20000)/1000 *2;
        }else {
            point+=0;
        }
        System.out.println("point: "+point);

    }
}
