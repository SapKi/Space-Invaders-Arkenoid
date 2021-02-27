package hithandlers;
/**
 * @author 204709224 207071192
 * @version 4.0
 * @since 2016-06-14
 */
public interface FormationNotifier {
    /**
     * This method Remove fl from the list of listeners to the formation's
     * messages.
     * @param fl is the listener to be removed.
     */
    void addFormationLisener(FormationLisener fl);
    /**
     * This method Remove fl from the list of listeners to the formation's
     * messages.
     * @param fl is the listener to be removed.
     */
    void removeFormationLisener(FormationLisener fl);
}
