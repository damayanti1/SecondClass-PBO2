//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1)); //false
        System.out.println(hasEqualSum(1, 1, 2)); //true
        System.out.println(hasEqualSum(1, -1, 0)); //true
    }
       public static boolean hasEqualSum(int num1, int num2, int sum) {
        return (num1 + num2) == sum;

    }
}