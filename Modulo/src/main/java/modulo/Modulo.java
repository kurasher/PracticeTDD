package modulo;

public class Modulo {
    private int first2Digits;
    private int last2Digits;
    private int year;
    private int month;
    private int day;

    public Modulo(int year, int month, int day){
        first2Digits = 0;
        last2Digits = 0;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getFirst2Digits(){
        first2Digits = year / 100;
        return first2Digits;
    }

    public int getLast2Digits(){
        year = calcYearFromMonth();
        last2Digits = year % 100;
        return last2Digits;
    }

    public int getMonth(){
        month = calcMonth();
        return month;
    }

    public int getDay(){
        return day;
    }

    private int calcYearFromMonth(){
        if(month == 1 || month == 2){
            return year - 1;
        }else{
            return year;
        }
    }

    private int calcMonth(){
        if(month == 1 || month == 2){
            return month + 12;
        }else{
            return month;
        }
    }
}
