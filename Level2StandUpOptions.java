import java.util.ArrayList;
import java.util.List;
    public class Level2StandUpOptions implements Option  {
        @Override
        public List<String> getTotalNoOfOptionsForCurrentLevel() {
            List<String> currentLevelOptions = new ArrayList<>();
            currentLevelOptions.add("1. Alex Babu");
            currentLevelOptions.add("2. Praveen");
            currentLevelOptions.add("3. Someone else");
            return currentLevelOptions;
        }

        @Override
        public Option getOptionForUserInput(int userInput) {
            return new Level3Option();
        }
}
