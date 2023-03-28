package org.example;
import java.io.*;
import java.util.*;

public class SetOperations {
    HashSet setOne = new HashSet();
    HashSet setTwo = new HashSet();

    public HashSet union(HashSet setOne, HashSet setTwo) {
        HashSet union = new HashSet();
        union.addAll(setOne);
        union.addAll(setTwo);
        return union;
    }

    public HashSet intersection(HashSet setOne, HashSet setTwo){
        HashSet intersection = new HashSet();
        for (Object element: setTwo) {
            if (setOne.contains(element)){
                intersection.add(element);
            }
        }
        return intersection;
    }

    public HashSet setDifference(HashSet setOne, HashSet setTwo){
        HashSet difference = new HashSet();
        for (Object element: setOne) {
            if (!setTwo.contains(element)){
                difference.add(element);
            }
        }
        return difference;
    }
    //comment for git
    //for cartisian product maybe use a map store the value of the chars as a key and the combination as a value


}
