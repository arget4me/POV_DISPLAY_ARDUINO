

import javax.swing.JFrame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static PovImageRenderer game;
	public static JFrame frame;
	
	public static void main(String[] args) {
	    	frame = new JFrame("POV Image Renderer");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			game = new PovImageRenderer(1000, 700, 1);
			frame.add(game);
			frame.pack();
			frame.setResizable(false);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        
	        launch(args);
			
	}

	@Override
	public void start(Stage stage) throws Exception {
		final ColorPicker colorPicker = new ColorPicker();
		// Sets color-chooser button interface similar SplitMenuButton
		colorPicker.getStyleClass().add("split-button");
		 
		// Sets color-chooser button interface similar MenuButton
		colorPicker.getStyleClass().add("button");
		
		colorPicker.setValue(Color.RED);
		Color c = colorPicker.getValue();
		PovImageRenderer.color = ((int)(c.getOpacity() * 255) << 24) | ((int)(c.getRed() * 255) << 16) | ((int)(c.getGreen() * 255) << 8) | (int)(c.getBlue() * 255);
	
		
		colorPicker.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Handle!!");
            	Color c = colorPicker.getValue();
    			PovImageRenderer.color = ((int)(c.getOpacity() * 255) << 24) | ((int)(c.getRed() * 255) << 16) | ((int)(c.getGreen() * 255) << 8) | (int)(c.getBlue() * 255);
    		
            }
        });
		 FlowPane root = new FlowPane();
	        root.setPadding(new Insets(10));
	        root.setHgap(10);
	        root.getChildren().addAll(colorPicker);
		Scene scene = new Scene(root, 200, 50);
		 
		stage.setTitle("JavaFX ColorPicker (o7planning.org)");
 
        stage.setScene(scene);
		stage.show();
		game.Start();
	}

}

