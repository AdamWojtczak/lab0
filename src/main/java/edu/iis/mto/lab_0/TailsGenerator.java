package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList tailsArray = new ArrayList<>(value.length());
        for(int i = 0; i < value.length()+1; i++) {
            tailsArray.add(value.subSequence(i,value.length()));
        }
        return tailsArray;
    }
}
