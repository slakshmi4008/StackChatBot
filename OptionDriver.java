import java.util.Stack;

public class OptionDriver {
    public static void main(String[] args) {
        Stack<Option> options = new Stack<>();
        options.add(new Level1Option());
        while(!options.isEmpty()) {
            Option currentOption = options.peek();
            int inputForCurrentLevel = currentOption.getInputForCurrentLevel();
            if (inputForCurrentLevel == 0) {
                options.pop();
            } else {
                if (currentOption.isFinal()) {
                    boolean processed = currentOption.process();
                    if (processed) {
                        break;
                    }
                } else {
                    Option nextOption = currentOption.getOptionForUserInput(inputForCurrentLevel);
                    options.add(nextOption);
                }
            }
        }
    }
}
