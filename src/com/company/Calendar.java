package com.company;

import java.util.Scanner;

public class Calendar extends Menu{

    public static void main(String[] args) {

        Months[] mas = Months.values();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();

            switch (scanner.next()) {
//              Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим)
                case "1": {
                    System.out.println("Введіть місяць");
                    scanner = new Scanner(System.in);
                    String scan = messageOutPut(scanner.next());

                    boolean flag = isFirstScan(mas, scan);

                    if (!flag) {
                        System.out.println("не існує");
                    }
                    break;
                }

                case "2": {
                    System.out.println("Введіть пору року");
                    scanner = new Scanner(System.in);
                    String scan = messageOutPut(scanner.next());

                    boolean flag = false;

                    for (Months result : mas) {

                        if (result.getSeasons().name().equals(scan)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        for (Months result2 : mas) {
                            if (result2.getSeasons().toString().equals(scan)) {
                                System.out.println(result2);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("не існує");
                    }
                    break;
                }
//              Вивести всі місяці які мають таку саму кількість днів
                case "3": {
                    System.out.println("Введіть цифри (28,30,31) ");
                    scanner = new Scanner(System.in);
                    String scan = scanner.next();

                    boolean flag = false;

                    for (Months result : mas) {

                        if (result.getDays() == Integer.parseInt(scan)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        for (Months result2 : mas) {
                            if (result2.getDays() == Integer.parseInt(scan)) {
                                System.out.println(result2);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("не існує");
                    }
                    break;
                }
                case "4": {
                    for (Months result : mas) {
                        if (result.getDays() < 29) {
                            System.out.println(result.name());
                        }
                    }
                    break;
                }
                case "5": {
                    for (Months result : mas) {
                        if (result.getDays() == 31) {
                            System.out.println(result.name());
                        }
                    }
                    break;
                }
                case "6": {
                    System.out.println("Введіть місяць");
                    scanner = new Scanner(System.in);
                    String scan = messageOutPut(scanner.next());

                    boolean flag = isFirstScan(mas, scan);

                    if (flag) {
                        Months result2 = Months.valueOf(scan);
                        int ordinal = result2.ordinal();

                        if (ordinal == mas.length - 1) {
                            ordinal = 0;
                            System.out.println(mas[ordinal]);
                        } else {
                            System.out.println(mas[ordinal + 1]);
                        }
                    }
                    if (!flag) {
                        System.out.println("не існує");
                    }
                    break;
                }
                case "7": {
                    System.out.println("Введіть місяць");
                    scanner = new Scanner(System.in);
                    String scan = messageOutPut(scanner.next());

                    boolean flag = isFirstScan(mas, scan);

                    if (flag) {
                        Months result2 = Months.valueOf(scan);
                        int ordinal = result2.ordinal();

                        if (ordinal == mas.length + 1) {
                            ordinal = 0;
                            System.out.println(mas[ordinal]);
                        } else if (ordinal == 0) {
                            int maxOrdinal = 0;
                            for (Months result : mas) {
                                if (result.ordinal() > maxOrdinal) {
                                    maxOrdinal = result.ordinal();
                                }
                            }
                            System.out.println(mas[maxOrdinal]);
                        } else {
                            System.out.println(mas[ordinal - 1]);
                        }
                    }
                    if (!flag) {
                        System.out.println("не існує");
                    }
                    break;
                }
                case "8": {
                    for (Months result : mas) {
                        if (result.getDays() % 2 == 0) {
                            System.out.println(result.name());
                        }
                    }
                }
                case "9": {
                    for (Months result : mas) {
                        if (result.getDays() % 2 == 1) {
                            System.out.println(result.name());
                        }
                    }
                }
                case "0": {
                    System.out.println("Введіть місяць");
                    scanner = new Scanner(System.in);
                    String scan = messageOutPut(scanner.next());

                    for (Months result : mas) {
                        if (result.name().equals(scan)) {
                            if (result.getDays() % 2 == 0) {
                                System.out.println("Парний " + result.valueOf(scan));
                            } else {
                                System.out.println("Не парний " + result.name());
                            }
                        }
                    }
                }
            }
        }
    }


    private static boolean isFirstScan(Months[] mas, String scan) {

        boolean flag = false;

        for (Months result : mas) {

            if (result.name().equals(scan)) {
                System.out.println("Існує");
                flag = true;
            }
        }
        return flag;
    }

    private static String messageOutPut(String message) {
        return message.substring(0, 1).toUpperCase() + message.substring(1).toLowerCase();
    }

}