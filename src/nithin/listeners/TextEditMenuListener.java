package nithin.listeners;

import nithin.View;


import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

public class TextEditMenuListener implements MenuListener {
    private View view;

    @Override
    public void menuSelected(MenuEvent e) {
        JMenu jMenu = (JMenu) e.getSource();
        Component[] items = jMenu.getMenuComponents();
        for (Component component : items)
            component.setEnabled(view.isHtmlTabSelected());
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
    public TextEditMenuListener(View view){
        this.view = view;
    }
}
