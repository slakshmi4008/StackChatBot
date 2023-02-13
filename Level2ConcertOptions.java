import java.util.ArrayList;
import java.util.List;
    public class Level2ConcertOptions implements Option {
        @Override
        public List<String> getTotalNoOfOptionsForCurrentLevel() {
            List<String> currentLevelOptions = new ArrayList<>();
            currentLevelOptions.add("1. Illayaraja");
            currentLevelOptions.add("2. A R Rehman");
            currentLevelOptions.add("3. Yuvan Shankar Raja");
            return currentLevelOptions;
        }

        @Override
        public Option getOptionForUserInput(int userInput) {
            return new Level3Option();
        }
}
