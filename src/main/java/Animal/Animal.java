package Animal;

import Interfaces.Eater;
import Interfaces.NoiseMaker;
import Interfaces.Vegetables;

public class Animal implements Eater<Vegetables>, NoiseMaker {

    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {

        return null;
    }

    @Override
    public void eat() {

    }
}
