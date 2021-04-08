package modulo;

import java.util.HashMap;
import java.util.Map;

public class Modulo {
    private int first2Digits;
    private int last2Digits;
    private int year;
    private int month;
    private int day;
    private int h;
    private Map<Integer, String> map;

    public Modulo(int year, int month, int day){
        first2Digits = 0;
        last2Digits = 0;
        h = 0;
        this.year = year;
        this.month = month;
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

    public String calcZeller(){
        if(year < 1582){
            return "西暦は1582年以降を入力してください";
        }else{
            first2Digits = getFirst2Digits();
            last2Digits = getLast2Digits();

            h = (day + (26*(month+1))/10 + last2Digits + last2Digits/4 + first2Digits/4 + 5*first2Digits) % 7;
            return map.get(h);
        }
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