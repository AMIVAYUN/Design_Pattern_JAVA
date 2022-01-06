public class RectangleTag extends ShapeTag{
    private String rectangleTag;
    public RectangleTag(String tag,String rectangleTag){
        super(tag);
        this.rectangleTag=rectangleTag;
    }
    @Override
    public String toString(){
        return "#"+ rectangleTag + " "+super.toString();
    }
    public String getRectangleTag(){
        return rectangleTag;
    }
}
