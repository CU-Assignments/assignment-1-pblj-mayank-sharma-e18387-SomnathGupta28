import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the dimensions of Matrix 1 (rows and columns): ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter the dimensions of Matrix 2 (rows and columns): ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] additionResult = new int[rows1][cols1];
            int[][] subtractionResult = new int[rows1][cols1];
            
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    additionResult[i][j] = matrix1[i][j] + matrix2[i][j];
                    subtractionResult[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            
            System.out.println("Addition:");
            printMatrix(additionResult);
            System.out.println("Subtraction:");
            printMatrix(subtractionResult);
        } else {
            System.out.println("Addition and Subtraction are not possible due to dimension mismatch.");
        }
        
        if (cols1 == rows2) {
            int[][] multiplicationResult = new int[rows1][cols2];
            
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    multiplicationResult[i][j] = 0;
                    for (int k = 0; k < cols1; k++) {
                        multiplicationResult[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            
            System.out.println("Multiplication:");
            printMatrix(multiplicationResult);
        } else {
            System.out.println("Multiplication is not possible due to dimension mismatch.");
        }
        
        scanner.close();
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}