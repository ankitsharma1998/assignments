package com.introductiontocollections;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ques9 {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println("\nToday is "+ date.toString());

        Locale locale = new Locale("ja","JP");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println("\nToday is in Japanese Language : "+ df.format(date));

        locale = new Locale("th","TH");
        df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println("\nToday is in Thai Language : "+ df.format(date));

        locale = new Locale("tr","TR");
        df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println("\nToday is in Turkish Language : "+ df.format(date));
    }
}