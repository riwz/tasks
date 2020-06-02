package com.company.shit;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class task1 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне",dateFormat.parse("MAY 1 2012"));
        map.put("Alex", dateFormat.parse("april 1 2012"));
        map.put("John", dateFormat.parse("jun 17 2012"));
        return null;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        for (Map.Entry<String, Date> e : map.entrySet()) {
            String a = e.getKey();
            Date b = e.getValue();
            // int v;
             //int i = v.getMoth();
            String k = "";
            // if (i == 2 || i == 3) map.remove(k);


        }

    }

    public static void main(String[] args) {

    }
}

/*
Условие

Создать словарь/мапу (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
0. Распичатать Map.
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/