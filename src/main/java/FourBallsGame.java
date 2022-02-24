import processing.core.PApplet;

public class FourBallsGame extends PApplet {

    public static final int HEIGHT = 800;
    public static final int WIDTH = 800;
    public static int ballsCount = 4;
    public static Ball[] balls = new Ball[ballsCount];

    public static void main(String args[]){
        PApplet.main("FourBallsGame", args);
        for(int index=0; index<ballsCount; index++){
            balls[index] = new Ball((index+1)*HEIGHT/5, index+1, 50);
        }
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(int index=0; index<ballsCount; index++){
            ellipse(balls[index].xAxis, balls[index].yAxis, balls[index].diameter, balls[index].diameter);
            balls[index].move();
        }
    }
    static class Ball{
        int xAxis = 0;
        int yAxis ;
        int speed;
        int diameter;

        public Ball(int yAxis, int speed, int diameter) {
            this.yAxis = yAxis;
            this.speed = speed;
            this.diameter = diameter;
        }
        void move(){
            this.xAxis += speed;
        }
    }
}
