import java.util.List;

/**
 * Created by Nico on 20.06.2016.
 */
public interface SpielfeldI {
    int getX();

    int getY();

    List generateSpielfeld(double wahrscheinlichkeit);
}
