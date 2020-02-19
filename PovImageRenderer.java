
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.argetgames.arget2d.game.Gameloop;
import com.argetgames.arget2d.input.Keyboard;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class PovImageRenderer extends Gameloop {
	boolean mousePress = false;
	Band[] bands = new Band[10];

	public PovImageRenderer(int width, int height, int scale) {
		super(width, height, scale, false);
		debug_log = false;
		loadContent();
	}

	JFrame f = new JFrame();
	
	private void loadContent() {
		int centerX = WIDTH / 2;
		int centerY = HEIGHT / 2;

		for (int i = 0; i < bands.length; i++) {
			bands[i] = new Band(centerX, centerY, (i + 1) * 30, NUM_PIXELS);
		}
		
		

	}

	private final int NUM_PIXELS = 58;
	private final String FILE_TYPE = "povimg";
//	final ColorPicker colorPicker = new ColorPicker();
	public static int color = 0xFF00FFFF;
	@Override
	public void updateGame() {
		
		for (int i = 0; i < bands.length; i++) {
			bands[i].update(color);
		}
		if (Keyboard.getKey(KeyEvent.VK_CONTROL) && Keyboard.getKey(KeyEvent.VK_S)) {
			// Save
			final JFileChooser fc = new JFileChooser(new File("output/"));
			fc.removeChoosableFileFilter(fc.getFileFilter());
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Pov Image", FILE_TYPE);
			fc.setFileFilter(filter);
			fc.showSaveDialog(null);
			File saveFile = fc.getSelectedFile();
			if (saveFile != null && !saveFile.getName().endsWith("." + FILE_TYPE))
				saveFile = new File(saveFile.getPath() + "." + FILE_TYPE);

			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(saveFile));
				writer.write("#define PIXEL_PER_BAND " + NUM_PIXELS + "\n\n");
				
				for (int i = 0; i < bands.length; i++) {
					
					writer.write("char band_" + i + "[PIXEL_PER_BAND * 3] = {");
					int[] data = bands[i].getPixelColors();
					for (int x = 0; x < data.length; x++) {
						int r = ((data[x] & 0xFF0000) >> 16);
						int g = ((data[x] & 0xFF00) >> 8);
						int b = ((data[x] & 0xFF));
						writer.write(r + ", " + g + ", "+ b + ", ");
					}

					writer.write("};\n");
				}
				writer.flush();
				writer.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	@Override
	public void draw() {
		renderer.useAlpha(false);
		renderer.useColorMask(false);
		for (int i = 0; i < bands.length; i++) {
			bands[i].draw(renderer);
		}
	}

}
