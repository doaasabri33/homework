
package newpackage;

class GameEntry {
    int score;

    GameEntry(int score) {
        this.score = score;
    }
}

public class R2 {
    public static void main(String[] args) {
        GameEntry[] A = {
            new GameEntry(100),
            new GameEntry(200),
            new GameEntry(300),
            new GameEntry(400),
            new GameEntry(500)
        };

        GameEntry[] B = A.clone();
        A[4].score = 550;
        System.out.println("Score in B[4]: " + B[4].score); // Output: 550
    }
}
