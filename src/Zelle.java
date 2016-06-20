import java.util.List;

/**
 * Created by Nico on 20.05.2016.
 */
public class Zelle implements ZelleI {
    private boolean zelleLebt;
    private int x;
    private int y;

    public Zelle(boolean zelleLebt, int x, int y) {
        this.zelleLebt = zelleLebt;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isZelleLebt() {
        return zelleLebt;
    }

    @Override
    public void setZelleLebt(boolean zelleLebt) {
        this.zelleLebt = zelleLebt;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }


}
