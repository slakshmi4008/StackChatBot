import java.util.ArrayList;
import java.util.List;

public class Level1Option implements Option {
    @Override
    public int getInputForNextLevel() {
        return 0;
    }

    @Override
    public List<String> getTotalNoOfOptionsForCurrentLevel() {
        List<String> currentLevelOptions = new ArrayList<>();
        currentLevelOptions.add("1. Movies");
        currentLevelOptions.add("2. Concert");
        currentLevelOptions.add("3. Stand up");
        return currentLevelOptions;
    }

    @Override
    public boolean isCurrentOptionsTheFirstLevel() {
        return true;
    }

    @Override
    public Option getOptionForUserInput(int userInput) {
        switch(userInput) {
            case 1: return new Level2CinemaOptions();
            case 2: return new Level2ConcertOptions();
            case 3: return new Level2StandUpOptions();
        }
        throw new RuntimeException("Incorrect Option");
    }

}
