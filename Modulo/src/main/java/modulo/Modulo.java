package modulo;

import java.util.HashMap;
import java.util.Map;

public class Modulo {
    private int first2Digits;
    private int last2Digits;
    private int year;
    private int lastYear;
    private int newYear;
    private int month;
    private int newMonth;
    private final int JANUARY = 13;
    private final int FEBRUARY = 14;
    private int day;
    private int h;
    private Map<Integer, String> map;

    public Modulo(int year, int month, int day) {
        this.first2Digits = 0;
        this.last2Digits = 0;
        this.h = 0;
        this.year = year;
        this.lastYear = this.year - 1;
        this.newYear = 0;
        this.month = month;
        this.newMonth = 0;
        this.day = day;

        map = new HashMap<>(){
            {
                put(0, "土");
                put(1, "日");
                put(2, "月");
                put(3, "火");
                put(4, "水");
                put(5, "木");
                put(6, "金");
            }
        };
    }

    public int getFirst2Digits(){
        newYear = calcYearFromMonth();
        first2Digits = newYear / 100;
        return first2Digits;
    }

    public int getLast2Digits(){
        newYear = calcYearFromMonth();
        last2Digits = newYear % 100;
        return last2Digits;
    }

    public int getMonth(){
        if(month == 1){
            return JANUARY;
        }else if(month == 2){
            return FEBRUARY;
        }else{
            return month;
        }
    }

    public int getDay(){
        return day;
    }

    public String calcZeller(){
        if(year < 1582){
            return "西暦は1582年以降を入力してください";
        }else{
            first2Digits = getFirst2Digits();
            last2Digits = getLast2Digits();
            newMonth = getMonth();

            h = (day + (26*(newMonth+1))/10 + last2Digits + last2Digits/4 + first2Digits/4 + 5*first2Digits) % 7;
            return map.get(h);
        }
    }

    private int calcYearFromMonth(){
        if(month == 1 || month == 2){
            return lastYear;
        }else{
            return year;
        }
    }
}