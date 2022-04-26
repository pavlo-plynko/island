package domain.animals.predators;

import domain.animals.Animal;

import java.util.HashSet;
import java.util.Set;

public class Wolf extends Predator {

    public static int wolvesBorn;
    public static int wolvesDied;

    public Wolf() {
        wolvesBorn++;
        this.maxHungerLevel = 20;
        hungerLevel = maxHungerLevel / 2;
    }

    @Override
    protected Set<Animal> getChild() {
        return new HashSet<>() {{
            add(new Wolf());
        }};
    }

    @Override
    public void die() {
        super.die();
        wolvesDied++;
    }
}