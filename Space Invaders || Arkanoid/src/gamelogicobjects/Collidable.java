package gamelogicobjects;

import gameobjects.Ball;
import geometryprimitives.Point;
import geometryprimitives.Rectangle;

/**
 * @author 204709224 207071192
 * @version 3.0
 * @since 2016-05-29
 */
public interface Collidable {
    /**
     * This method Return the "collision shape" of the object.
     *
     * @return the collision shape of the object.
     */
    Rectangle getCollisionRectangle();

    /**
     * Notify the object that we collided with it at collisionPoint with // a
     * given velocity.
     * @param hitter
     *            The ball that hit the block.
     * @param collisionPoint
     *            is the collision point.
     * @param currentVelocity
     *            is the current velocity.
     * @return the hit point.
     */
    Velocity hit(Ball hitter, Point collisionPoint, Velocity currentVelocity);
}