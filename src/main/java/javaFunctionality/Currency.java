package javaFunctionality;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {

    public static void main(String[] args){

        double payment = 100.1;

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println("US: " + us.format(payment));
        System.out.println("Uk: " + uk.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + ch.format(payment));
        System.out.println("France: " + fr.format(payment));
    }
}
