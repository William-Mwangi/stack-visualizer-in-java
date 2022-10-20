import java.awt.*;


public class Candys {
    private int x;
    private int y;
    private int width;
    private int height;
    private String text;
    private Color color;

    private int xStart;
    private int yStart;


    public Candys(int x, int y, int width, int height, String text){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;



    }

    public void setColor(Color color){
        this.color = color;
    }
    Font myFont = new Font ("Courier New", 1, 17);




    public void draw(Graphics g){

        g.setFont(myFont);
        FontMetrics metrics = g.getFontMetrics(myFont);



        g.setColor(Color.BLUE);

        g.fillOval(x, y, width, height);
        int xStart = x + (width - metrics.stringWidth(text)) / 2;
        int yStart = y + ((height - metrics.getHeight()) / 2) + metrics.getAscent();

        g.setColor(Color.BLACK);

        g.drawString(text, xStart, yStart);








    }


}
