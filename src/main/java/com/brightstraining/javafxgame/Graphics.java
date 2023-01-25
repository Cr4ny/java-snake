package com.brightstraining.javafxgame;

import com.brightstraining.javafxgame.model.Model;
import com.brightstraining.javafxgame.model.Player;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Graphics {

    private Canvas canvas;

    // Model-coordinates are the same as screen coordinates.
    // For games with less granular coordinates (chess, game of life)
    // this should not be the case.
    public static final double SCALING = 1d;
    public static final double HEIGHT = Model.HEIGHT * SCALING;
    public static final double WIDTH = Model.WIDTH * SCALING;

    public Graphics(Canvas canvas) {
        this.canvas = canvas;
    }

    public void draw(Model model) {

        GraphicsContext context = canvas.getGraphicsContext2D();

        // draw sky
        context.setFill(Color.LIGHTBLUE);
        context.fillRect(0, 0, Graphics.WIDTH, Graphics.HEIGHT);

        // draw floor
        context.setFill(Color.GRAY);
        context.fillRect(0, Graphics.HEIGHT - 5, Graphics.WIDTH, Graphics.HEIGHT);

        // draw player
        Player player = model.getPlayer();
        context.setFill(Color.RED);
        context.fillOval(
                player.getX() - Player.WIDTH * SCALING / 2,
                player.getY() - Player.HEIGHT * SCALING / 2,
                Player.WIDTH,
                Player.HEIGHT
        );

    }
}