package hithandlers;

import gameobjects.AbstractBlock;
import gameobjects.Ball;

/**
* @author 204709224 207071192
* @version 3.0
* @since 2016-05-29
* */
public  interface HitListener {
    /** This method is called whenever the beingHit object is hit.
     * The hitter parameter is the Ball that's doing the hitting.
     * @param beingHit the block that is being hit.
     * @param hitter is the which is the hitter.
     */
    void hitEvent(AbstractBlock beingHit, Ball hitter);
 }