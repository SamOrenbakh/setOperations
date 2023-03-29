package org.example;
import java.io.*;
import java.util.*;

public class SetOperations<T> {
    HashSet<T> setOne = new HashSet<T>();
    HashSet<T> setTwo = new HashSet<T>();

    public HashSet union(HashSet setOne, HashSet setTwo) {
        HashSet union = new HashSet();
        union.addAll(setOne);
        union.addAll(setTwo);
        return union;
    }

    public HashSet<T> intersection(HashSet setOne, HashSet setTwo){
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

    public ArrayList cartisianProductOfTwoSets(HashSet setOne, HashSet setTwo){
        ArrayList cartisianProduct = new ArrayList();

        for (Object setOneElement: setOne) {
            for (Object setTwoElement: setTwo) {
                cartisianProduct.add(setOneElement.toString() + "," + setTwoElement.toString());
            }
        }

        return cartisianProduct;
    }


}
