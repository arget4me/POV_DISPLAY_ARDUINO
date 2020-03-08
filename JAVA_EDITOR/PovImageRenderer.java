
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.argetgames.arget2d.game.Gameloop;
import com.argetgames.arget2d.graphics.Image2D;
import com.argetgames.arget2d.input.Keyboard;

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

	private final int NUM_PIXELS = 90;
	private final String FILE_TYPE = "povimg";
//	final ColorPicker colorPicker = new ColorPicker();
	public static int color = 0xFF00FFFF;
	@Override
	public void updateGame() {
		ArrayList<Integer> palette = new ArrayList<Integer>();
		for (int i = 0; i < bands.length; i++) {
			bands[i].update(color);
			int[] data = bands[i].getPixelColors();
			for(int c = 0; c < data.length; c++)
			{
				if(!palette.contains(data[c]))
				{
					palette.add(data[c]);
				}
			}
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
				/*
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
				*/
				
				//Write palette
				{
					writer.write("uint32_t palette["+ palette.size() +"] = {");
					for(int i = 0; i < palette.size(); i++)
					{
						writer.write(palette.get(i) + ", ");
					}
					writer.write("};\n\n");
				}
				
				//Write data
				{
					int numBands = bands.length;
					writer.write("char bands" + "["+numBands+" * PIXEL_PER_BAND] = {");
					
					for(int x = 0; x < NUM_PIXELS; x++)
					{
						for(int y = 0; y < numBands; y++)
						{
							int[] data = bands[y].getPixelColors();
							//int r = ((data[x] & 0xFF0000) >> 16);
							//int g = ((data[x] & 0xFF00) >> 8);
							//int b = ((data[x] & 0xFF));
							//writer.write(r + ", " + g + ", "+ b + ", ");
							writer.write(palette.indexOf(data[x]) + ", ");
						}
					}
					
					
					writer.write("};\n\n");
				}
				
				writer.flush();
				writer.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		if (Keyboard.getKey(KeyEvent.VK_CONTROL) && Keyboard.getKey(KeyEvent.VK_O)) {
			// Save
			final JFileChooser fc = new JFileChooser(new File("output/"));
			fc.removeChoosableFileFilter(fc.getFileFilter());
			FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG", "png");
			fc.setFileFilter(filter);
			fc.showSaveDialog(null);
			File imageFile = fc.getSelectedFile();
			if (imageFile == null || !imageFile.getName().endsWith(".png")){
				System.out.println("NULL");
			}
			else{
				Image2D img = new Image2D(imageFile.getAbsolutePath(), false);
				int size = img.height;
				if(img.width < size)size = img.width;
				
				
				for(int i = 0; i < NUM_PIXELS; i++)
				{
					double angle = Math.PI * 2 * (double)i / (double)NUM_PIXELS + Math.PI;
					
					
					for(int j = 0; j < bands.length; j++)
					{
						int x = (int)(img.width/2 + Math.cos(angle) * j * (size/2 / bands.length));
						int y = (int)(img.height/2 + Math.sin(angle) * j * (size/2 / bands.length));
						
								
						bands[j].pixels[i].color = img.imagePixels[x + y * img.width];
					}
				}
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
