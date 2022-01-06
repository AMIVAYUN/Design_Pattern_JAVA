public class Rectangle extends Shape{
    String RectangleTag;
    public Rectangle(String RectangleTag,int x,int y){
        super(x,y);
        this.RectangleTag=RectangleTag;
    }
    @Override
    public int CalcArea(){
        return this.X*this.Y/2;
    }
}
