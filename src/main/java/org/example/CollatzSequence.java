package org.example;

public class CollatzSequence {
    public String calculateSequence(int value){
        String result = "";
        result += value+"->";
        while (value != 1) {
            if (value % 2 == 0) {
                value = value/2;
            } else {
                value = value*3+1;
            }
            result += value+"->";
        }
        result += "->1";

        return result;
    }
}
