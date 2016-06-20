import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nico on 19.06.2016.
 */
public class GoLGUI implements GoLGUII {

    private List<JPanel> myPanels;
    private JFrame myFrame;

    public GoLGUI(String title, SpielfeldI mySpielfeld, List<ZelleI> myZellen) throws HeadlessException {
        myFrame = new JFrame(title);

        myPanels = new ArrayList<>();

        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setLayout(new GridLayout(mySpielfeld.getX(), mySpielfeld.getY()));

        for (int i = 0; i < myZellen.size(); i++) {
            myPanels.add(new JPanel());
            myPanels.get(i).setPreferredSize(new Dimension(15, 15));


        }

        for (JPanel myPanel : myPanels) {
            myFrame.add(myPanel);
        }

        updateLayout(myZellen);


    }

    @Override
    public void updateLayout(List<ZelleI> myZellen) {

        Thread myThread = new Thread();

        myThread.start();

        try {
            Thread.sleep(500);

            for (int i = 0; i < myZellen.size(); i++) {
                if (myZellen.get(i).isZelleLebt()) {
                    myPanels.get(i).setBackground(Color.green);
                }
                else {
                    myPanels.get(i).setBackground(Color.black);
                }

            }

            myFrame.pack();
            myFrame.setLocationRelativeTo(null);
            myFrame.setVisible(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
