package fa.training.management;

import fa.training.entities.Multimedia;

import java.util.ArrayList;
import java.util.List;

public class MultimediaManagement {
    private List<Multimedia> listOfMultimedia;

    public MultimediaManagement(List<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
    }

    public void addMultimedia(Multimedia multimedia) {
        listOfMultimedia.add(multimedia);
    }

    public void displayMultimedia() {
        for (Multimedia multimedia : listOfMultimedia) {
            System.out.println(multimedia);
        }
    }

    public List<Multimedia> getListOfMultimedia() {
        return listOfMultimedia;
    }

    public void setListOfMultimedia(List<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
    }
}
