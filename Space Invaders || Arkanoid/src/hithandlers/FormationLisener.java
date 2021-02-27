package hithandlers;

import gameobjects.AlienFormation;
/**
 * @author 204709224 207071192
 * @version 4.0
 * @since 2016-06-14
 */
public interface FormationLisener {
    /**
     * This method listens to an event when the formation
     * of aliens stops to move.
     * @param foration is the formation of aliens.
     */
    void formationStoppedMovigEvent(AlienFormation foration);
}
