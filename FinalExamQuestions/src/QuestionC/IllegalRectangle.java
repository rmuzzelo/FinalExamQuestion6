package QuestionC;

public class IllegalRectangle extends Exception {
	
	private int newx;
	private int newy;
	
	public IllegalRectangle(int newx, int newy)
	   {
	      this.newx = newx;
	      this.newy = newy;
	   } 
	   public int getX()
	   {
	      return newx;
	   }
	   public int getY()
	   {
	      return newy;
	   }
}
