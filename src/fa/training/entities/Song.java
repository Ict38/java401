package fa.training.entities;

import fa.training.utils.Validator;

import java.util.Scanner;

public class Song extends Multimedia{

    private String singer;

    public Song() {
    }

    public Song(String name, double duration, String singer) {
        super(name, duration);
        this.singer = singer;
    }

public void createSong() {
        super.createMultimedia();
        this.singer = Validator.stringValidate("Enter singer: ", Validator.SINGER_NAME_REGEX);
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + getName() + '\'' +
                ", duration='" + getDuration() + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
