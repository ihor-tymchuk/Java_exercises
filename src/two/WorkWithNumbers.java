package two;

public class WorkWithNumbers {
    private String[] array;
    public WorkWithNumbers(String[] numbers){
        this.array = numbers;
    }

    public String mostLongNumber(){
        String mostLong = array[0];
        int length = lengthNumber(mostLong);
        for(String item : array) {
            if(lengthNumber(item) > length){
                mostLong = item;
                length = lengthNumber(item);
            }
        }
        return mostLong;
    }

    public String mostShortNumber(){
        String mostShort = array[0];
        int length = lengthNumber(mostShort);
        for(String item : array) {
            if(lengthNumber(item) < length){
                mostShort = item;
                length = lengthNumber(item);
            }
        }
        return mostShort;
    }

    private int lengthNumber(String num){
        int length = num.length();
        if(num.startsWith("-")){
            length--;
        }

        if(num.contains(".")){
            length--;
        }
        return length;
    }
}
