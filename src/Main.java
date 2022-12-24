public class Main {
    public static void main(String[] args) {
        hw3();
    }
    private static void hw3() {
//Задание 1
        System.out.println("Задание 1");
        byte variableByte = 127;
        System.out.println("Значение переменной variableByte с типом byte равно " + variableByte);
        short variableShort = 32767;
        System.out.println("Значение переменной variableShort с типом short равно " + variableShort);
        int variableInt = 2_147_483_647;
        System.out.println("Значение переменной variableInt с типом int равно " + variableInt);
        long variableLong = 9_223_327_036_854_775_808L;
        System.out.println("Значение переменной variableLong с типом long равно " + variableLong);
        float variableFloat = 3.1234567f;
        System.out.println("Значение переменной variableFloat с типом float равно " + variableFloat);
        double variableDouble = 3.12345678901234567;
        System.out.println("Значение переменной variableDouble с типом float равно " + variableDouble);
//Задание 2
        System.out.println("\nЗадание 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
//Задание 3
        System.out.println("\nЗадание 3");
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int totalPaper = 480;
        int totalStudents = teacher1 + teacher2 + teacher3;
        int each = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + each + " листов бумаги");
//Задание 4
        System.out.println("\nЗадание 4");
        int bottlesPerMinute = 8;
        System.out.println("За 1 минуту машина произвела " + bottlesPerMinute + " штук бутылок");
        int forTwentyMinutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + forTwentyMinutes + " штук бутылок");
        int oneDay = 60 * 24;
        int forDay = oneDay * bottlesPerMinute;
        System.out.println("За 1 сутки машина произвела " + forDay + " штук бутылок");
        int forThreeDays = (oneDay * 3) * bottlesPerMinute;
        System.out.println("За 3 суток машина произвела " + forThreeDays + " штук бутылок");
        int forMonth = (oneDay * 30) * bottlesPerMinute;
        System.out.println("За 1 месяц машина произвела " + forMonth + " штук бутылок");
//Задание 5
        System.out.println("\nЗадание 5");
        int totalPaint = 120;
        int white = 2;
        int brown = 4;
        int classrooms = totalPaint / (white + brown);
        int totalWhite = classrooms * white;
        int totalBrown = classrooms * brown;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhite +
                " банок белой краски и " + totalBrown + " банок коричневой краски");
//Задание 6
        System.out.println("\nЗадание 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int weightGr = bananas + milk + iceCream + eggs;
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println(weightGr + " вес завтрака в граммах");
        System.out.println(weightKg + " вес завтрака в кг");
//Задание 7
        System.out.println("\nЗадание 7");
        float quarter = 0.25f;
        float half = 0.5f;
        int needLose = 7;
        float dietQuarter = needLose / quarter;
        System.out.println(dietQuarter + " дней, если худеть на 250г в день");
        float dietHalf = needLose / half;
        System.out.println(dietHalf + " дней, если худеть на 500г в день");
//Задание 8
        System.out.println("\nЗадание 8");
        float increase = 0.1f;
        int Masha = 67760;
        int Den = 83690;
        int Kristina = 76230;
        float increaseMasha = Masha * increase;
        System.out.println(increaseMasha);
        float newSalaryMasha = Masha + increaseMasha;
        float annualSalaryMasha = increaseMasha * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
                + annualSalaryMasha + " рублей");
        float increaseDen = Den * increase;
        float newSalaryDen = Den + increaseDen;
        float annualSalaryDen = increaseDen * 12;
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей. Годовой доход вырос на "
                + annualSalaryDen + " рублей");
        float increaseKristina = Kristina * increase;
        float newSalaryKristina = Kristina + increaseKristina;
        float annualSalaryKristina = increaseKristina * 12;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на "
                + annualSalaryKristina + " рублей");
    }
}