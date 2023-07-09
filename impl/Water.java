package ru.gb.lessons.interfaces.core.drugStore.impl;

import ru.gb.lessons.interfaces.core.drugStore.Component;

public class Water extends Component {
    public Water(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Water(String weight, int power) {
        super("Вода", weight, power);
    }
}