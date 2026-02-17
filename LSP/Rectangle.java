package LSP;

import java.util.Objects;

public class Rectangle {

   protected Double height;

   protected Double width;

    public Rectangle(Double height , Double width){

        this.height = Objects.requireNonNull(height , "Height cannot be null.");
        this.width = Objects.requireNonNull(width , "Width cannot be null.");
    }

    Double area(){
        return height * width;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight(){
        return height;
    }

    public void setHeight(Double height){
        this.height = height;
    }

    public void setWidth(Double width){
        this.width = width;
    }

}



