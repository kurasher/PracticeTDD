package modulo;

public class Modulo {
    private int first2Digits;
    private int last2Digits;

    public Modulo(){
        first2Digits = 0;
        last2Digits = 0;
    }

    public int getFirst2Digits(int year){
        first2Digits = year / 100;
        return first2Digits;
    }

    public int getLast2Digits(int year){
        last2Digits = year % 100;
        return last2Digits;
    }
}
