package fa.training.main;

import fa.training.entities.Multimedia;
import fa.training.entities.Video;
import fa.training.management.MultimediaManagement;
import fa.training.utils.Validator;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {



    public static void main(String[] args) {
        MultimediaManagement mananger = new MultimediaManagement(new ArrayList<>());
        while(true){
            int choice = Validator.intValidate(1,4);

            switch (choice){
                case 1:
                    System.out.println("------------- Enter Video Information -------------");
                    Video m = new Video();
                    m.createMultimedia();
                    mananger.addMultimedia(m);
                    break;
                case 2:
                    System.out.println("------------- Enter Song Information -------------");
                    break;
                case 3:
                    System.out.println("------------- List of multimedia -------------");
                    for(Multimedia multimedia : mananger.getListOfMultimedia()){
                        System.out.println(multimedia);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input, please re-enter value from 1 to 4".toUpperCase());
            }
        }
    }
}
