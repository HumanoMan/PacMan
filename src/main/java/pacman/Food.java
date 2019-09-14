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
public class Food extends Piece{
    public void eaten(){
        
    }
    
    public Food(){
        this.x = 25;
        this.y = 25;
        this.width = 15;
        this.height = 5;
        this.color = new Color(159, 114, 6);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
