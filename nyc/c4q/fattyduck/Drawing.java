package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/17/15.
 */
public class Drawing {

    private static final String[] lines = {
            "  |",
            "\n \\",
            "o",
            "/",
            "\n _",
            "|",
            "_",
            "\n  |",
            "\n  T"

    };

    public Drawing() {
    }

    public static String get(int misses) {
        String drawing = "";
        for (int i = 0; i <= misses; i++) {
            drawing += lines[i];
        }
        return drawing;
    }
}