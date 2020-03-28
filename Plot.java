/**
 * 
 * @author maisha
 *
 */
public class Plot {
  private int x;
  private int y;
  private int width;
  private int depth;

  public Plot() {
    this.x = 0;
    this.y = 0;
    this.width = 1;
    this.depth = 1;
  }

  public Plot(Plot p) {
    this.x = p.x;
    this.y = p.y;
    this.width = p.width;
    this.depth = p.depth;
  }

  public Plot(int x, int y, int width, int depth) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.depth = depth;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }
    
  public int getDepth() {
    return depth;
  }
  
  public void setX(int x) {
    this.x = x;
  }
  
  public void setY(int y) {
    this.y = y;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setDepth(int depth) {
    this.depth = depth;
  }
  
  public boolean encompasses(Plot p) {
    boolean goodX = p.x >= x;
    boolean goodY = p.y >= y;
    boolean goodWidth = (p.x + p.width) <= (x + width);
    boolean goodDepth = (p.y + p.depth) <= (y + depth);
    
    return goodX && goodY && goodWidth && goodDepth;
  }
  
  public boolean overlaps(Plot p) {
    boolean aXY1 = (p.x >= x && p.x < (x + width)) &&  (p.y >= y && p.y < (y + depth));
    boolean aXY2 = (x >= p.x && x < (p.x + width)) &&  (y >= p.y && y < (p.y + p.depth));
    boolean bXY1 = (p.x + p.width) > x && (p.x + p.width) < (x + width) && p.y >= y && p.y <= (y + depth); 
    boolean bXY2 = (x + width) > p.x && (x + width) < (p.x + p.width) && y >= p.y && y <= (p.y + p.depth); 
    boolean cXY1 = (p.x >= x )&& p.x < (x +  width) && (p.y + p.depth) > y && (p.y + p.depth) <= (y + depth);
    boolean cXY2 = (x >= p.x )&& (x < (p.x +  p.width) )&& (y + depth) > p.y && (y + depth) <= (p.y + p.depth);
    boolean dXY1 = (p.x + p.width) > x && (p.x +p.width) <= (x + width) && (p.y + p.depth) > y && (p.y + p.depth) <= (y + depth);
    boolean dXY2 = (x + width) > p.x && (x + width) <= (p.x + p.width) && (y + depth) > p.y && (y + depth) <= (p.y + p.depth);
    
    return aXY1 || aXY2 || bXY1 || bXY2 || cXY1 || cXY2 || dXY1 || dXY2;
  }
  
  @Override
  public String toString() {
    return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
  }
}