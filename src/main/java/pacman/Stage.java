/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/**
 * @author willian
 */
public class Stage extends JComponent implements ActionListener {

    public Color bgcolor;
    public List<Block> blocks;
    public List<Ghost> ghosts;
    public List<Food> foods;
    public List<Boost> boost;
    public Pac pac;

    public Stage() {
        createGhosts();
        createFoods();
        createBoosts();
        createBlocks();
    }    

    public void createGhosts() {
        ghosts = new ArrayList<>();
        /**
         * Aqui começa os Ghosts------------------------------------------------
         */
        ghosts = new ArrayList<>();
        Ghost g1 = new Ghost();
        g1.color = new Color(104, 249, 137);
        g1.x = 380;
        g1.y = 185;
        ghosts.add(g1);

        Ghost g2 = new Ghost();
        g2.color = (Color.ORANGE);
        g1.x = 480;
        g2.y = 185;
        ghosts.add(g2);
        
        Ghost g3 = new Ghost();
        g3.color = (Color.RED);
        g3.x = 280;
        g3.y = 185;
        ghosts.add(g3);
        /**
         * Aqui acaba os Ghosts
         */
    }

    public void createFoods() {
        foods = new ArrayList<>();
        /**
         * Aqui começa os Foods-------------------------------------------------
         */
        //parte esq. 1 linha
        foods = new ArrayList<>();
        for (int food1 = 0; food1 < 8; food1++) {
            Food f1 = new Food();
            f1.color = (Color.ORANGE);
            f1.x = 24 + food1 * 35;
            f1.y = 30;
            f1.width = 15;
            f1.height = 5;
            foods.add(f1);

            //parte esq. 4 linha
            Food f2 = new Food();
            f2.color = (Color.ORANGE);
            f2.x = 24 + food1 * 35;
            f2.y = 145;
            f2.width = 15;
            f2.height = 5;
            foods.add(f2);

            //parte esq. 7 linha
            Food f3 = new Food();
            f3.color = (Color.ORANGE);
            f3.x = 24 + food1 * 35;
            f3.y = 260;
            f3.width = 15;
            f3.height = 5;
            foods.add(f3);

            //parte esq. 10 linha
            Food f4 = new Food();
            f4.color = (Color.ORANGE);
            f4.x = 24 + food1 * 35;
            f4.y = 375;
            f4.width = 15;
            f4.height = 5;
            foods.add(f4);

            //parte dir. 1 linha
            Food f5 = new Food();
            f5.color = (Color.ORANGE);
            f5.x = 511 + food1 * 35;
            f5.y = 30;
            f5.width = 15;
            f5.height = 5;
            foods.add(f5);

            //parte dir. 4 linha
            Food f6 = new Food();
            f6.color = (Color.ORANGE);
            f6.x = 511 + food1 * 35;
            f6.y = 145;
            f6.width = 15;
            f6.height = 5;
            foods.add(f6);

            //parte dir. 7 linha
            Food f7 = new Food();
            f7.color = (Color.ORANGE);
            f7.x = 511 + food1 * 35;
            f7.y = 260;
            f7.width = 15;
            f7.height = 5;
            foods.add(f7);

            //parte dir. 10 linha
            Food f8 = new Food();
            f8.color = (Color.ORANGE);
            f8.x = 511 + food1 * 35;
            f8.y = 375;
            f8.width = 15;
            f8.height = 5;
            foods.add(f8);
        }

        for (int food1 = 0; food1 < 4; food1++) {
            //parte meio. 1 linha
            Food f9 = new Food();
            f9.color = (Color.ORANGE);
            f9.x = 338 + food1 * 35;
            f9.y = 30;
            f9.width = 15;
            f9.height = 5;
            foods.add(f9);

            //parte meio. 4 linha
            Food f10 = new Food();
            f10.color = (Color.ORANGE);
            f10.x = 338 + food1 * 35;
            f10.y = 145;
            f10.width = 15;
            f10.height = 5;
            foods.add(f10);

            //parte meio. 7 linha
            Food f11 = new Food();
            f11.color = (Color.ORANGE);
            f11.x = 338 + food1 * 35;
            f11.y = 260;
            f11.width = 15;
            f11.height = 5;
            foods.add(f11);

            //parte meio. 10 linha
            Food f12 = new Food();
            f12.color = (Color.ORANGE);
            f12.x = 338 + food1 * 35;
            f12.y = 375;
            f12.width = 15;
            f12.height = 5;
            foods.add(f12);
        }

        for (int food1 = 0; food1 < 13; food1++) {
            //parte meio. 3 linha
            Food f13 = new Food();
            f13.color = (Color.ORANGE);
            f13.x = 181 + food1 * 35;
            f13.y = 87;
            f13.width = 15;
            f13.height = 5;
            foods.add(f13);

            //parte meio. 9 linha
            Food f14 = new Food();
            f14.color = (Color.ORANGE);
            f14.x = 181 + food1 * 35;
            f14.y = 317;
            f14.width = 15;
            f14.height = 5;
            foods.add(f14);

        }

        for (int food1 = 0; food1 < 6; food1++) {
            //parte meio. 15 linha
            Food f15 = new Food();
            f15.color = (Color.ORANGE);
            f15.x = 181 + food1 * 35;
            f15.y = 432;
            f15.width = 15;
            f15.height = 5;
            foods.add(f15);

            //parte meio. 15 linha
            Food f16 = new Food();
            f16.color = (Color.ORANGE);
            f16.x = 426 + food1 * 35;
            f16.y = 432;
            f16.width = 15;
            f16.height = 5;
            foods.add(f16);
        }

        for (int food1 = 0; food1 < 4; food1++) {
            //parte esquerda. 3 linha
            Food f17 = new Food();
            f17.color = (Color.ORANGE);
            f17.x = 24 + food1 * 35;
            f17.y = 87;
            f17.width = 15;
            f17.height = 5;
            foods.add(f17);

            //parte esquerda. 9 linha
            Food f18 = new Food();
            f18.color = (Color.ORANGE);
            f18.x = 24 + food1 * 35;
            f18.y = 203;
            f18.width = 15;
            f18.height = 5;
            foods.add(f18);

            //parte esquerda. 12 linha
            Food f19 = new Food();
            f19.color = (Color.ORANGE);
            f19.x = 24 + food1 * 35;
            f19.y = 317;
            f19.width = 15;
            f19.height = 5;
            foods.add(f19);

            //parte esquerda. 15 linha
            Food f20 = new Food();
            f20.color = (Color.ORANGE);
            f20.x = 24 + food1 * 35;
            f20.y = 432;
            f20.width = 15;
            f20.height = 5;
            foods.add(f20);

            //parte dir. 3 linha
            Food f21 = new Food();
            f21.color = (Color.ORANGE);
            f21.x = 655 + food1 * 35;
            f21.y = 87;
            f21.width = 15;
            f21.height = 5;
            foods.add(f21);

            //parte dir. 9 linha
            Food f22 = new Food();
            f22.color = (Color.ORANGE);
            f22.x = 655 + food1 * 35;
            f22.y = 203;
            f22.width = 15;
            f22.height = 5;
            foods.add(f22);

            //parte dir. 12 linha
            Food f23 = new Food();
            f23.color = (Color.ORANGE);
            f23.x = 655 + food1 * 35;
            f23.y = 317;
            f23.width = 15;
            f23.height = 5;
            foods.add(f23);

            //parte dir. 15 linha
            Food f24 = new Food();
            f24.color = (Color.ORANGE);
            f24.x = 655 + food1 * 35;
            f24.y = 432;
            f24.width = 15;
            f24.height = 5;
            foods.add(f24);
        }

        for (int food1 = 0; food1 < 6; food1++) {
            //parte meio. 15 linha
            Food f25 = new Food();
            f25.color = (Color.ORANGE);
            f25.x = 170 + food1 * 35;
            f25.y = 203;
            f25.width = 15;
            f25.height = 5;
            foods.add(f25);

            //parte meio. 15 linha
            Food f26 = new Food();
            f26.color = (Color.ORANGE);
            f26.x = 437 + food1 * 35;
            f26.y = 203;
            f26.width = 15;
            f26.height = 5;
            foods.add(f26);
        }
        /**
         * Aqui acaba os Foods
         */
    }

    public void createBoosts() {
        boost = new ArrayList<>();
        /**
         * Aqui começa os Boosts------------------------------------------------
         */
        boost = new ArrayList<>();
        Boost bo1 = new Boost();
        bo1.color = new Color(166, 234, 142);
        bo1.x = 25;
        bo1.y = 50;
        boost.add(bo1);

        Boost bo2 = new Boost();
        bo2.color = new Color(166, 234, 142);
        bo2.x = 760;
        bo2.y = 50;
        boost.add(bo2);

        Boost bo3 = new Boost();
        bo3.color = new Color(166, 234, 142);
        bo3.x = 25;
        bo3.y = 400;
        boost.add(bo3);

        Boost bo4 = new Boost();
        bo4.color = new Color(166, 234, 142);
        bo4.x = 760;
        bo4.y = 400;
        boost.add(bo4);
        /**
         * Aqui acaba os Boosts
         */
    }

    public void createBlocks() {
        blocks = new ArrayList<>();
        /**
         * Aqui Começa o labirinto----------------------------------------------
         */
        // bloco cima
        Block b1 = new Block();
        b1.width = 800;
        b1.height = 10;
        b1.x = 0;
        b1.y = 0;
        b1.color = new Color(159, 114, 60);

        blocks.add(b1);
        // bloco baixo
        Block b2 = new Block();
        b2.width = 800;
        b2.height = 10;
        b2.x = 0;
        b2.y = 468;
        b2.color = new Color(159, 114, 60);

        blocks.add(b2);
        // bloco lado esquerdo
        Block b3 = new Block();
        b3.width = 10;
        b3.height = 460;
        b3.x = 0;
        b3.y = 10;
        b3.color = new Color(159, 114, 60);

        blocks.add(b3);
        //block lado direito
        Block b4 = new Block();
        b4.width = 10;
        b4.height = 460;
        b4.x = 790;
        b4.y = 10;
        b4.color = new Color(159, 114, 60);

        blocks.add(b4);

        //traço 1
        for (int block = 0; block < 3; block++) {
            Block b5 = new Block();
            b5.x = 0;
            b5.y = 115 + block * 115;
            b5.width = 50;
            b5.height = 10;
            b5.color = new Color(159, 114, 60);
            blocks.add(b5);

            Block b6 = new Block();
            b6.x = 750;
            b6.y = 115 + block * 115;
            b6.width = 50;
            b6.height = 10;
            b6.color = new Color(159, 114, 60);
            blocks.add(b6);
        }

        //traço 2
        for (int block = 0; block < 4; block++) {
            Block b7 = new Block();
            b7.x = 60;
            b7.y = 58 + block * 115;
            b7.width = 40;
            b7.height = 10;
            b7.color = new Color(159, 114, 60);
            blocks.add(b7);

            Block b8 = new Block();
            b8.x = 700;
            b8.y = 58 + block * 115;
            b8.width = 40;
            b8.height = 10;
            b8.color = new Color(159, 114, 60);
            blocks.add(b8);
        }

        //traço 3            
        for (int block = 0; block < 3; block++) {
            Block b9 = new Block();
            b9.x = 100;
            b9.y = 115 + block * 115;
            b9.width = 58;
            b9.height = 10;
            b9.color = new Color(159, 114, 60);
            blocks.add(b9);

            Block b10 = new Block();
            b10.x = 640;
            b10.y = 115 + block * 115;
            b10.width = 58;
            b10.height = 10;
            b10.color = new Color(159, 114, 60);
            blocks.add(b10);
        }

        //traço 4
        for (int block = 0; block < 4; block++) {
            Block b11 = new Block();
            b11.x = 214;
            b11.y = 58 + block * 115;
            b11.width = 40;
            b11.height = 10;
            b11.color = new Color(159, 114, 60);
            blocks.add(b11);

            Block b12 = new Block();
            b12.x = 545;
            b12.y = 58 + block * 115;
            b12.width = 40;
            b12.height = 10;
            b12.color = new Color(159, 114, 60);
            blocks.add(b12);
        }

        //traço 5
        for (int block = 0; block < 3; block++) {
            Block b13 = new Block();
            b13.x = 214;
            b13.y = 115 + block * 115;
            b13.width = 100;
            b13.height = 10;
            b13.color = new Color(159, 114, 60);
            blocks.add(b13);

            Block b14 = new Block();
            b14.x = 486;
            b14.y = 115 + block * 115;
            b14.width = 100;
            b14.height = 10;
            b14.color = new Color(159, 114, 60);
            blocks.add(b14);
        }

        //traço 6 meio
        for (int block = 0; block < 4; block++) {
            Block b15 = new Block();
            b15.x = 370;
            b15.y = 58 + block * 115;
            b15.width = 60;
            b15.height = 10;
            b15.color = new Color(159, 114, 60);
            blocks.add(b15);
        }

        for (int block = 0; block < 3; block++) {
            Block b16 = new Block();
            b16.x = 370;
            b16.y = 115 + block * 115;
            b16.width = 60;
            b16.height = 10;
            b16.color = new Color(159, 114, 60);
            blocks.add(b16);
        }

        //barra 1
        for (int block = 0; block < 4; block++) {
            Block b17 = new Block();
            b17.x = 152;
            b17.y = 57 + block * 115;
            b17.width = 13;
            b17.height = 68;
            b17.color = new Color(159, 114, 60);
            blocks.add(b17);

            Block b18 = new Block();
            b18.x = 635;
            b18.y = 57 + block * 115;
            b18.width = 13;
            b18.height = 68;
            b18.color = new Color(159, 114, 60);
            blocks.add(b18);
        }

        //barra 2
        for (int block = 0; block < 4; block++) {
            Block b19 = new Block();
            b19.x = 304;
            b19.y = 0 + block * 115;
            b19.width = 13;
            b19.height = 68;
            b19.color = new Color(159, 114, 60);
            blocks.add(b19);

            Block b20 = new Block();
            b20.x = 483;
            b20.y = 0 + block * 115;
            b20.width = 13;
            b20.height = 68;
            b20.color = new Color(159, 114, 60);
            blocks.add(b20);
        }

        //barra 3
        for (int block = 0; block < 1; block++) {
            Block b21 = new Block();
            b21.x = 370;
            b21.y = 180 + block * 115;
            b21.width = 10;
            b21.height = 60;
            b21.color = new Color(159, 114, 60);
            blocks.add(b21);

            Block b22 = new Block();
            b22.x = 420;
            b22.y = 180 + block * 115;
            b22.width = 10;
            b22.height = 60;
            b22.color = new Color(159, 114, 60);
            blocks.add(b22);
        }
        /**
         * fim labirinto com for Aqui acaba o labirinto
         */
    }
    
        public void win() {

    }

            public void gameOver() {

    }
            
    private void base(Graphics g) {
        /**
         * Background Color
         */
        // fundo
        g.setColor(new Color(16, 43, 237));
        g.fillRect(0, 0, getWidth(), getHeight());
        /**
         * Fim Background Color
         */

        // barra preta
        g.setColor(Color.BLACK);
        g.fillRect(0, 480, getWidth(), getHeight());

        // barra verde
        g.setColor(new Color(57, 159, 0));
        g.fillRect(0, 490, getWidth(), 40);

        // vidas
        for (int i = 0; i < pac.live; i++) {
            g.fillRect(50 + i * 31, 535, 20, 20);
        }

        // pontos
        g.setFont(new Font("Retro Gaming", Font.TRUETYPE_FONT, 35));
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(this.pac.score), (getWidth() / 2) + 40, 523);        
    }            
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        //Base
        base(g);        

        // desenhar os blocos
        for (Block b : this.blocks) {
            b.draw(g);
        }

        for (Food fo : foods) {
            fo.draw(g);
        }

        // desenhar os boost
        for (Boost bo : this.boost) {
            bo.draw(g);
        }

        // desenhar ghosts
        for (Ghost f : this.ghosts) {
            f.draw(g);
        }
        
        // desenhar o pac
        pac.move();
        for(Block b: this.blocks){
            Collide d = pac.collide(b);
            if(d.c==true){
                pac.x = pac.x+d.dx;
                pac.y = pac.y+d.dy;
                break;
            }
        }
        pac.draw(g);

    }

        @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
