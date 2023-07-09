package ru.gb.lessons.interfaces.core.drugStore;

import org.w3c.dom.ls.LSSerializer;
import ru.gb.lessons.interfaces.core.clients.DoctorSpecialities;
import ru.gb.lessons.interfaces.core.drugStore.impl.Paracitomol;
import ru.gb.lessons.interfaces.core.drugStore.impl.Penicillin;
import ru.gb.lessons.interfaces.core.drugStore.impl.Water;
import ru.gb.lessons.interfaces.core.personal.Doctor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static ru.gb.lessons.interfaces.core.clients.DoctorSpecialities.THERAPIST;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy2 = new Pharmacy();
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy();
        Component comp5 = new Component("Penicillin", "10 mg", 12);
        Component comp6 = new Component("Spirit", "100 g", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy2);

        System.out.println(nomenclature);
        Collections.sort(nomenclature);
        System.out.println("============================================================================");
        System.out.println(nomenclature);
        System.out.println("============================================================================");

        Component Penicillin = new Penicillin("10", 3);
        Component Penicillin1 = new Penicillin("10", 3);
        Component Penicillin3 = new Penicillin("15", 2);
        Component Penicillin4 = new Penicillin("9", 1);

        Component Penicillin2 = Penicillin1;

        // Для задания 2
        List<Component> repeatingComponents = new ArrayList<>();
        repeatingComponents.add(Penicillin);
        repeatingComponents.add(Penicillin1);
        repeatingComponents.add(Penicillin2);
        repeatingComponents.add(Penicillin3);
        repeatingComponents.add(Penicillin4);

        // ------------------------------------------------------------------

        System.out.println("Задание 1 ");

        Set<Component> components = new HashSet<>();
        components.add(Penicillin);
        components.add(Penicillin1);
        components.add(Penicillin2);
        components.add(Penicillin3);
        components.add(Penicillin4);

        System.out.println(components);
        System.out.println("Задание 2 ");
        Set<Component> components1 = new HashSet<>(repeatingComponents);
        Collections.sort(repeatingComponents);

        System.out.println(components1);

    }
}
