import java.util.ArrayList;
import java.util.List;

public class Level3Option implements Option {
    @Override
    public List<String> getTotalNoOfOptionsForCurrentLevel() {
        List<String> currentLevelOptions = new ArrayList<>();
        currentLevelOptions.add("1. Morning Show");
        currentLevelOptions.add("2. Evening Show");
        currentLevelOptions.add("3. Night Show");
        return currentLevelOptions;
    }

    @Override
    public Option getOptionForUserInput(int userInput) {
        return this;
    }

    @Override
    public boolean isFinal() {
        return true;
    }

    @Override
    public boolean process() {
        System.out.println("Processed. Tickets booked.");
        return true;
    }
}
