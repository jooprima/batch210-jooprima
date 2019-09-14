package jo;

public class Soal06 {
    public Soal06(String inputPlayer,String inputEnemy) {
        Resolve(inputPlayer,inputEnemy);
    }
    public static void Resolve(String inputPlayer, String inputEnemy){
        char[] player = inputPlayer.toUpperCase().toCharArray();
        char[] enemy = inputEnemy.toUpperCase().toCharArray();
        int[] skorPlayer = {0,2};
        int[] skorEnemy = {0,0};
        for (int i = 0; i < player.length ; i++) {
            if(player[i] == 'G'){
                if(enemy[i] == 'B'){
                    skorPlayer[1] -= 1;
                    skorEnemy[0] += 2;
                }else if(enemy[i] == 'K'){
                    skorPlayer[0] +=2;
                    skorEnemy[1] -=1;
                }
            }else if(player[i] == 'B'){
                if(enemy[i] == 'G'){
                    skorPlayer[0] += 2;
                    skorEnemy[1] -= 1;
                }else if(enemy[i] == 'K'){
                    skorPlayer[1] -= 1;
                    skorEnemy[0] += 2;
                }
            }else if(player[i] == 'K'){
                if(enemy[i] == 'B'){
                    skorPlayer[0] += 2;
                    skorEnemy[1] -= 1;
                }else if(enemy[i] == 'G'){
                    skorPlayer[1] -=1;
                    skorEnemy[0] += 2;
                }
            }
        }

        if(skorPlayer[0] > skorEnemy[0]){
            System.out.println("A Menang, Maju "+skorPlayer[0]+" langkah");
            System.out.println("B Kalah, Mundur "+Math.abs(skorEnemy[1])+" langkah ");
        }else if(skorPlayer[0] < skorEnemy[0]){
            System.out.println("A Kalah, Mundur "+Math.abs(skorPlayer[1])+" langkah");
            System.out.println("B Menang, Menang "+skorEnemy[0]+" langkah ");
        }else {
            System.out.println("A and B Draw");
        }


    }
}
