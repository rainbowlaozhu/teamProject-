public class GadGet{
    private String name;
    private String function;
    private String shape;
    private int number;
    public GadGet(String name,String function,String shape,int number){
        this.name = name;
        this.function = function;
        this.shape = shape;
        this.number = number;

    }
    public String getName() {
        return name;
    }
    public String getFunction() {
        return function;
    }
    public String getShape() {
        return shape;
    }
    public int getNumber() {
        return number;
    }

 public String toString() {
        return "name: "+name+" function: "+function+" shape: "+shape+" number: "+number;
    }
}


