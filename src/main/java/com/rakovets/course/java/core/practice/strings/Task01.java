package com.rakovets.course.java.core.practice.strings;

/**
 * Разработать программу для разбора (parsing) полного имени сотрудника компании.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task01 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        String fullName = "Nappie Lopez-gomez";

        String name = getName(fullName);
        System.out.printf("Name: %s\n", name);
        String surname = getSurname(fullName);
        System.out.printf("Surname: %s\n", surname);
        String reverseFullName = reverseFullName(fullName);
        System.out.printf("Reversed full name: %s\n", reverseFullName);
    }

    /**
     * Возвращает имя сотрудника.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return имя сотрудника
     */
    static String getName(String fullName) {
        String[] arrayFullName = fullName.split(" ");

        return arrayFullName[0];
    }

    /**
     * Возвращает фамилию сотрудника.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return фамилия сотрудника
     */
    static String getSurname(String fullName) {
        String[] arrayFullName = fullName.split(" ");

        return arrayFullName[1];
    }

    /**
     * Возвращает полное имя сотрудника в обратном формате.
     *
     * @param fullName полное имя сотрудника согласно паттерну '${name} ${surname}'
     * @return полное имя сотрудника в обратном формате, т.е. '${surname} ${name}'
     */
    static String reverseFullName(String fullName) {
        String[] arrayFullName = fullName.split(" ");

        return arrayFullName[1] + " " + arrayFullName[0];
    }
}
