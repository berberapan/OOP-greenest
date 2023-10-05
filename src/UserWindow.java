import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class UserWindow {

    public String getWindowOptions(List<Plant> list) {
        List<String> windowOptions = new ArrayList<>();
        for (Plant p : list) {
            windowOptions.add(p.getName());
        }
        Object[] windowOptionsObject = windowOptions.toArray();
        return String.valueOf(JOptionPane.showInputDialog(
                null,
                "Which guest should get liquid?",
                "Greenest",
                JOptionPane.QUESTION_MESSAGE,
                null,
                windowOptionsObject,
                windowOptionsObject[0]));
    }

    public void getGuestNutritionInfo(String guest, List<Plant> list) {
        for (Plant plant : list) {
            if (plant.getName().equals(guest)) {
                JOptionPane.showMessageDialog(
                        null,
                        guest + "\n\nNeeds " + plant.dailyLiquidInLitres() +
                                "L of " + plant.getPreferredLiquid() + " daily.\n\n");
            }
        }
    }
}
