public class Flower {

    String color;
    int num;
    boolean isRed;
    String mike;

    public Flower(String color, int num){
        this.num = num;
        this.color = color;
        this.isRed = false;
    }

    public String toString(){
        return "Flower | " + color + "," + num;
    }

}
