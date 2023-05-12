package org.example;
import java.io.*;
import java.util.*;

public class SetOperations<T> {
    HashSet<T> setOne = new HashSet<T>();
    HashSet<T> setTwo = new HashSet<T>();

    public HashSet union(HashSet setOne, HashSet setTwo) {
        HashSet union = new HashSet();
        for (Object setOneElement :setOne) {
            union.add(setOneElement);
        }

        for (Object setTwoElement :setTwo) {
            union.add(setTwoElement);
        }
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

    public ArrayList cartisianProductOfTwoSets(HashSet setOne, HashSet setTwo){
        ArrayList setOneAL = new ArrayList<>(setOne);
        ArrayList setTwoAL = new ArrayList<>(setTwo);
        ArrayList product = new ArrayList<>();

        if (setOne.isEmpty() || setTwo.isEmpty()){
            System.out.println("{[]}");
            return (ArrayList) List.of();
        }

        for (int i = 0; i < setOneAL.size(); i++) {
            for (int j = 0; j < setTwoAL.size(); j++) {
                product.add(setOneAL.get(i).toString() +"," + setTwoAL.get(j).toString());
            }
        }

        int cardinality = setOne.size() * setTwo.size();

        System.out.println("The Cardinality of the set is " + cardinality + ":");
        System.out.print("{");
        for (Object number: product) {
            System.out.print("[" + number + "]");
        }
        System.out.print("}");



        return product;
    }

//    public ArrayList powerSet(HashSet set){
//        ArrayList setToArraylist = new ArrayList(set);
//        ArrayList powerSet = new ArrayList();
//        HashMap tracking = new HashMap();
//        if (set.iterator().next() instanceof String){
//            for (int i = 0; i < setToArraylist.size(); i++) {
//
//            }
//        }
//
//        //might be good for use of recursions since u want to pull first element in list do all combinations then move on
//        if (set.iterator().next() instanceof Integer){
//            for (int i = 0; i < setToArraylist.size(); i++) {
//
//
//            }
//        }


    //}

//    public ArrayList recursion(ArrayList a, int count){
//
//    }


}
