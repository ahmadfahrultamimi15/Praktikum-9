package SimpleSubclass;

import javax.swing.*;
import java.awt.*;

public class Ch14JFrameSubclass1 extends JFrame {
    private static final int FRAME_WIDTH       = 300;
    private static final int FRAME_HEIGHT      = 200;
    private static final int FRAME_X_ORIGIN    = 150;
    private static final int FRAME_Y_ORIGIN    = 250;

    public Ch14JFrameSubclass1 () {
        setTitle("My First SubClass");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        setDefaultCloseOperation( EXIT_ON_CLOSE);

        changeBkColor();
    }

    private void changeBkColor() {
        Container contenPane = getContentPane();
        contenPane.setBackground(Color.BLUE);
    }
}
