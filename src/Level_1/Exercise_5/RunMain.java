package Level_1.Exercise_5;

import Level_1.Exercise_5.model.FileSerializer;
import Level_1.Exercise_5.model.Person;
import java.io.File;

public class RunMain {

    public static void start() {

        String filepath = "src" + File.separator + "Level_1" + File.separator + "Exercise_5" + File.separator + "resources" + File.separator + "people.ser";

        try {
            Person person1 = new Person("Dani", 35, "Spanish", "El Prat de Llobregat");
            Person person2 = new Person("Manolo", 50, "Spanish", "Madrid");
            Person person3 = new Person("Pepita", 45, "Argentinian", "Buenos Aires");
            Person person4 = new Person("Judith", 28, "British", "Saint Sadurnine of Annoiance");

            Person[] peopleArray = new Person[]{person1, person2, person3, person4};

            FileSerializer fileSerializer = new FileSerializer();

            fileSerializer.serialize(filepath, peopleArray);
            fileSerializer.deserialize(filepath);
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        }
    }
}