import java.util.List;
import java.util.Scanner;

public interface Option {
    default int getInputForCurrentLevel() {
        List<String> optionsForThisLevel = getTotalNoOfOptionsForCurrentLevel();
        int n = optionsForThisLevel.size();
        for(String option: optionsForThisLevel) {
            System.out.println(option);
        }
        boolean isFirstLevel = isCurrentOptionsTheFirstLevel();
        StringBuilder sb = new StringBuilder();
        sb.append("Enter your preference(1-" + n);
        if(!isFirstLevel) {
            sb.append(", Press 0 for previous menu");
        }
        sb.append("): ");
        String userInputText = sb.toString();
        System.out.print(userInputText);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        while(!valid(userInput)) {
            System.out.print("Invalid option.");
            System.out.print(userInputText);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    default boolean valid(int userInput ) {
        List<String> optionsForThisLevel = getTotalNoOfOptionsForCurrentLevel();
        int n = optionsForThisLevel.size();
        boolean isFirstLevel = isCurrentOptionsTheFirstLevel();
        return (isFirstLevel && userInput>=1 && userInput <=n) || (!isFirstLevel && userInput >=0 && userInput <=n);
    }


    default int getInputForNextLevel() {
        return 0;
    }

    List<String> getTotalNoOfOptionsForCurrentLevel();

    default boolean isCurrentOptionsTheFirstLevel() {
        return false;
    }

    Option getOptionForUserInput(int userInput);

    default boolean isFinal() {
        return false;
    }

    default boolean process() {
        throw new RuntimeException("Processing not applicable for this level");
    }
}


