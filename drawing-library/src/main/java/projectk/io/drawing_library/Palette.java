package projectk.io.drawing_library;

import android.graphics.Color;

/**
 * Created by zaur_ on 29.09.2017.
 */

public class Palette {


    public static int getColor(int color, int opacity) {

        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);

        return Color.argb(opacity,red,green,blue);
    }
}
