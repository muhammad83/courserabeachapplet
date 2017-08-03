package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
    public void setup(){
//        size(400,400);
//        background(200, 200, 200);


        size (500, 500);
        background(130);
    }

    public void draw() {
        fill(233, 224 , 71);
        strokeWeight(7);
        ellipse(250, 250, 300 ,300);
        fill(0);
        ellipse(200, 210 , 30, 70);
        fill(0);
        ellipse(300, 210 , 30, 70);
        fill (255);
        bezier(150, 295, 200, 370, 300, 370, 350, 295);
        line(150, 295, 350, 295);
        line(160, 180, 210, 135);
        line(340, 100, 290,75 );
    }
}
