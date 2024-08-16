package Package_Sweet;

import javax.swing.*;
import java.awt.*;

public class TestUtils {

    public static Component getComponentByName(Container container, String name) {
        Component[] components = container.getComponents();
        for (int i = 0; i < components.length; i++) {
            Component c = components[i];
            if (name.equals(c.getName())) {
                return c;
            } else if (c instanceof Container) {
                Component child = getComponentByName((Container) c, name);
                if (child != null) {
                    return child;
                }
            }
        }
        return null;
    }

    public static String getLastMessageFromJOptionPane() {
        JOptionPane jOptionPane = findJOptionPane();
        if (jOptionPane != null) {
            return (String) jOptionPane.getMessage();
        }
        return null;
    }

    private static JOptionPane findJOptionPane() {
        Window[] windows = Window.getWindows();
        for (int i = 0; i < windows.length; i++) {
            Window window = windows[i];
            if (window instanceof JDialog) {
                JDialog dialog = (JDialog) window;
                Component[] components = dialog.getContentPane().getComponents();
                for (int j = 0; j < components.length; j++) {
                    Component component = components[j];
                    if (component instanceof JOptionPane) {
                        return (JOptionPane) component;
                    }
                }
            }
        }
        return null;
    }
}
