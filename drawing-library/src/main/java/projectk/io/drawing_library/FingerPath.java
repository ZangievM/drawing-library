package projectk.io.drawing_library;

import android.graphics.Path;

/**
 * Created by zaur_ on 22.09.2017.
 */

public class FingerPath {

    public int color;

    public int strokeWidth;
    public Path path;

    public FingerPath(int color, int strokeWidth, Path path) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
