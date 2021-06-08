
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

public class PuzzleJava{
    //1.)
    public static void greaterTen(int[] x){
        ArrayList<Integer> newarray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i]>10){
                newarray.add(x[i]);
            }
            sum = x[i] + sum;
            }
        System.out.println(newarray);
        System.out.println(sum);
    }

    //2.)
    public static void nameArr(String[] x){
        ArrayList<String> newarray1 = new ArrayList<String>();
        ArrayList<String> newarray2 = new ArrayList<String>();
        for ( int i = 0; i< x.length; i++){
            newarray1.add(x[i]);
            if(x[i].length()>5){
                newarray2.add(x[i]);
            }
            
        }
        Collections.shuffle(newarray1);
        System.out.println(newarray1);
        System.out.println(newarray2);
    }

    //3.)
    public static void alphaBet(String[] x){
        ArrayList<String> newarray1 = new ArrayList<String>();
        for( int i = 0; i < x.length; i++){
            newarray1.add(x[i]);
        }
        Collections.shuffle(newarray1);
        System.out.println(newarray1);
        if(newarray1.get(0) ==  "a"){
            System.out.print("This is a vowel");
        }
        else if(newarray1.get(0) ==  "e"){
            System.out.print("This is a vowel");
        }
        else if(newarray1.get(0) ==  "i"){
            System.out.print("This is a vowel");
        }
        else if(newarray1.get(0) ==  "o"){
            System.out.print("This is a vowel");
        }
        else if(newarray1.get(0) ==  "u"){
            System.out.print("This is a vowel");
        }
        System.out.println(newarray1.get(0));
        System.out.println(newarray1.size());
        System.out.println(newarray1.get(newarray1.size() -1));
    }
    
    //4.)
    public static void randomNum(int num1, int num2){
        ArrayList<Integer> newarray = new ArrayList<Integer>();
        Random gen = new Random();
        for (int i = 0; i < 10; i++){
            newarray.add(gen.nextInt(num1) + num2);
        }
        System.out.println(newarray);
    }

    //5.)
    public static void randomNumSort(int num1, int num2){
        ArrayList<Integer> newarray = new ArrayList<Integer>();
        Random gen = new Random();
        for (int i = 0; i < 10; i++){
            newarray.add(gen.nextInt(num1) + num2);
        }
        
        Collections.sort(newarray);
        System.out.println(newarray);
        int min = newarray.get(0);
        int max = newarray.get(0);
        for(int i = 0; i < newarray.size(); i++){
            if(min < newarray.get(i)){
                min = newarray.get(i);
            }
            if(max > newarray.get(i)){
                max = newarray.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void randomString(String characters){
        
        ArrayList<String> newarray = new ArrayList<String>();
        for(int z = 1; z <=5; z++){
        
            String ranString = "";
            int length = 5;

            Random rand = new Random();

            char[] text = new char[length];

            for(int i = 0; i < length; i++){
                text[i] = characters.charAt(rand.nextInt(characters.length()));
            }
            for(int i = 0; i < text.length; i++){
                ranString += text[i];
            }
            newarray.add(ranString);
        }
        System.out.print(newarray);
    }



    public static void main (String[] args){
       // String[] x = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        //PuzzleJava.greaterTen(x);
        //PuzzleJava.nameArr(x);
        //PuzzleJava.alphaBet(x);
        int num1 = 45;
        int num2 = 55;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //PuzzleJava.randomNumSort(num1, num2);
        PuzzleJava.randomString(characters);
    }
}
