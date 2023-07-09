package ru.gb.lessons.interfaces.core.drugStore.impl;

import ru.gb.lessons.interfaces.core.drugStore.Component;

public class Paracitomol extends Component {
    public Paracitomol(String name, String weight, int power) {
        super(name, weight, power);
        //TODO Auto-generated constructor stub
    }


    public Paracitomol(String weight, int power) {
        this("Азитромицин", weight, power);
    }
}