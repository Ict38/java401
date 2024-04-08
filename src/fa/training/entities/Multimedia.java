package fa.training.entities;

import fa.training.utils.Validator;

import java.util.Scanner;

public class Multimedia {
    private String name;
    private double duration;

    public Multimedia() {
    }

    public Multimedia(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public void createMultimedia() {
        this.name = Validator.stringValidate("Enter name: ", Validator.MULTIMEDIA_NAME_REGEX);
        this.duration = Validator.doubleValidate("Enter duration: ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
