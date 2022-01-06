public class Circle extends Shape{
    String CircleTag;
    public Circle(String CircleTag,int x,int y){
        super(x,y);
        this.CircleTag=CircleTag;
    }
    @Override
    public int CalcArea(){
        return (int)Math.pow(this.X,2)*3;
    }
}