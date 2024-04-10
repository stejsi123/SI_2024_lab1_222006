import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom(List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
            if (el.length() >= minLength) { // Fix: Changed condition to concatenate strings with length at least minLength
                sb.append(el);
            }
        }
        return sb.toString();
    }
}