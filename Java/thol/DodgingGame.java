import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class DodgingGame extends JPanel implements ActionListener, KeyListener {
    // Spieler-Eigenschaften
    private int playerX = 220;
    private final int playerY = 440;
    private final int playerWidth = 30;
    private final int playerHeight = 30;

    // Spielstatus und Steuerung
    private final ArrayList<Rectangle> fallingObjects = new ArrayList<>();
    private final Random random = new Random();
    private Timer gameTimer;
    private int score = 0;
    private boolean gameOver = false;
    private boolean rightPressed = false;
    private boolean leftPressed = false;

    // Fenster- und Objektgrößen
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 500;
    private static final int OBJECT_SIZE = 30;
    private static final int FALL_SPEED = 5;
    private static final int PLAYER_SPEED = 6;

    public DodgingGame() {
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(this);
        
        // Spiel-Schleife mit ca. 60 FPS
        gameTimer = new Timer(16, this);
        gameTimer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            // Gelegentliches Erzeugen neuer Objekte (ca. 5 % pro Frame)
            if (random.nextInt(100) < 5) {
                int xPos = random.nextInt(WINDOW_WIDTH - OBJECT_SIZE);
                fallingObjects.add(new Rectangle(xPos, -OBJECT_SIZE, OBJECT_SIZE, OBJECT_SIZE));
            }

            // Aktualisierung der fallenden Objekte
            for (int i = fallingObjects.size() - 1; i >= 0; i--) {
                Rectangle obj = fallingObjects.get(i);
                obj.y += FALL_SPEED;

                // Entfernen, wenn das Objekt den unteren Bildschirmrand verlässt
                if (obj.y > WINDOW_HEIGHT) {
                    fallingObjects.remove(i);
                    score++;
                } 
                // Kollisionsabfrage mit dem Spieler
                else if (obj.intersects(new Rectangle(playerX, playerY, playerWidth, playerHeight))) {
                    gameOver = true;
                }
            }

            // Spielerbewegung
            if (rightPressed && playerX < WINDOW_WIDTH - playerWidth) {
                playerX += PLAYER_SPEED;
            }
            if (leftPressed && playerX > 0) {
                playerX -= PLAYER_SPEED;
            }
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Spieler zeichnen
        g2d.setColor(Color.BLUE);
        g2d.fillRoundRect(playerX, playerY, playerWidth, playerHeight, 10, 10);

        // Fallende Objekte zeichnen
        g2d.setColor(Color.RED);
        for (Rectangle obj : fallingObjects) {
            g2d.fillRect(obj.x, obj.y, obj.width, obj.height);
        }

        // Punktestand
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("SansSerif", Font.BOLD, 18));
        g2d.drawString("Punkte: " + score, 15, 30);

        // Spielende-Meldung
        if (gameOver) {
            g2d.setColor(new Color(0, 0, 0, 180));
            g2d.fillRect(0, WINDOW_HEIGHT / 2 - 40, WINDOW_WIDTH, 80);
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("SansSerif", Font.BOLD, 22));
            g2d.drawString("Spiel vorbei!", WINDOW_WIDTH / 2 - 70, WINDOW_HEIGHT / 2);
            g2d.setFont(new Font("SansSerif", Font.PLAIN, 16));
            g2d.drawString("Drücken Sie LEERTASTE zum Neustart.", WINDOW_WIDTH / 2 - 110, WINDOW_HEIGHT / 2 + 25);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        // Steuerung: A = links, D = rechts
        if (key == KeyEvent.VK_D) rightPressed = true;
        if (key == KeyEvent.VK_A) leftPressed = true;
        if (key == KeyEvent.VK_SPACE && gameOver) {
            resetGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        // Steuerung: A = links, D = rechts
        if (key == KeyEvent.VK_D) rightPressed = false;
        if (key == KeyEvent.VK_A) leftPressed = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Nicht benötigt
    }

    private void resetGame() {
        playerX = (WINDOW_WIDTH - playerWidth) / 2;
        fallingObjects.clear();
        score = 0;
        gameOver = false;
    }

    public static void main(String[] args) {
        // Erstellung des Hauptfensters
        JFrame frame = new JFrame("Ausweichspiel");
        DodgingGame gamePanel = new DodgingGame();
        
        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}