package swingdemo;

import javax.swing.*;
import java.awt.*;

public class FirstGUI
{
    public static void main(String[] args)
    {
        ABC obj =new ABC();
    }
}

class ABC extends JFrame //follows card layout
{
    public ABC()
    {
        setLayout(new FlowLayout());  //FlowLayout--> Gets centered in middle of screen, GridLayout, NullLayout
        JLabel label1 = new JLabel("Hello World!");
        JLabel label2 = new JLabel("Welcome Sam");
        add(label1);
        add(label2);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close app on clicking close button
    }
}