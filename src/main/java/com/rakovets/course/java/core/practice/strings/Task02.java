package com.rakovets.course.java.core.practice.strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разработать программу для разбора (parsing) банковских отчетов.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        String bankReport = "typetypesetting 100$ -12$remaining the 1960s with -12$ the release -36$ of Letraset Lorem";
        double[] moneyFromReport = getArrayMoneyFromReport(bankReport);
        System.out.printf("Money from the report: %s\n", Arrays.toString(moneyFromReport));
        double sumMoneyFromReport = getSumMoneyFromReport(bankReport);
        System.out.printf("Sum money from the report: %s\n", sumMoneyFromReport);
    }

    /**
     * Возвращает список сумм, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return список сумм
     */
    static double[] getArrayMoneyFromReport(String report) {
        int count = 1;
        ArrayList<Double> list = new ArrayList<Double>();
        Pattern pattern = Pattern.compile("[\\s-]\\d*[,.]??\\d+\\b(?=\\s*[$]\\s)");
        Matcher matcher = pattern.matcher(report);

        while (matcher.find()) {
            list.add(Double.parseDouble(matcher.group().trim()));
        }

        double[] result = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double sum = 0;
        Pattern pattern = Pattern.compile("[\\s-]\\d*[,.]??\\d+\\b(?=\\s*[$]\\s)");
        Matcher matcher = pattern.matcher(report);

        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group().trim());
        }

        return sum;
    }
}
