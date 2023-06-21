package ru.gb.jcore.task3;

public class AgeComparator  implements Comparator<Employee> {

/**
 * Компаратор для сравнения сотрудников на основе возраста.
 */

@Override
public int compare(Employee emp1, Employee emp2) {
    int age1 = (int) emp1.getAge();
    int age2 = (int) emp2.getAge();

    // Сравнение возраста сотрудников
    if (age1 < age2) {
        return -1;
    } else if (age1 > age2) {
        return 1;
    } else {
        return 0;
    }
}
}
}

