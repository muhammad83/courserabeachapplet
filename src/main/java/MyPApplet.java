import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
    private String URL = "https://scontent-lhr3-1.xx.fbcdn.net/v/t1.0-9/19665411_10211397642114262_7078772952540710234_n.jpg?oh=db5984d221fb66cd931b092a8f5a4879&oe=59FFF75E";
    private PImage backgroundImg;

    public void setup() {
        size(800, 800);
        backgroundImg = loadImage(URL, "jpg");
    }

    public void draw() {
        backgroundImg.resize(0, height);
        image(backgroundImg, 0, 0);
        fill(255,209,0);
        noStroke();
        ellipse(width/(1.5f), height/4, width/4, height/4);

    }
}
