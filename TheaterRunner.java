import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    Intro begin = new Intro();
    SceneOne scene1 = new SceneOne();
    SceneTwo scene2 = new SceneTwo();
    SceneThree scene3 = new SceneThree();
    SceneFour scene4 = new SceneFour();
    SceneFive scene5 = new SceneFive();
    SceneSix scene6 = new SceneSix();
    SceneSeven scene7 = new SceneSeven();
    SceneEight scene8 = new SceneEight();
    SceneNine scene9 = new SceneNine();
    SceneTen scene10 = new SceneTen();
    SceneEleven scene11 = new SceneEleven();
    SceneTwelve scene12 = new SceneTwelve();
    SceneThirteen scene13 = new SceneThirteen();
    SceneFourteen scene14 = new SceneFourteen();
    SceneFifteen scene15 = new SceneFifteen();
    end e = new end();

   begin.intro();
    scene1.one(); 
    scene2.two(); 
    scene3.three();
    scene4.four();
    scene5.five();
    scene6.six();
    scene7.seven();
    scene8.eight();
    scene9.nine();
    scene10.ten();
    scene11.eleven();
    scene12.twelve();
    scene13.thirteen();
    scene14.fourteen();
    scene15.fifteen();
    e.ending();

    Theater.playScenes(begin, scene1, scene2, scene3, scene4, scene5, scene6, scene7, scene8, scene9, scene10, scene11, scene12, scene13, scene14, scene15, e); 
 
  }
}