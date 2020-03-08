import com.argetgames.arget2d.graphics.Renderer2D;

public class Band {

	int radius;
	Pixel[] pixels;
	int numPixels;
	int centerX, centerY;
	
	public Band(int centerX, int centerY, int radius, int numPixels) {
		this.radius = radius;
		this.numPixels = numPixels;
		pixels = new Pixel[numPixels];
		this.centerX = centerX;
		this.centerY = centerY;
		
		double delta = 2.0 * Math.PI;
		delta /= numPixels;
		
		for(int i = 0; i < numPixels; i++){
			pixels[i] = new Pixel(0x0, (int)(centerX + Math.cos(delta*i + Math.PI)*radius), (int)(centerY + Math.sin(delta*i + Math.PI)*radius), 5);
		}
		pixels[0].color = 0xFFFF00FF;
		pixels[numPixels/2].color = 0xFFFFFF00;
		pixels[numPixels-1].color = 0xFF00FFFF;
		
		
	}
	
	public void update(int color){
		for(int i = 0; i < numPixels; i++){
			pixels[i].update(color);
		}
	}
	
	public int[] getPixelColors(){
		int[] pixelColors = new int[pixels.length];
		for(int i = 0; i < pixels.length; i++){
			pixelColors[i] = pixels[i].color;
		}
		
		return pixelColors;
	}
	
	public void draw(Renderer2D renderer){
		for(int i = 0; i < numPixels; i++){
			pixels[i].draw(renderer);
		}
	}

}
