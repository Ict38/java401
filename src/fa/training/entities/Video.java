package fa.training.entities;

public class Video extends Multimedia{

    public Video(String name, double duration) {
        super(name, duration);
    }

    public Video() {
    }

    public void createVideo() {
        super.createMultimedia();
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + getName() + '\'' +
                ", duration='" + getDuration() + '\'' +
                '}';
    }
}
