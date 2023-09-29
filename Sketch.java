import processing.core.PApplet;
/*
A program that draws a house with a driveway, background, foreground, and sun which expands with the canvas size
@author: T. Chen
*/
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	 
    // Ground
    stroke(124, 252, 0);
    fill(124, 252, 0);
    rect((float) (width*0.0), (float) (height/1.25), (float) (width/1.0), (float) (height/5.0)); 

    // House Base
    stroke(0);
    fill(249, 253, 183); 
    rect((float) (width/8.0), (float) (height/1.86), (float) (width/2.0), (float) (height/2.66));

    // House Roof
    fill(128, 0, 0); 
    triangle((float) (width/8), (float) (height/1.86), (float) (width/1.6), (float) (height/1.86), (float) (width/2.66), (float) (height/3.47));

    // Driveway
    fill(128, 128, 118);
    rect((float) (width/8), (float) (height/1.095), (float) (width/3.2), (float) (height/5));

    // Door and doorknob
    fill(93, 41, 6);
    rect((float) (width/2.105), (float) (height/1.40), (float) (width/10), (float) (height/5));

    fill(247, 198, 107);
    ellipse((float) (width/1.86), (float) (height/1.21), (float) (width/40), (float) (height/40));

    // Window
    fill(255, 255, 255);
    rect((float) (width/5.3), (float) (height/1.51), (float) (width/6.66), (float) (height/6.66));
    line((float) (width/5.3), (float) (height/1.35), (float) (width/2.96), (float) (height/1.35));
    line((float) (width/3.81), (float) (height/1.51), (float) (width/3.81), (float) (height/1.23));

    // Sun 
    stroke(253, 184, 19);
    fill(253, 184, 19);
    ellipse((float) (width/1.25), (float) (height/5), (float) (width/4), (float) (height/4));

  }
  
}