package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caller
{
    public static void main(String[] args) {
        X obj=new X();
    }
}

class X extends JFrame implements ActionListener
{
    int i;
    JButton button;
    JProgressBar progress;
    public X()
    {
        button=new JButton("Add Form");
        progress=new JProgressBar(0,20);
        Timer time=new Timer(250,this);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time.start();
            }
        });

        //adding elements
        add(button);
        add(progress);

        //making UI
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(i==20)
        {
            new Addition();
            dispose();//to close background frame after new frame opens
        }
        i++;
        progress.setValue(i);
    }
}