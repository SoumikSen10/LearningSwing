package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput
{
    public static void main(String[] args) {
        RadioDemo obj=new RadioDemo();
    }
}

class RadioDemo extends JFrame
{
    JTextField field;
    JButton button;
    JRadioButton radio1,radio2;
    JLabel result;
    JCheckBox check1,check2;
    public RadioDemo()
    {
        field=new JTextField(15);
        button=new JButton("Ok");
        radio1=new JRadioButton("Male");
        radio2=new JRadioButton("Female");
        result=new JLabel("Greetings");
        check1=new JCheckBox("Dancing");
        check2=new JCheckBox("Singing");

        ButtonGroup bg=new ButtonGroup();
        bg.add(radio1);
        bg.add(radio2);

        add(field);

        add(radio1);
        add(radio2);

        add(check1);
        add(check2);

        add(button);
        add(result);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=field.getText();
                if(radio1.isSelected())
                {
                    name="Mr. "+name;
                }
                else if(radio2.isSelected())
                {
                    name="Mrs. "+name;
                }
                if(check1.isSelected())
                {
                    name=name+" is a dancer";
                }
                if(check2.isSelected())
                {
                    name=name+" is a singer";
                }

                result.setText(name);
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
