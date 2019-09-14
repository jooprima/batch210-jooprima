package jo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
    //sorting
    public static int[] sortDescending(int[] intArray){
        int temp;
        for (int i = 0; i < intArray.length ; i++) {
            for (int j = 1; j < intArray.length ; j++) {
                if(intArray[j]>intArray[j-1]){
                    temp = intArray[j];
                    intArray[j] = intArray[j-1];
                    intArray[j-1] = temp;
                }
            }
        }
        return intArray;
    }


    public static int[] sortAscending(int[] intArray){
        int temp;
        for (int i = 0; i < intArray.length ; i++) {
            for (int j = 1; j < intArray.length ; j++) {
                if(intArray[j-1]>intArray[j]){
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }


    //converting
    public static int[] stringToInt(String inputString){
        String[] arrString = inputString.split(" ");
        int[] intArray = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            intArray[i] = Integer.parseInt(arrString[i]);
        }
        return intArray;
    }

    public static char[] stringToChar(String inputString){
        String[] arrString = inputString.split(" ");
        char[] arrChar = new char[arrString.length];
        for (int i = 0; i < arrString.length ; i++) {
            arrChar[i] = arrString[i].charAt(0);
        }
        return arrChar;
    }

    //get differences time
    public static int getDiffDay(String timeIn, String timeOut)throws ParseException {
        Date dayIn = new SimpleDateFormat("dd/MM/yyyy").parse(timeIn);
        Date dayOut = new SimpleDateFormat("dd/MM/yyyy").parse(timeOut);
        long diff = dayOut.getTime()-dayIn.getTime();
        int diffDay = (int) diff/(24*60*60*1000);
        return diffDay;
    }
    public static int getDiffHours(String timeIn, String timeOut)throws ParseException{
        Date hoursIn = new SimpleDateFormat("HH:mm").parse(timeIn);
        Date hoursOut = new SimpleDateFormat("HH:mm").parse(timeOut);
        long diff = hoursOut.getTime() - hoursIn.getTime();
        int diffHourse = (int) diff/(60*60*1000);
        return  diffHourse;
    }
    public static int getDiffMinutes(String timeIn, String timeOut)throws ParseException{
        Date hoursIn = new SimpleDateFormat("HH:mm").parse(timeIn);
        Date hoursOut = new SimpleDateFormat("HH:mm").parse(timeOut);
        long diff = hoursOut.getTime() - hoursIn.getTime();
        int diffHourse = (int) diff/(60*60*1000);
        int diffMinutes = (int) diff/(60*1000);
        //diffMinutes -= diffHourse*60;
        return  diffMinutes;
    }
    //Fibonacci
    public static int[] fibArray(int length){
        int[] arrInt = new int[length];
        for (int i = 0; i < arrInt.length ; i++) {
            if (i<2){
                arrInt[i] = 1;
            }else{
                arrInt[i] = arrInt[i-1]+arrInt[i-2];
            }
        }
        return arrInt;
    }

    //print
    public static void print(int[] intArray){
        for (int i = 0; i < intArray.length ; i++) {
            System.out.print(intArray[i]+" ");
        }
    }

    public static void print(char[] charArray){
        for (int i = 0; i < charArray.length ; i++) {
            System.out.print(charArray[i]+" ");
        }
    }

    public static void print(int[][] arrayMatriks, int rowColumn){
        for (int i = 0; i < rowColumn ; i++) {
            for (int j = 0; j < rowColumn ; j++) {
                System.out.print(arrayMatriks[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void print(int[][] arrayMatriks, int row, int column){
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.print(arrayMatriks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
