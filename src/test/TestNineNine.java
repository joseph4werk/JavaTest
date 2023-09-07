package test;

public class TestNineNine {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
        System.out.println("**********************************************************************");

        for (int i = 1, j = 1; i <= 9; i++) {
            while (j <= 9) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                j++;
            }
            j = 1;
            System.out.println();
        }
        System.out.println("**********************************************************************");

        for (int i = 1, j = 1; i <= 9; i++) {
            j = 1;
            do {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                j++;
            } while (j <= 9);
            System.out.println();
        }
        System.out.println("**********************************************************************");
        int i = 1;
        int j = 1;
        while (i <= 9) {
            do {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                j++;
            } while (j <= 9);
            i++;
            j = 1;
            System.out.println();
        }
    }
}
