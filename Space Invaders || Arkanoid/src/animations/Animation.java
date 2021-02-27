package animations;

import biuoop.DrawSurface;

/**
 * @author 204709224 207071192
 * @version 3.0
 * @since 2016-05-29
 */
public interface Animation {
    /**
     * This function draws one frame.
     *
     * @param d
     *            is the draw surface.
     */
    void doOneFrame(DrawSurface d);

    /**
     * This method tells if the frame should be continued or stopped.
     *
     * @return boolean true or false.
     */
    boolean shouldStop();

    /**
     * This function restarts the animation.
     */
    void restartAnimation();
}