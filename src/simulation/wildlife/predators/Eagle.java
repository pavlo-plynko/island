package simulation.wildlife.predators;

import simulation.wildlife.Animal;

import java.util.HashSet;
import java.util.Set;

import static simulation.Params.*;

public class Eagle extends Predator {

    public Eagle() {
        eaglesBorn++;
        this.weight = eagleWeight;
        this.maxInCell = eaglesInCell;
        this.maxDistance = eagleMaxDistance;
        init();
        this.diet = eagleDiet;
    }

    @Override
    protected Set<Animal> getOffspring() {
        return new HashSet<>() {{
            add(new Eagle());
        }};
    }

    @Override
    public void die() {
        super.die();
        eaglesDied++;
    }
}