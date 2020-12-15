package ex8;

import java.text.DateFormat;
import java.util.*;

public class ShowLanguageAndLocale {
    public static void main(String[] args) {
        String[] messages = {
                // language and country System properties
                "user.language = " + System.getProperty("user.language"),
                "user.country = " + System.getProperty("user.country"),
                "user.language.display = " + System.getProperty("user.language.display"),
                "user.country.display = " + System.getProperty("user.country.display"),
                "user.language.format = " + System.getProperty("user.language.format"),
                "user.country.format = " + System.getProperty("user.country.format"),
                // default locales
                "default locale = " + Locale.getDefault(),
                "default display locale = " + Locale.getDefault(Locale.Category.DISPLAY),
                "default format locale = " + Locale.getDefault(Locale.Category.FORMAT),
                // date test
                "Date: " + DateFormat.getDateInstance(DateFormat.FULL).format(new Date())};
        javax.swing.JOptionPane.showMessageDialog(null, messages);
    }
}

