/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author willian
 */
public class Ghost extends PieceMove {

    public boolean attack;

    public Ghost() {
        this.x = 385;
        this.y = 135;
        this.width = 40;
        this.height = 40;
        this.attack = true;
        this.velx = 0;
        this.vely = 0;
    }

    public void kill(Object pac) {
    }

    public void eaten() {
    }

    public void Ghost() {
    }

    @Override
    public void draw(Graphics g) {
        /**
         * Ghost
         */
        g.setColor(color);
        g.fillArc(x, y, width, height, 0, 360);
        g.fillRect(x, y + 20, 40, 20);

        // olhos
        //esquerdo
        g.setColor(Color.WHITE);
        g.fillArc(x + 10, y + 12, 10, 10, 135, 180);
        //direito
        g.setColor(Color.WHITE);
        g.fillArc(x + 22, y + 12, 10, 10, 225, 175);

        for (int saia = 0; saia < 4; saia++) {
            g.setColor(color);
            g.fillOval(x + saia * 10, y + 34, 10, 10);
        }

        // boca
        g.setColor(Color.WHITE);
        g.fillArc(x + 15, y + 26, 10, 10, 195, -210);
        /**
         * Fim Ghost
         */
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
