package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{

        //use the following code to fetch input from console
        String line;
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        line=inp.readLine();


        ArrayList<Integer> array = new ArrayList<>();
        while (line != null) {
            array.add(Integer.parseInt(line));
        }

        Collections.sort(array);

        int middle = (array.get(array.size()+1))/2;

        //Use the following code to print output
        System.out.println(middle);
    }
}
