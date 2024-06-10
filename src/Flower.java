public class Flower {

    String color;
    int num;
    boolean isPerennial;

    public Flower(String color, int num){
        this.num = num;
        this.color = color;
        this.isPerennial = false;
        
    }

    public String toString(){
        return "Flower | " + color + "," + num;
    }

}
