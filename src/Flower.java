public class Flower {

    String color;
    int num;
    boolean isRed;
    String mike;
    String suz;
    int i;

    public Flower(String color, int num, int i){
        this.num = num;
        this.color = color;
        this.isRed = false;
        this.i = i;
    }

    public String toString(){
        return "Flower | " + color + "," + num;
    }

}
