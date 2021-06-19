package two;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * The {@code InputNumbers} input numbers with console line and save it. It can to return array string or double
 */
public class InputNumbers {
    private String[] str;

    /**
     * The method read numbers with console log
     **/
    public void create() {
        Scanner in = new Scanner(System.in);
        str = in.nextLine().split(" ");
        checkItems(str);
    }

    /**
     * The method check element array. If it can't parse element in double then exception
     *
     * @param array String[]
     */
    private void checkItems(String[] array) {
        for (String item : array) {
            try {
                Double.parseDouble(item);

                if(item.endsWith(".")){
                    throw new NumberFormatException();
                }

                if(item.startsWith("0") && item.charAt(1) != '.'){
                    throw new NumberFormatException();
                }

            } catch (NumberFormatException e) {
                System.err.println("Wrong format number " + e);
            }
        }
    }

    /**
     * This metod create array with String items
     *
     * @return String array
     */
    public String[] getString() {
        String[] getArray = new String[str.length];
        System.arraycopy(str, 0, getArray, 0, str.length);
        return getArray;
    }

    @Override
    public String toString() {
        return Arrays.stream(str).map(n -> n + ' ').collect(Collectors.joining());
    }
}
