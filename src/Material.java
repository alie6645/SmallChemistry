import java.awt.*;
import java.awt.image.BufferedImage;

public class Material{
    int x;
    int y;
    private String id = "";
    private BufferedImage icon;

    public Material(String id, BufferedImage icon) {
        this.id = id;
        this.icon = icon;
    }

    public void place(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){
        g2.drawImage(icon,x,y,null);
    }
}
