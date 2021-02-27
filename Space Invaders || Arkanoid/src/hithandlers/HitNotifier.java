package hithandlers;
/**
* @author 204709224 207071192
* @version 3.0
* @since 2016-05-29
* */
public interface HitNotifier {
    /**
     * This method Add hl as a listener to hit events.
     * @param hl is the listener to be added.
     */
    void addHitListener(HitListener hl);
    /**
     * This method Remove hl from the list of listeners to hit events.
     * @param hl is the listener to be removed.
     */
    void removeHitListener(HitListener hl);
 }