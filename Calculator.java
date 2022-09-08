package calci;

import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class Calculator implements ActionListener{
    double number,answer;
    int calculation;

    JFrame frame;
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton onRadioButton=new JRadioButton("on");
    JRadioButton offRadioButton=new JRadioButton("off");
    JButton buttonZero=new JButton("0");
    JButton buttonOne=new JButton("1");
    JButton buttonTwo=new JButton("2");
    JButton buttonThree=new JButton("3");
    JButton buttonFour=new JButton("4");
    JButton buttonFive=new JButton("5");
    JButton buttonSix=new JButton("6");
    JButton buttonSeven=new JButton("7");
    JButton buttonEight=new JButton("8");
    JButton buttonNine=new JButton("9");
    JButton buttonDot=new JButton(".");
    JButton buttonClear=new JButton("C");
    JButton buttonDelete=new JButton("DEL");
    JButton buttonEqual=new JButton("=");
    JButton buttonMul=new JButton("x");
    JButton buttonDiv=new JButton("/");
    JButton buttonAdd=new JButton("+");
    JButton buttonSub=new JButton("-");
    JButton buttonSquare=new JButton("x\u00B2");
    JButton buttonReciprocal=new JButton("1/x");
    JButton buttonSqrt=new JButton("\u221A");
    JButton buttonBinaryConversion=new JButton("Bin");
    Calculator(){
        prepareGUI();
        addComponents();
        addActionEvent();
    }
    void prepareGUI(){
        frame=new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300,500);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponents(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.black);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(Color.cyan);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 60, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonBinaryConversion.setBounds(80, 410, 60, 40);
        buttonBinaryConversion.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonBinaryConversion);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonMul);

        buttonSub.setBounds(220, 170, 60, 40);
        buttonSub.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSub);

        buttonAdd.setBounds(220, 290, 60, 40);
        buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonAdd);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);


    }
    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonBinaryConversion.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source==onRadioButton){
            enable();
        }
        else if(source==offRadioButton){
            disable();
        }
        else if(source==buttonClear){
            label.setText("");
            textField.setText("");
        }
        else if(source==buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        }
            else if(source==buttonZero){
                if(textField.getText().equals("0")){
                    return;
                }
                else{
                    textField.setText(textField.getText()+"0");
                }
            }
            else if(source==buttonOne){
                textField.setText(textField.getText()+"1");
            }
            else if(source==buttonTwo){
                textField.setText(textField.getText()+"2");
            }
            else if(source==buttonThree){
                textField.setText(textField.getText()+"3");
            }
            else if(source==buttonFour){
                textField.setText(textField.getText()+"4");
            }
            else if(source==buttonFive){
                textField.setText(textField.getText()+"5");
            }
            else if(source==buttonSix){
                textField.setText(textField.getText()+"6");
            }
            else if(source==buttonSeven){
                textField.setText(textField.getText()+"7");
            }
            else if(source==buttonEight){
                textField.setText(textField.getText()+"8");
            }
            else if(source==buttonNine){
                textField.setText(textField.getText()+"9");
            }
            else if(source==buttonDot){
                if(textField.getText().contains(".")){
                    return;
                }
                else {
                    textField.setText(textField.getText() + ".");
                }
            }
            else if(source==buttonAdd){
                String str=textField.getText();
                number= (int) Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str+"+");
                calculation=1;
            }
            else if(source==buttonSub){
                String str=textField.getText();
                number= (int) Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str+"-");
                calculation=2;
            }
            else if(source==buttonMul){
                String str=textField.getText();
                number= (int) Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str+"X");
                calculation=3;
            }
            else if(source==buttonDiv){
                String str=textField.getText();
                number= (int) Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str+"/");
                calculation=4;
            }
            else if(source==buttonSqrt){
                number= (int) Double.parseDouble(textField.getText());
                Double sqrt=Math.sqrt(number);
                textField.setText(Double.toString(sqrt));
            }
            else if(source==buttonSquare){
                String str=textField.getText();
                number= (int) Double.parseDouble(textField.getText());
                double square = Math.pow(number,2);
                String string = Double.toString(square);
                if(string.endsWith(".0")){
                    textField.setText(string.replace(".0",""));
                }else{
                    textField.setText(string);
                }
                label.setText("(sqr)"+str);
            }
            else if(source==buttonReciprocal){
                number= (int) Double.parseDouble(textField.getText());
                double reciprocal =1/number;
                String string = Double.toString(reciprocal);
                if(string.endsWith(".0")){
                    textField.setText(string.replace(".0",""));
                }else {
                    textField.setText(string);
                }
            }
            else if (source==buttonBinaryConversion) {
                number=(int) Double.parseDouble(textField.getText());
                int binary[]=new int[100000];
                int i=0;
                while(number>0){
                    binary[i++]= (int) (number%2);
                    number=number/2;
                    if(number==0)
                        break;
                }
                System.out.println(i);
                int arr[]=new int[i];
                int a=0;
                for(int j=i-1; j>=0; j--){
                    arr[a++]=binary[j];
                }
                String str= Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");;

                textField.setText(str);
            }
            else if(source==buttonEqual){
                switch (calculation){
                    case 1:
                        answer = number + Double.parseDouble(textField.getText());
                        if(Double.toString(answer).endsWith(".0")){
                            textField.setText(Double.toString(answer).replace(".0",""));
                        }else{
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                    case 2:
                        answer = number - Double.parseDouble(textField.getText());
                        if(Double.toString(answer).endsWith(".0")){
                            textField.setText(Double.toString(answer).replace(".0",""));
                        }else{
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                    case 3:
                        answer = number * Double.parseDouble(textField.getText());
                        if(Double.toString(answer).endsWith(".0")){
                            textField.setText(Double.toString(answer).replace(".0",""));
                        }else{
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                    case 4:
                        answer = number / Double.parseDouble(textField.getText());
                        if(Double.toString(answer).endsWith(".0")){
                            textField.setText(Double.toString(answer).replace(".0",""));
                        }else{
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                        break;
                }
            }



    }
        public void enable(){
            onRadioButton.setEnabled(false);
            offRadioButton.setEnabled(true);
            textField.setEnabled(true);
            label.setEnabled(true);
            buttonClear.setEnabled(true);
            buttonDelete.setEnabled(true);
            buttonDiv.setEnabled(true);
            buttonSqrt.setEnabled(true);
            buttonSquare.setEnabled(true);
            buttonReciprocal.setEnabled(true);
            buttonSub.setEnabled(true);
            buttonSeven.setEnabled(true);
            buttonEight.setEnabled(true);
            buttonNine.setEnabled(true);
            buttonMul.setEnabled(true);
            buttonFour.setEnabled(true);
            buttonFive.setEnabled(true);
            buttonSix.setEnabled(true);
            buttonAdd.setEnabled(true);
            buttonOne.setEnabled(true);
            buttonTwo.setEnabled(true);
            buttonThree.setEnabled(true);
            buttonEqual.setEnabled(true);
            buttonZero.setEnabled(true);
            buttonDot.setEnabled(true);
            buttonBinaryConversion.setEnabled(true);
        }
        public void disable(){
            onRadioButton.setEnabled(true);
            offRadioButton.setEnabled(false);
            textField.setText("");
            label.setText(" ");
            buttonClear.setEnabled(false);
            buttonDelete.setEnabled(false);
            buttonDiv.setEnabled(false);
            buttonSqrt.setEnabled(false);
            buttonSquare.setEnabled(false);
            buttonReciprocal.setEnabled(false);
            buttonSub.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
            buttonMul.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonAdd.setEnabled(false);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonEqual.setEnabled(false);
            buttonZero.setEnabled(false);
            buttonDot.setEnabled(false);
            buttonBinaryConversion.setEnabled(false);
        }

    public static void main(String[] args){

        new Calculator();
    }
}