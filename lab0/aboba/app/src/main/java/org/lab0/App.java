package org.lab0;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public int IntegerTask(int a) {
        if (a < 10 || a > 99) {
            throw new IllegalArgumentException("Error! Incorrect input!");
        }
        int tens = a / 10;
        int ones = a % 10;
        return tens + ones;
    }

    public boolean BooleanTask(int a, int b, int c) {
        return b > a && b < c;
    }

    public int IfTask(int a, int b) {
        if (a > b) {
            return 1;
        }
        return 2;
    }

    public double CaseTask(int a, double mass) {
        if(a > 5 || a < 1){
            throw new IllegalArgumentException("Error! Incorrect mass unit!");
        }
        return switch (a) {
            case 1 ->
                mass;
            case 2 ->
                mass * 0.000001;
            case 3 ->
                mass * 0.001;
            case 4 ->
                mass * 1000;
            case 5 ->
                mass * 100;
            default ->
                -1;
        };
    }

    public int ForTask(int a, int b) {
        if (a > b){
            throw new IllegalArgumentException("Error! First value is bigger than second!");
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public int WhileTask(int n) {
        if(n < 0){
            throw new IllegalArgumentException("Error! Value is negative!");
        }
        int k = 0;
        while (k * k < n) {
            k++;
        }
        return k;
    }

    public int[] ArrayTask(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    public int[] MatrixTask(int[][] a, int k) {
        int m = a[k].length;
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = a[k][i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
