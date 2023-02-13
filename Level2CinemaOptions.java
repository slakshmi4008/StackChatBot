import java.util.ArrayList;
import java.util.List;
    public class Level2CinemaOptions  implements Option{
        @Override
        public List<String> getTotalNoOfOptionsForCurrentLevel() {
            List<String> currentLevelOptions = new ArrayList<>();
            currentLevelOptions.add("1. Avatar 2");
            currentLevelOptions.add("2. Thunivu");
            currentLevelOptions.add("3. Varisu");
            return currentLevelOptions;
        }

        @Override
        public Option getOptionForUserInput(int userInput) {
            return new Level3Option();
        }
}
