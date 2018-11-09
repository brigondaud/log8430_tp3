package demo.visual;

import javax.swing.JTextField;

import minidraw.drawing.Drawing;
import minidraw.drawing.StandardDrawing;
import minidraw.drawingeditor.DrawingEditor;
import minidraw.drawingeditor.DrawingView;
import minidraw.drawingeditor.Factory;
import minidraw.drawingeditor.StdViewWithBackground;


/**
 * A factory just for testing purposes. Defines a chess board background. 

 */
class ChessBackgroundFactory implements Factory {
  @Override
  public DrawingView createDrawingView(DrawingEditor editor) {
    DrawingView view = new StdViewWithBackground(editor, "chessboard");
    return view;
  }

  @Override
  public Drawing createDrawing(DrawingEditor editor) {
    return new StandardDrawing();
  }

  @Override
  public JTextField createStatusField(DrawingEditor editor) {
    return null;
  }
}
