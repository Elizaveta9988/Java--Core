package ru.gb.jcore.regular;

/**
 * Другой , очень полезный класс приложения.Здесь мы можем описать
 * его основное назначение и способность взаимодействия с ним.
 */
public class OtherClass {
    /**
     * Функция суммирования двух чисел
     * @param a первое слогаемое
     * @param b второе слогаемое
     * @return сумма a и b , без проверки на переполнение переменой .
     */
    public static int add (int a, int b){
        return a + b;
    }

    /**
     * Функция деление дух  целых чисел
     *
     * @param a деление
     * @param b деление
     * @return частное a и b, ,без проверки на переполнение переменной.
     */

    public static int div(int a, int b){
        return  b == 0 ? a: a / b;
    }

    /**
     * Функция произведение  дух  целых чисел
     *
     * @param a первый множетель
     * @param b второй множетель
     * @return произведение  a и b, ,без проверки на переполнение переменной.
     */

    public static int mul (int a, int b){
        return a * b;
    }

    /**
     * Функция вычитания  дух  целых чисел
     *
     * @param a уменьшамое
     * @param b вычитамое
     * @return разность  a и b, ,без проверки на переполнение переменной.
     */

    public static int sub (int a, int b){
        return a - b;
    }


}
