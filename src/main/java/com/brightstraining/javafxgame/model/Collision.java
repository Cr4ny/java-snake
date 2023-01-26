package com.brightstraining.javafxgame.model;

public class Collision {

    public static boolean collidesWithPlayer(Player player, Food food){
        //Colliding when distance between center less than sum of both radius
        return distance(food.getX(),food.getY(),player.getX(),player.getY()) < Food.WIDTH/2 + Player.WIDTH/2;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);

        return Math.hypot(ac, cb);
    }
}