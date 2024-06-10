public class Flower {

    String color;
    int num;
    boolean isRed;
    String mike;
    String suz;
    int i;
    Flower neighbor;

    public Flower(String color, int num, int i){
        this.num = num;
        this.color = color;
        this.isRed = false;
        this.i = i;
        neighbor = new Flower("Green", 2, 2);
    }

    public String toString(){
        return "Flower | " + color + "," + num;
    }

}
