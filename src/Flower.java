public class Flower {

    String color;
    int num;

    public Flower(String color, int num){
        this.num = num;
        this.color = color;
    }

    public String toString(){
        return "Flower | " + color + "," + num;
    }

}
