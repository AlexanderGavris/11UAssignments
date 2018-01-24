/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author gavra1029
 */
public class sexcHiker extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    //player var
    Rectangle player = new Rectangle(HEIGHT / 2, WIDTH / 2, 40, 80);
    //make a var the reps my angle
    double theta = 0;
    //where my mouse is
    int mx, my;
    //where the center of the player will be
    int cx, cy;
    //center of hammer
    int cHX, cHY;
    //general x and y for the hammer
    int distanceOfMouseX, distanceOfMouseY;
    //general x and y for the hammer but useing the fly
    int distanceOfMouseFX, distanceOfMouseFY;
    double hammerX, hammerY;
    double hammerXF, hammerYF;
    //setting what the distance will be 
    double distance = 0;
    //make a hammer 
    Rectangle fly = new Rectangle(mx, my, 20, 20);
    //displacement in the x and y direction for player
    int playerDX = 0;
    int playerDY = 0;
    //the amount that the fly is being is being displaced

    //displacement in the x and y direction for the hammer
    int hammerDX = 0;
    int hammerDY = 0;
    //gavity strenght
    int gravity = 1;
    //controll for player
    boolean left = false;
    boolean right = false;
    boolean jump = false;
    boolean onGround = false;
    //make a arry of rectangles
    Rectangle[] blocks = new Rectangle[1];
    
    //make the distance of the displacement to be a var
    int distanceD = player.x;
    //add colour to the game using image

    BufferedImage pond = loadImage("pond.png");
    BufferedImage frog = loadImage("frog.png");
    BufferedImage underwater = loadImage("underwater.png");
    BufferedImage flyboyfly = loadImage("fly.png");
    BufferedImage log = loadImage("log.png");
    //ball
    int ballSize = 60;
    Rectangle ball = new Rectangle(600, 420, ballSize, ballSize);
    int ballXDirection = -1;
    int ballYDirection = 0;
    int ballSpeed = 4;
    //making ball go faster
    double ballFaster = 0.2;
    //game over 
    int gameover;
    //font
    Font biggerFont = new Font("arial", Font.BOLD, 42);
    Font bigistFont = new Font("arial", Font.BOLD, 70);

    // GAME VARIABLES END HERE   
    public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }

    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public sexcHiker() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //coulor for player
        //background
        g.drawImage(pond, 0, 0, WIDTH, HEIGHT - 100, null);

        g.setColor(Color.BLUE);
        //draw the frog
        g.drawImage(frog, player.x, player.y, player.width, player.height, null);
        //colour for hammer
        

        //draw log
        g.drawImage(log, ball.x, ball.y, 30, 30, null);

        g.drawImage(flyboyfly, fly.x, fly.y, 30, 30, null);

        g.setColor(Color.BLACK);
        for (int i = 0; i < blocks.length; i++) {
            g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
        }
        g.drawImage(underwater, blocks[0].x, blocks[0].y, blocks[0].width, blocks[0].height, null);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);
        // draw gameover
        g.setFont(biggerFont);
        g.drawString("Leap Frocka", WIDTH / 2 - 100, 50);
        g.setFont(bigistFont);
        if (player.intersects(ball)) {
            g.drawString("GAME OVER", WIDTH / 2 - 200, 150);
        }

        //g.setColor(Color.RED);
        //g.fillRect(player.x + player.width / 2, player.y + player.height / 2, 150, 1);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        //if the width of the log is greater than the width rest the log to 600( the other side of the sreen

        blocks[0] = new Rectangle(0, 480, WIDTH, 125);

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            ball.x = ball.x + ballXDirection * ballSpeed;
            //make ball go back
            if (ball.x < 0) {
                ball.x = WIDTH;
            }
            //make ball go faster
            ballSpeed = ballSpeed + (int) (ballFaster);

            // making the hammer rotate rounf the play useing trig
            //setting cx and cy to the center of the plaayer
            cx = player.x + player.width / 2;
            cy = player.y + player.height / 2;
            //calulate the center of the hammer for x and y
            cHX = fly.y + fly.width / 2;
            cHY = fly.y + fly.width / 2;

            //cal the x and y postion for the hammer
            distanceOfMouseX = mx - cx;
            distanceOfMouseY = my - cy;
            //calulate the x and y postion for the hammer but use the center of the hammer not the player
            distanceOfMouseFX = mx - cHX;
            distanceOfMouseFY = my - cHY;

            // start the the movement system for the player
            if (right) {
                playerDX = 5;
            } else if (left) {
                playerDX = -5;

            } else {
                playerDX = 0;
            }
            //jump
            if (onGround && jump) {
                //do someting ab jumping
                //big neg num to start move 
                playerDY = -25;
                onGround = false;
            }
            //add gavity
            playerDY = playerDY + gravity;
            //colition for the player if the frog hits the ball
            if (player.intersects(ball)) {
                ballSpeed = 0;
                if (right) {
                    playerDX = 0;
                } else if (left) {
                    playerDX = 0;

                }
                playerDY=0;

            }

            //update player
            player.x = player.x + playerDX;
            player.y = player.y + playerDY;

            //assume that user is falling
            //onGround = false;
            //check for collition
            //go through each block
            for (int i = 0; i < blocks.length; i++) {
                if (player.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);
                    //see what is smaller
                    if (cWidth < cHeight) {
                        //fix player
                        //player on left side
                        if (player.x < blocks[i].x) {
                            distanceD = player.x - cWidth;

                        } else {
                            distanceD = player.x + cWidth;
                        }
                        //stop player to move side whys
                        playerDX = 0;
                    } else {
                        //above the block
                        if (player.y < blocks[i].y) {
                            player.y = player.y - cHeight;
                            //moving up or down?
                            if (playerDY >= 0) {
                                //stop the down montion
                                playerDY = 0;
                                //standing on block
                                onGround = true;
                            }

                        } else {
                            player.y = player.y + cHeight;

                        }
                    }
                }
            }
            //make the the player rotate the hammer
            //callulate theta for the fly
            double thetaF = Math.atan2(distanceOfMouseFY, distanceOfMouseFX);
            //calulate
            double hammerRXF = 150 * Math.cos(thetaF);
            double hammerRYF = 150 * Math.sin(thetaF);
            //use soh cah toa to find the distance of hammer x and hammer y
            //calulate hammer x
            hammerXF = Math.cos(thetaF) * 150;
            //calulate hammer Y
            hammerYF = 150 * Math.sin(thetaF);

            //callulate theta
            double theta = Math.atan2(distanceOfMouseY, distanceOfMouseX);

            //calulate 
            double hammerRX = 150 * Math.cos(theta);
            double hammerRY = 150 * Math.sin(theta);
            //use soh cah toa to find the distance of hammer x and hammer y
            //find were the mouse is and if it is with in 150 or less than move the mouse useing the distance formula
            distance = Math.sqrt(distanceOfMouseX * distanceOfMouseX + distanceOfMouseY * distanceOfMouseY);
            if (distance >= 150) {
                //calulate hammer x
                hammerX = Math.cos(theta) * 150;
                //calulate hammer Y
                hammerY = 150 * Math.sin(theta);

            } else {
                //calulate hammer x
                hammerX = Math.cos(theta) * distance;
                //calulate hammer Y
                hammerY = distance * Math.sin(theta);

            }
            //refresh hammer

            fly.x = cx + (int) (hammerX);
            fly.y = cy + (int) (hammerY);

            //calulating the collition system for the hammer
            for (int i = 0; i < blocks.length; i++) {
                if (fly.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, fly.y + fly.height) - Math.max(blocks[i].y, fly.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, fly.x + fly.width) - Math.max(blocks[i].x, fly.x);
                    //making the block not go through the floor

                    System.out.println("h: " + cHeight + "   w: " + cWidth);

                    //see what is smaller
                    if (cWidth < cHeight) {
                        //fix player
                        //player on left sode
                        if (fly.x < blocks[i].x) {
                            fly.x = fly.x - cWidth;

                        } else {
                            fly.x = fly.x + cWidth;

                        }
                        //stop player to move side whys
                        hammerDX = 0;

                    } else {
                        //above the block
                        if (fly.y < blocks[i].y) {
                            fly.y = fly.y - cHeight;

                            //moving up or down?
                            if (hammerDY >= 0) {
                                //stop the down montion
                                hammerDY = 0;

                                //standing on block
                                onGround = true;
                            }

                        } else {
                            fly.y = fly.y - (fly.y - blocks[i].y) - 30;

                        }
                    }
                }
            }

            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
            mx = e.getX();
            my = e.getY();
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            //key is what u pressed
            if (key == KeyEvent.VK_D) {
                right = true;
            } else if (key == KeyEvent.VK_A) {
                left = true;
            } else if (key == KeyEvent.VK_SPACE) {
                jump = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_D) {
                right = false;
            } else if (key == KeyEvent.VK_A) {
                left = false;
            } else if (key == KeyEvent.VK_SPACE) {
                jump = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        sexcHiker game = new sexcHiker();

        // starts the game loop
        game.run();
    }
}
