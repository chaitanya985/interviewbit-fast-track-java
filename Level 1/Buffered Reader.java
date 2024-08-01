https://www.interviewbit.com/problems/buffered-reader/

import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        
        //your code goes here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int firstint = Integer.parseInt(reader.readLine());
        int secondint = Integer.parseInt(reader.readLine());
        
        System.out.println(firstint + " " + secondint);
    }
}
