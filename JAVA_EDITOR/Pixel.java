import com.argetgames.arget2d.graphics.Renderer2D;
import com.argetgames.arget2d.input.Mouse;
import com.argetgames.arget2d.menu.Rectangle;

public class Pixel extends Rectangle{

	public int color;
	
	public Pixel(int color, int x, int y, int size) {
		super(x-size/2, y-size/2, size, size);
		this.color = color;
	}
	
	public void update(int color){
		
		if(containsPoint(Mouse.getMouseX(), Mouse.getMouseY())){
			if(Mouse.getMouse().isButtonPress(Mouse.MouseButton.LEFT)){
				this.color = color;
			}
		}
	}
	
	public void draw(Renderer2D renderer){
		super.draw(renderer, color);
		if(color == 0 || color == 0xFF000000)renderer.drawRect(x, y, width, height, 0xFFFFFFFF);
	}
	
	

}
