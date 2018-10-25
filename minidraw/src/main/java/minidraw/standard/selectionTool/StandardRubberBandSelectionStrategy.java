package minidraw.standard.selectionTool;

import java.awt.Rectangle;
import java.util.Iterator;

import minidraw.framework.*;
import minidraw.framework.drawing.Drawing;
import minidraw.framework.drawing.RubberBandSelectionStrategy;
import minidraw.framework.figure.Figure;

/**
 * The standard RubberBandSelection strategy that simply selects all figures
 * within the rubber band rectangle.
 * 
 */

public class StandardRubberBandSelectionStrategy
    implements RubberBandSelectionStrategy {

  @Override
  public void selectGroup(Drawing model, Rectangle rubberBandRectangle,
      boolean toggle) {
    Iterator<Figure> i = model.iterator();
    while (i.hasNext()) {
      Figure figure = i.next();
      Rectangle r2 = figure.displayBox();
      if (rubberBandRectangle.contains(r2.x, r2.y)
          && rubberBandRectangle.contains(r2.x + r2.width, r2.y + r2.height)) {
        if (toggle) {
          model.toggleSelection(figure);
        } else {
          model.addToSelection(figure);
        }
      }
    }
  }
}
