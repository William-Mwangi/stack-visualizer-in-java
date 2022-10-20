
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dispenser extends JPanel{

    static buttonFunction buttons = new buttonFunction();
    ArrayList<Candys> arrayList = buttons.getList();











    public void paintComponent(Graphics g){
        super.paintComponent(g);




        if(arrayList == null){
            System.out.println("There is an error of null");
        }
        else if(arrayList.isEmpty()){
            //do nothing
        }
        else if(arrayList.size() > 5){
            //do nothing
        }
        else{
            for(int i=0; i<arrayList.size(); i++){
                arrayList.get(i).draw(g);
            }
        }



        /*
        g.setColor(Color.BLUE);
        g.fillOval(50, 110, 100, 60);

        g.setColor(Color.BLUE);
        g.fillOval(50, 170, 100, 60);

        g.setColor(Color.BLUE);
        g.fillOval(50, 230, 100, 60);

        g.setColor(Color.BLUE);
        g.fillOval(50, 290, 100, 60);*/

        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 50, 480);

        g.setColor(Color.BLACK);
        g.drawLine(150, 50, 150, 480);

        g.setColor(Color.BLACK);
        g.drawLine(50, 480, 150, 480);

        if(arrayList.size()<1){
            g.setColor(Color.BLACK);
            g.drawLine(50, 480, 150, 394);

            g.setColor(Color.BLACK);
            g.drawLine(50, 394, 150, 480);

            g.setColor(Color.BLACK);
            g.drawLine(50, 394, 150, 308);

            g.setColor(Color.BLACK);
            g.drawLine(50, 308, 150, 394);

            g.setColor(Color.BLACK);
            g.drawLine(50, 308, 150, 222);

            g.setColor(Color.BLACK);
            g.drawLine(50, 222, 150, 308);

            g.setColor(Color.BLACK);
            g.drawLine(50, 222, 150, 136);

            g.setColor(Color.BLACK);
            g.drawLine(50, 136, 150, 222);

            g.setColor(Color.BLACK);
            g.drawLine(50, 136, 150, 50);

            g.setColor(Color.BLACK);
            g.drawLine(50, 50, 150, 136);

            g.setColor(Color.BLACK);
            g.drawLine(50, 50, 150, 50);
        }
        if(arrayList.size()==1){
            g.setColor(Color.BLACK);
            g.drawLine(50, 480, 150, 406);

            g.setColor(Color.BLACK);
            g.drawLine(50, 406, 150, 480);

            g.setColor(Color.BLACK);
            g.drawLine(50, 406, 150, 332);

            g.setColor(Color.BLACK);
            g.drawLine(50, 332, 150, 406);

            g.setColor(Color.BLACK);
            g.drawLine(50, 332, 150, 258);

            g.setColor(Color.BLACK);
            g.drawLine(50, 258, 150, 332);

            g.setColor(Color.BLACK);
            g.drawLine(50, 258, 150, 184);

            g.setColor(Color.BLACK);
            g.drawLine(50, 184, 150, 258);

            g.setColor(Color.BLACK);
            g.drawLine(50, 110, 150, 184);

            g.setColor(Color.BLACK);
            g.drawLine(50, 184, 150, 110);

            g.setColor(Color.BLACK);
            g.drawLine(50, 110, 150, 110);
        }
        if(arrayList.size() == 2){
            g.setColor(Color.BLACK);
            g.drawLine(50, 480, 150, 418);

            g.setColor(Color.BLACK);
            g.drawLine(50, 418, 150, 480);

            g.setColor(Color.BLACK);
            g.drawLine(50, 418, 150, 356);

            g.setColor(Color.BLACK);
            g.drawLine(50, 356, 150, 418);

            g.setColor(Color.BLACK);
            g.drawLine(50, 356, 150, 294);

            g.setColor(Color.BLACK);
            g.drawLine(50, 294, 150, 356);

            g.setColor(Color.BLACK);
            g.drawLine(50, 294, 150, 232);

            g.setColor(Color.BLACK);
            g.drawLine(50, 232, 150, 294);

            g.setColor(Color.BLACK);
            g.drawLine(50, 170, 150, 232);

            g.setColor(Color.BLACK);
            g.drawLine(50, 232, 150, 170);

            g.setColor(Color.BLACK);
            g.drawLine(50, 170, 150, 170);
        }
        if(arrayList.size()==3){
            g.setColor(Color.BLACK);
            g.drawLine(50, 480, 150, 430);

            g.setColor(Color.BLACK);
            g.drawLine(50, 430, 150, 480);

            g.setColor(Color.BLACK);
            g.drawLine(50, 430, 150, 380);

            g.setColor(Color.BLACK);
            g.drawLine(50, 380, 150, 430);

            g.setColor(Color.BLACK);
            g.drawLine(50, 380, 150, 330);

            g.setColor(Color.BLACK);
            g.drawLine(50, 330, 150, 380);

            g.setColor(Color.BLACK);
            g.drawLine(50, 330, 150, 280);

            g.setColor(Color.BLACK);
            g.drawLine(50, 280, 150, 330);

            g.setColor(Color.BLACK);
            g.drawLine(50, 230, 150, 280);

            g.setColor(Color.BLACK);
            g.drawLine(50, 280, 150, 230);

            g.setColor(Color.BLACK);
            g.drawLine(50, 230, 150, 230);
        }
        if(arrayList.size()==4){
            g.setColor(Color.BLACK);
            g.drawLine(50, 480, 150, 442);

            g.setColor(Color.BLACK);
            g.drawLine(50, 442, 150, 480);

            g.setColor(Color.BLACK);
            g.drawLine(50, 442, 150, 404);

            g.setColor(Color.BLACK);
            g.drawLine(50, 404, 150, 442);

            g.setColor(Color.BLACK);
            g.drawLine(50, 404, 150, 366);

            g.setColor(Color.BLACK);
            g.drawLine(50, 366, 150, 404);

            g.setColor(Color.BLACK);
            g.drawLine(50, 366, 150, 328);

            g.setColor(Color.BLACK);
            g.drawLine(50, 328, 150, 366);

            g.setColor(Color.BLACK);
            g.drawLine(50, 290, 150, 328);

            g.setColor(Color.BLACK);
            g.drawLine(50, 328, 150, 290);

            g.setColor(Color.BLACK);
            g.drawLine(50, 290, 150, 290);
        }
        if(arrayList.size()==5){
            g.setColor(Color.BLACK);
            g.drawLine(50, 480, 150, 454);

            g.setColor(Color.BLACK);
            g.drawLine(50, 454, 150, 480);

            g.setColor(Color.BLACK);
            g.drawLine(50, 454, 150, 428);

            g.setColor(Color.BLACK);
            g.drawLine(50, 428, 150, 454);

            g.setColor(Color.BLACK);
            g.drawLine(50, 428, 150, 402);

            g.setColor(Color.BLACK);
            g.drawLine(50, 402, 150, 428);

            g.setColor(Color.BLACK);
            g.drawLine(50, 402, 150, 376);

            g.setColor(Color.BLACK);
            g.drawLine(50, 376, 150, 402);

            g.setColor(Color.BLACK);
            g.drawLine(50, 350, 150, 376);

            g.setColor(Color.BLACK);
            g.drawLine(50, 376, 150, 350);

            g.setColor(Color.BLACK);
            g.drawLine(50, 350, 150, 350);
        }

        repaint();



    }






    public static void main(String[] args){

        System.out.println(buttons.getList());





        Dispenser dispenser = new Dispenser();
        dispenser.setBackground(Color.GREEN);
        JFrame app = new JFrame("Dispenser");
        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.GREEN);


        btnPanel.setLayout(new GridLayout(5, 1, 0, 20));
        btnPanel.setBorder(new EmptyBorder(200, 20, 20, 80));

        btnPanel.add(buttons.pushBtn);
        btnPanel.add(buttons.popBtn);
        btnPanel.add(buttons.peekBtn);
        btnPanel.add(buttons.isEmptyBtn);
        btnPanel.add(buttons.sizeBtn);


        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(Color.GREEN);
        labelPanel.setLayout(new GridLayout(1, 1, 0, 10));
        labelPanel.setBorder(new EmptyBorder(20, 20, 20, 80));

        labelPanel.add(buttons.displayReturn);





        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.GREEN);
        panel1.setLayout(new FlowLayout());


        panel1.add(labelPanel);
        panel1.add(btnPanel);




        app.setLayout(new BorderLayout());


        /*dispenser.candy1.setText("");
        dispenser.candy2.setText("");
        dispenser.candy3.setText("");
        dispenser.candy4.setText("");
        dispenser.candy5.setText("");

         */


        app.getContentPane().setBackground(Color.GREEN);
        app.add(dispenser);
        app.add(panel1, BorderLayout.EAST);







        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(1000, 700);
        app.setVisible(true);

        }



}