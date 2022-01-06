import groovy.console.ui.SystemOutputInterceptor;

import java.util.ArrayList;

public class ShapeTag {
    private String tag;
    public ShapeTag(String tag){
        this.tag=tag;
    }
    @Override
    public String toString(){
        return "#"+tag;
    }


}
