package ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    private int componentsCount;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    @Override
    public int compareTo(@NotNull Pharmacy o) {
        int power = getDrugPower();
        int comparison1 = Integer.compare(power, o.getDrugPower());

        return comparison1 == 0 ? compareComponents(o.components) : comparison1;
    }

    public int compareComponents(List<Component> componentsToCompare) {
        int comparedLess = 0;
        int comparedMore = 0;
        for (Component c : this.components) {
            for (Component c1 : componentsToCompare) {
                if (c.compareTo(c1) < 0)
                    comparedLess++;
                else if (c.compareTo(c1) > 0)
                    comparedMore++;
            }
        }
        return Integer.compare(comparedMore, comparedLess);
    }

    public List<Component> getComponents() {
        return components;
    }

    @NotNull
    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return componentsCount < components.size();
            }
            public Component next() {
                return components.get(componentsCount++);
            }
        };
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    private int getPower (Pharmacy pharm) {
        int result = 0;
        for (Component elem: pharm.getComponents()) {
            result += elem.getPower();
        }
        return result;
    }
    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower());
    }
}

