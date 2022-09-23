package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить знак зодиака.
 * <p>
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 */
class Task12 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        int day = 12;
        int month = 12;

        String zodiacSign = getZodiacSign(day, month);
        System.out.printf("Result: %s", zodiacSign);
    }

    /**
     * Определяет знак зодиака.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @return знак зодиака
     */
    static String getZodiacSign(int day, int month) {
        String result;
        switch(month) {
            case 1:
                result = day <= 20 ? "Goat" : "Water-bearer";
                break;
            case 2:
                result = day <= 19 ? "Water-bearer" : "Fish";
                break;
            case 3:
                result = day <= 20 ? "Fish" : "Ram";
                break;
            case 4:
                result = day <= 20 ? "Ram" : "Bull";
                break;
            case 5:
                result = day <= 20 ? "Bull" : "Twins";
                break;
            case 6:
                result = day <= 21 ? "Twins" : "Crab";
                break;
            case 7:
                result = day <= 22 ? "Crab" : "Lion";
                break;
            case 8:
                result = day <= 22 ? "Lion" : "Maiden";
                break;
            case 9:
                result = day <= 21 ? "Maiden" : "Scales";
                break;
            case 10:
                result = day <= 22 ? "Scales" : "Scorpion";
                break;
            case 11:
                result = day <= 22 ? "Scorpion" : "Archer";
                break;
            case 12:
                result = day <= 21 ? "Archer" : "Goat";
                break;
            default:
                result = "";
        }
        return result;
    }
}
