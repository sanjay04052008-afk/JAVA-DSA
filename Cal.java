import java.awt.*;
import java.awt.event.*;

public class Cal extends Frame implements ActionListener {

    TextField textField;
    String operator;
    double num1, num2, result;

    Cal() {
        // Frame setup
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new GridLayout(6, 4, 5, 5));

        // Text field
        textField = new TextField();
        add(textField);

        // Empty cells for alignment
        add(new Label(""));
        add(new Label(""));
        add(new Label(""));

        // Buttons
        String[] buttons = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+",
            "C"
        };

        for (String text : buttons) {
            Button btn = new Button(text);
            btn.addActionListener(this);
            add(btn);
        }

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } 
        else if (command.equals("C")) {
            textField.setText("");
        } 
        else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            textField.setText("" + result);
        } 
        else {
            num1 = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Cal();
    }
}