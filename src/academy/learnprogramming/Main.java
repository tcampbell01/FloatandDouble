package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello crazy people!");

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5/3; // this will only give us the whole number associated with int = 2
        //floats aren't recommended to be used much anymore
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d/ 3d;

        //double is much more precise than float.  double will go out 16 places.  float only 8 places.

    System.out.println("MyIntValue = " + myIntValue);
    System.out.println("MyFloatValue = " + myFloatValue);
    System.out.println("MyDoubleValue = " + myDoubleValue);



    }
}