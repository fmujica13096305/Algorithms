package main;

import java.util.LinkedHashMap;

public class intToRoman {

    public static void main(String[] args) {



        String s = intToRoman("1994");
        System.out.println(s);

    }

    public static String intToRoman(String num) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");

        char arr[] = num.toCharArray();

        int mult = 1;
        String number = "";
        String res = "";
        for (int i = num.length() ; i > 0 ; i--){
           number = arr[i - 1];
           res = res + map.get(number * mult);
           mult = mult * 10;
        }
        return res;
    }
}

