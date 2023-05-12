package org.example;
import org.example.SetOperations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;
import java.util.*;

public class AppTest {

    SetOperations operations = new SetOperations();
    public HashSet generateRandomSet(int size){
        HashSet randomNumbersSet = new HashSet();

        Random random = new Random();

        while (randomNumbersSet.size() < size){
            int randomNumber = random.nextInt(25) + 1;
            randomNumbersSet.add(randomNumber);
        }

        return randomNumbersSet;
    }

    @Test
    public void unionOfTwoSets(){
        HashSet setOne = generateRandomSet(3);
        HashSet setTwo = generateRandomSet(5);

        HashSet union = operations.union(setOne, setTwo);

        System.out.print("{");
        for (Object number: union) {
            System.out.print("[" + number + "]");
        }
        System.out.print("}");
    }

    @Test
    public void intersectionOfTwoSets(){
        HashSet setOne = generateRandomSet(3);
        HashSet setTwo = generateRandomSet(5);

        HashSet intersection = operations.intersection(setOne, setTwo);

        System.out.print("{");
        for (Object number: intersection) {
            System.out.print("[" + number + "]");
        }
        System.out.print("}");

    }

    @Test
    public void differenceOfTwoSets(){
        HashSet setOne = generateRandomSet(20);
        HashSet setTwo = generateRandomSet(20);

        HashSet difference = operations.setDifference(setOne, setTwo);

        System.out.print("{");
        for (Object number: difference) {
            System.out.print("[" + number + "]");
        }
        System.out.print("}");
    }

    @Test
    public void cartisianProduct(){
        HashSet setOne = generateRandomSet(3);
        HashSet setTwo = generateRandomSet(3);

        ArrayList catisianProduct = operations.cartisianProductOfTwoSets(setOne, setTwo);


    }







}
