import java.awt.*;
import java.awt.event.*;

public class SimpleSciCalc extends Frame implements ActionListener {

    TextField display;
    double num1 = 0, num2 = 0;
    String operator = "";

    public SimpleSciCalc() {

        setTitle("Simple Sci Calculator");
        setSize(300, 350);
        setLayout(new BorderLayout());

        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(5, 4, 5, 5));

        String buttons[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+",
            "sin","cos","tan","√"
        };

        for(String b : buttons){
            Button btn = new Button(b);
            btn.addActionListener(this);
            p.add(btn);
        }

        add(p, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){ dispose(); }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String cmd = e.getActionCommand();

        // Number buttons
        if(cmd.matches("[0-9]")){
            display.setText(display.getText() + cmd);
            return;
        }

        // Clear
        if(cmd.equals("C")){
            display.setText("");
            num1 = num2 = 0;
            operator = "";
            return;
        }

        // Single functions (sin,cos,tan,√)
        if(cmd.equals("sin") || cmd.equals("cos") || cmd.equals("tan") || cmd.equals("√")){
            if(display.getText().equals("")) return;

            double val = Double.parseDouble(display.getText());
            double result = 0;

            switch(cmd){
                case "sin": result = Math.sin(Math.toRadians(val)); break;
                case "cos": result = Math.cos(Math.toRadians(val)); break;
                case "tan": result = Math.tan(Math.toRadians(val)); break;
                case "√":  result = Math.sqrt(val); break;
            }

            display.setText(String.valueOf(result));
            return;
        }

        // Operator (+ - * /)
        if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")){
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            display.setText("");
            return;
        }

        // Equal
        if(cmd.equals("=")){
            num2 = Double.parseDouble(display.getText());

            double result = 0;
            switch(operator){
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = (num2==0) ? Double.NaN : num1/num2; break;
            }

            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args){
        new SimpleSciCalc();
    }
}
