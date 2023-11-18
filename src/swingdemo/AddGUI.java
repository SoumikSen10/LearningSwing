package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGUI
{
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

class Addition extends JFrame
{
    JTextField field1,field2;
    JButton button;
    JLabel result;
    public Addition()
    {
        field1=new JTextField(20);
        field2=new JTextField(20);
        button=new JButton("Add");
        result=new JLabel("Result");

        //placing the elements in UI
        add(field1);
        add(field2);
        add(button);
        add(result);


        //using concept of inner class here
        ActionListener al=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(field1.getText());
                int num2=Integer.parseInt(field2.getText());
                int res=num1+num2;
                result.setText(Integer.toString(res));
            }
        };

        //Executing event on clicking add button
        button.addActionListener(al);

        //building the UI
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}