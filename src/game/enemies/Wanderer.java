package game.enemies;

/**
 * Created by johan on 2017-04-10.
 */
public class Wanderer extends Enemy {

    public Wanderer() {
        super("/enemies/Pokemon.png", true); //If your sprite sheet has the animation for walking back put true in after the image.
        this.speed = 100;
        this.maxHealth = 100;
        this.gold = 25;
    }
}
