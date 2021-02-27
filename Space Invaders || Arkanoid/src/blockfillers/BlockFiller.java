package blockfillers;

import biuoop.DrawSurface;
import geometryprimitives.Rectangle;

/**
 * @author 204709224 207071192
 * @version 4.0
 * @since 2016-06-14
 */
public interface BlockFiller {

    /**
     * This method draws on the screen the fulling of rectangle.
     *
     * @param surface
     *            is the surface that the the whole frame will be showed on.
     * @param rect
     *            is the rectangle to be fulled and showed.
     */
    void drawOn(DrawSurface surface, Rectangle rect);
}