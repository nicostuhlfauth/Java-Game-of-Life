/**
 * Created by Nico on 20.05.2016.
 */
public class Zelle {
    private boolean zelleLebt;
    private int x;
    private int y;

    public Zelle(boolean zelleLebt, int x, int y) {
        this.zelleLebt = zelleLebt;
        this.x = x;
        this.y = y;
    }

    public boolean isZelleLebt() {
        return zelleLebt;
    }

    public void setZelleLebt(boolean zelleLebt) {
        this.zelleLebt = zelleLebt;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
