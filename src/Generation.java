import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nico on 21.05.2016.
 */
public class Generation {

    public List next(List<Zelle> myOldList, Spielfeld mySpielfeld) {
        List<Zelle> myList = new ArrayList<>(myOldList.size());

        for (int i = 0; i < myOldList.size(); i++) {

            int livingNeighbors = 0;

            myList.add(new Zelle(false, myOldList.get(i).getX(), myOldList.get(i).getY()));

            if ((myOldList.get(i).getY() == 1) || (myOldList.get(i).getY() == mySpielfeld.getY()) || (myOldList.get(i).getX() == 1) || (myOldList.get(i).getX() == mySpielfeld.getX())) {
                continue;
            }

            if (myOldList.get(i-(mySpielfeld.getX()+1)).isZelleLebt()) {
                livingNeighbors++;
            }
            if (myOldList.get(i-mySpielfeld.getX()).isZelleLebt()) {
                livingNeighbors++;
            }
            if (myOldList.get(i-mySpielfeld.getX()+1).isZelleLebt()) {
                livingNeighbors++;
            }
            if (myOldList.get(i-1).isZelleLebt()) {
                livingNeighbors++;
            }
            if (myOldList.get(i+1).isZelleLebt()) {
                livingNeighbors++;
            }
            if (myOldList.get(i+(mySpielfeld.getX()-1)).isZelleLebt()) {
                livingNeighbors++;
            }
            if (myOldList.get(i+mySpielfeld.getX()).isZelleLebt()) {
                livingNeighbors++;
            }
            if (myOldList.get(i+(mySpielfeld.getX()+1)).isZelleLebt()) {
                livingNeighbors++;
            }



            switch (livingNeighbors) {
                case 2:
                    if (myOldList.get(i).isZelleLebt()) {
                        myList.get(i).setZelleLebt(true);
                    }
                    else {
                        myList.get(i).setZelleLebt(false);
                    } break;
                case 3: myList.get(i).setZelleLebt(true); break;
                default: myList.get(i).setZelleLebt(false);
            }

        }

        return myList;
    }
}
