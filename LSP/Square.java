package LSP;

public class Square extends Rectangle{

    protected Double side;

    public Square(Double side) {
        super(side, side);
    }

    @Override
    public void setHeight(Double side){
        height = width = side;
    }

    @Override
    public void setWidth(Double side){
        height = width = side;
    }

}
