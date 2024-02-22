package myFirstProject;

public class SnailPattern3 {
    public static void main(String[] args) {
        int n = 3; // 행과 열의 개수
        int[][] arr = new int[n][n];
        int value = 9; // 시작 값 변경

        int rowStart = 0; // 행 시작 인덱스
        int rowEnd = n - 1; // 행 끝 인덱스
        int colStart = 0; // 열 시작 인덱스
        int colEnd = n - 1; // 열 끝 인덱스

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 아래쪽 -> 위쪽
            for (int i = rowEnd; i >= rowStart; i--) {
                arr[i][colStart] = value--;
            }
            colStart++;

            // 오른쪽 -> 왼쪽
            for (int i = colStart; i <= colEnd; i++) {
                arr[rowStart][i] = value--;
            }
            rowStart++;

            // 위쪽 -> 아래쪽
            for (int i = rowStart; i <= rowEnd; i++) {
                arr[i][colEnd] = value--;
            }
            colEnd--;

            // 왼쪽 -> 오른쪽
            for (int i = colEnd; i >= colStart; i--) {
                arr[rowEnd][i] = value--;
            }
            rowEnd--;
        }

        // 달팽이 모양의 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}