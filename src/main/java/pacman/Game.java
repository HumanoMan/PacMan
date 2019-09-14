/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.Timer;

/**
 *
 * @author willian
 */
public class Game extends JFrame implements KeyListener {

    private Pac pac;
    private Stage stage;
    private Timer timer;

    public static void main(String args[]) {
        Game game = new Game();
        game.start();
    }

    public Game() {
        super("Pacman Atari 2600 by Willian");

        pac = new Pac();
        Dimension d = new Dimension(800, 600);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
        stage = new Stage();
        stage.setSize(800, 600);
        stage.pac = pac;
        stage.bgcolor = new Color(16, 43, 237);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        addKeyListener(this);
        setVisible(true);
        add(stage);
    }

    public void start() {
        timer = new Timer(33, stage);
        timer.start();
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        /**
         * Aqui começa a movimentação com o uso das teclas W A S D e Setas
         */
        //cima
        if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
            pac.vely = -5;
            pac.velx = 0;
        }

        //baixo
        if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
            pac.vely = 5;
            pac.velx = 0;
        }
        //esquerda
        if (e.getKeyCode() == 65 || e.getKeyCode() == 37) {
            pac.velx = -5;
            pac.vely = 0;

        }
        //direita
        if (e.getKeyCode() == 68 || e.getKeyCode() == 39) {
            pac.velx = 5;
            pac.vely = 0;
        }
        /**
         * Aqui acaba a movimentação com o uso das teclas W A S D e Setas
         */        
    }

    public void keyReleased(KeyEvent e) {

    }
}
