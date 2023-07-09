package ru.gb.lessons.interfaces.core.drugStore.impl;

import ru.gb.lessons.interfaces.core.drugStore.Component;

public class Penicillin extends Component {
    public Penicillin(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Penicillin(String weight, int power) {
        this("Пенициллин", weight, power);
    }
}