import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0,indexColumn=0;
        System.out.printf("Enter size: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int[][] array2 = new int[size][size];
        int[][] arrSum = new int[size][size];

        System.out.printf("Matrix 1: \n");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("enter element["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.printf("Matrix 2: \n");

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("enter element["+i+"]["+j+"]: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        System.out.printf("[Matrix 1]\n");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf(array[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.printf("[Matrix 2]\n");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf(array2[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.printf("[SUM]\n");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arrSum[i][j] = array[i][j] + array2[i][j];
                System.out.printf(arrSum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
