package ru.gb.jcore.sample;

import ru.gb.jcore.regular.Decorator;
import ru.gb.jcore.regular.OtherClass;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 **/

public class Main {
    public static void main(String[] args){

        /**
         * Точка входа в программу. С нее всегда все начинается.
         * @param args стрардатные аргументы командной строки
         */

        int result= OtherClass.add(a: 2, b:4);
        System.out.println(Decorator.decorate(result));
        result=OtherClass.sub(a: 2, b:4);
        System.out.println(Decorator.decorate(result));
        result=OtherClass.mul(a: 2, b:4);
        System.out.println(Decorator.decorate(result));
        result=OtherClass.div(a: 2, b:4);
        System.out.println(Decorator.decorate(result));

    }
}
   