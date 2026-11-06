package basic;

public class BoardStones {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        int i = 0; // 행 번호
        for (boolean[] row : board) {
            int j = 0; // 열 번호
            for (boolean stone : row) {
                if (stone == true) {
                    System.out.println("검은돌(●) 위치: " + "(" + i + "," + j + ")");
                }
                j++;
            }
            i++;
        }
    }

    // 예상 출력:
//    검은돌(●) 위치: (0,0)
//    검은돌(●) 위치: (1,1)
}
