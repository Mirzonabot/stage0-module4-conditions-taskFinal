package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
//        Implement the program that will swap 2 variables without creating new
//        variables or objects, using bitwise operators:

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first);
        System.out.println(second);


    }
}
