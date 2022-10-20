import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import java.util.ArrayList;


public class buttonFunction implements ActionListener {
    static Candys barGraph;

    ArrayList<Candys> arrayList = new ArrayList<Candys>(5);
    int numClicks = 0;

    JButton pushBtn;
    JButton popBtn;
    JButton peekBtn;
    JButton isEmptyBtn;
    JButton sizeBtn;

    JLabel displayReturn;



    public void setList(ArrayList arrayList){

        this.arrayList = arrayList;



    }
    public ArrayList getList(){

        System.out.println(arrayList);

        return this.arrayList;
    }


    public buttonFunction(){
        pushBtn = new JButton("push");
        pushBtn.setFocusable(false);
        pushBtn.addActionListener(this);
        //pushBtn.setBackground(Color.BLUE);

        popBtn = new JButton("pop");
        popBtn.setFocusable(false);
        popBtn.addActionListener(this);

        peekBtn = new JButton("top");
        peekBtn.setFocusable(false);
        peekBtn.addActionListener(this);


        isEmptyBtn = new JButton("isEmpty");
        isEmptyBtn.setFocusable(false);
        isEmptyBtn.addActionListener(this);

        sizeBtn = new JButton("size");
        sizeBtn.setFocusable(false);
        sizeBtn.addActionListener(this);


        displayReturn = new JLabel();
        displayReturn.setFont(new Font("Courier", Font.BOLD,20));



    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        buttonFunction buttons = new buttonFunction();
        if(actionEvent.getSource() == pushBtn){
            numClicks++;

            pushAction();
            if(numClicks>5){
                numClicks=5;
            }

            System.out.println(numClicks);
        }
        else if(actionEvent.getSource()==popBtn){
            popAction();

            if(numClicks==5){
                displayReturn.setText("Element removed is: 5");
            }
            else if(numClicks==4){
                displayReturn.setText("Element removed is: 4");
            }
            else if(numClicks==3){
                displayReturn.setText("Element removed is: 3");
            }
            else if(numClicks==2){
                displayReturn.setText("Element removed is: 2");
            }
            else if(numClicks==1){
                displayReturn.setText("Element removed is: 1");
            }
            else{
                if(numClicks<1){
                    numClicks=1;
                }

            }

            numClicks--;
            System.out.println(numClicks);

        }
        else if(actionEvent.getSource()==peekBtn){

            displayReturn.setText("The top element is: " + peek());



        }
        else if(actionEvent.getSource()==isEmptyBtn){

            if(isEmpty()){
                displayReturn.setText("True");
            }
            else{
                displayReturn.setText("False");
            }

        }
        else if(actionEvent.getSource()==sizeBtn){

            displayReturn.setText("Size is: " + size());
        }
        else{ //do nothing

        }

    }






    public ArrayList pushAction(){


       if(numClicks==1){
           arrayList.add(new Candys(50, 50, 100, 60, "1"));


      /* dispenser.candy1.setBounds(50, 50, 100, 60);
       dispenser.candy1.setText("A");

       */



       }
       else if(numClicks==2){
           arrayList.add(new Candys(50, 50, 100, 60, "2"));
           arrayList.set(0, new Candys(50, 110, 100, 60, "1"));

       /*dispenser.candy1.setBounds(50, 110, 100, 60);
       dispenser.candy1.setText("A");
       dispenser.candy2.setBounds(50, 50, 100, 60);
       dispenser.candy2.setText("B");*/
       }
       else if(numClicks == 3){
           arrayList.add(new Candys(50, 50, 100, 60, "3"));
           arrayList.set(1, new Candys(50, 110, 100, 60, "2"));
           arrayList.set(0, new Candys(50, 170, 100, 60, "1"));

       /*dispenser.candy1.setBounds(50, 170, 100, 60);
       dispenser.candy1.setText("A");
       dispenser.candy2.setBounds(50, 110, 100, 60);
       dispenser.candy2.setText("B");
       dispenser.candy3.setBounds(50, 50, 100, 60);
       dispenser.candy3.setText("C");*/
       }
       else if(numClicks == 4){
           arrayList.add(new Candys(50, 50, 100, 60, "4"));
           arrayList.set(2, new Candys(50, 110, 100, 60, "3"));
           arrayList.set(1, new Candys(50, 170, 100, 60, "2"));
           arrayList.set(0, new Candys(50, 230, 100, 60, "1"));

       /*dispenser.candy1.setBounds(50, 230, 100, 60);
       dispenser.candy1.setText("A");
       dispenser.candy2.setBounds(50, 170, 100, 60);
       dispenser.candy2.setText("B");
       dispenser.candy3.setBounds(50, 110, 100, 60);
       dispenser.candy3.setText("C");
       dispenser.candy4.setBounds(50, 50, 100, 60);
       dispenser.candy4.setText("D");*/

       }
       else if(numClicks == 5){
           arrayList.add(new Candys(50, 50, 100, 60, "5"));
           arrayList.set(3, new Candys(50, 110, 100, 60, "4"));
           arrayList.set(2, new Candys(50, 170, 100, 60, "3"));
           arrayList.set(1, new Candys(50, 230, 100, 60, "2"));
           arrayList.set(0, new Candys(50, 290, 100, 60, "1"));


       /*dispenser.candy1.setBounds(50, 290, 100, 60);
       dispenser.candy1.setText("A");
       dispenser.candy2.setBounds(50, 230, 100, 60);
       dispenser.candy2.setText("B");
       dispenser.candy3.setBounds(50, 170, 100, 60);
       dispenser.candy3.setText("C");
       dispenser.candy4.setBounds(50, 110, 100, 60);
       dispenser.candy4.setText("D");
       dispenser.candy5.setBounds(50, 50, 100, 60);
       dispenser.candy5.setText("E");*/
       }
       else{

           displayReturn.setText("The dispenser is full. STACK OVERFLOW.");

       }


        buttonFunction buttons = new buttonFunction();
        buttons.setList(arrayList);


        return arrayList;
    }

    public ArrayList popAction(){


            if(numClicks==5){
                arrayList.remove(4);
                arrayList.set(3, new Candys(50, 50, 100, 60, "4"));
                arrayList.set(2, new Candys(50, 110, 100, 60, "3"));
                arrayList.set(1, new Candys(50, 170, 100, 60, "2"));
                arrayList.set(0, new Candys(50, 230, 100, 60, "1"));

            }
            else if(numClicks==4){
                arrayList.remove(3);
                arrayList.set(2, new Candys(50, 50, 100, 60, "3"));
                arrayList.set(1, new Candys(50, 110, 100, 60, "2"));
                arrayList.set(0, new Candys(50, 170, 100, 60, "1"));


            }
            else if(numClicks==3){
                arrayList.remove(2);
                arrayList.set(1, new Candys(50, 50, 100, 60, "2"));
                arrayList.set(0, new Candys(50, 110, 100, 60, "1"));


            }
            else if(numClicks==2){
                arrayList.remove(1);
                arrayList.set(0, new Candys(50, 50, 100, 60, "1"));

            }
            else if(numClicks==1){
                arrayList.remove(0);
            }
            else{

                displayReturn.setText("The dispenser is empty. STACK UNDERFLOW.");
            }



        buttonFunction buttons = new buttonFunction();
        buttons.setList(arrayList);


        return arrayList;

    }

    public String peek(){
         int peekValue =arrayList.size() -1;
         if(peekValue == 0){
             return "1";
         }
         else if(peekValue == 1){
             return "2";
         }
         else if(peekValue == 2){
             return "3";
         }
         else if(peekValue==3){
             return "4";
         }
         else if(peekValue == 4){
             return "5";
         }
         else{
             if(peekValue<0){
                 return "NULL";
             }
         }

         return "";


    }

    public boolean isEmpty(){
        if(arrayList.isEmpty()){
            return true;
        }
        return false;
    }

    public int size(){
        int size = arrayList.size();
        return size;
    }



}
