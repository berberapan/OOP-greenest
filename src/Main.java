import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Exempel på polymorfism, en lista med Plant-objekt tar olika former då de initieras med olika subklasser.
    List<Plant> guestList = new ArrayList<>(Arrays.asList(
            new Cactus("Igge", 0.2),
            new Palm("Laura", 5),
            new CarnivorousPlant("Meatloaf", 0.7),
            new Palm("Olof", 1)
    ));
    public Main() {
        UserWindow output = new UserWindow();
        String selectedGuest = output.getWindowOptions(this.guestList);
        output.getGuestNutritionInfo(selectedGuest, this.guestList);
    }

    public static void main(String[] args) {
        Main start = new Main();
    }
}