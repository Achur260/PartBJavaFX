package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;

public class JavaFXDemo extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Rectangle p1 = new Rectangle(50, 100, Color.RED);
		p1.setTranslateX(250);
		p1.setTranslateY(250);
		
		RotateTransition rt = new RotateTransition(Duration.seconds(2), p1);
		rt.setByAngle(135);
		rt.setCycleCount(2);
		rt.setAutoReverse(true);
		
		ScaleTransition st = new ScaleTransition(Duration.seconds(2), p1);
		st.setByX(1.61);
		st.setByY(3.14);
		st.setCycleCount(2);
		st.setAutoReverse(true);
		
		
		Pane p = new Pane();
		p.getChildren().add(p1);
		
		
		Scene sc = new Scene(p, 500, 500);
		arg0.setScene(sc);
		arg0.show();
		
		rt.play();
	    st.setDelay(Duration.seconds(4));
	    st.play();
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		launch(args);
		
		
	}

}
