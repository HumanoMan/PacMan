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
public class Boost extends Piece {

    public void eaten() {

    }

    public Boost() {
        this.x = 20;
        this.y = 40;
        this.width = 20;
        this.height = 20;
        this.color = new Color(166, 234, 142);
    }

    @Override
    public void draw(Graphics g) {
        /**
         * Frutas Boost
         */
            g.setColor(color);
            g.fillRect(x, y, width, height);
        /**
         * Fim Frutas Boost
         */

    }
}
