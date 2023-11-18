package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc
{
    public static void main(String[] args) {
        AddSub obj=new AddSub();
    }
}

class AddSub extends JFrame
{
    JTextField field1,field2;
    JButton add,subtract;
    JLabel result;
    public AddSub()
    {
        field1=new JTextField(20);
        field2=new JTextField(20);
        add=new JButton("Add");
        subtract=new JButton("Subtract");
        result=new JLabel("Result");

        //Adding the components in the UI
        add(field1);
        add(field2);
        add(add);
        add(subtract);
        add(result);


        //implementing the functionalities
        ActionListener al=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int res=0;
                int num1=Integer.parseInt(field1.getText());
                int num2=Integer.parseInt(field2.getText());
                if(e.getSource()==add)
                  res=num1+num2;
                else if(e.getSource()==subtract)
                    res=num1-num2;
                result.setText(Integer.toString(res));
            }
        };

        //performing actions on button click
        add.addActionListener(al);
        subtract.addActionListener(al);


        //Creating the UI
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
