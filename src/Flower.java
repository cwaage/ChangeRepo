public class Flower {

    String color;
    int num;
    boolean isRed;
    String mike;
    String suz;
    char c;
    int j;
    Flower neighbor;

    public Flower(String color, int num, int i){
        this.num = num;
        this.color = color;
        this.isRed = false;
        this.j = i;
        neighbor = new Flower("Purplish", 2, 2);
        c = 'c';
    }

    public String toString(){
        return "Flower | " + color + "," + num;
    }

}
