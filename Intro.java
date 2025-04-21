import org.code.theater.*;
import org.code.media.*;

public class Intro extends Scene {
  
  public void intro() {
    clear("black");
    setTextHeight(30);
    setTextColor("white");
    drawText("Space Wars", 25, 140);
    pause(3.0);
  }
}
