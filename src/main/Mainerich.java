package main;

import javax.swing.*;

public class Mainerich {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DrawMainCanvas().run());
    }

}