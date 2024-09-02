import java.util.Scanner;
public class transpose_of_matrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            int[][] transposeMatrix = new int[3][3];


            System.out.println("Enter elements of the 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    transposeMatrix[j][i] = matrix[i][j];
                }
            }


            System.out.println("Transpose of the matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(transposeMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

