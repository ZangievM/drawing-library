package projectk.io.drawing_library;

/**
 * Created by zmar1 on 10/2/2017.
 */

public abstract class Tool {
    private int strokeWidth;
    private int opacity;

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Tool)) return false;

        Tool ob= (Tool) obj;
        return this.strokeWidth==ob.strokeWidth;
    }
}
