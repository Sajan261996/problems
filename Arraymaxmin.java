

public class Arraymaxmin {
public static void main(String[] args) {
    int [] Array = {12,45,67,23,9,56};
    int max = Array[0];
    int min = Array[0];


    for (int i = 1; i < Array.length; i++) {
        if (Array[i] > max) {
            max = Array[i];
        }
        if (Array[i] < min) {
            min = Array[i];
        }
    }

    System.out.println("Maximum: " + max + ", Minimum: " + min);
        
    }
}
