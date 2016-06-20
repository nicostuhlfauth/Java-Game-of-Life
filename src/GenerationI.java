import java.util.List;

/**
 * Created by Nico on 20.06.2016.
 */
public interface GenerationI {
    boolean isAnyFieldLiving();

    List next(List<ZelleI> myOldList, SpielfeldI mySpielfeld);
}
