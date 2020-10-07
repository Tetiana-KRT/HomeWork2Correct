package HomeWork1.Task7;

import jdk.jfr.Description;

@Description("•Design such Java class with name Computer and such properties as:" +
        "Brand, Screen size, Number of cores, Type (laptop,desktop,etc.)" +
        "•Make `Brand` and `Screen size` properties required in order to create an object(instance)." +
        "•Create two auxiliary object of Computer class.")
public class Task7 {
    public static void main(String[] args){
        Computer computer = new Computer("Samsung", "55cmX37cm");
        Computer laptop = new Computer("HP", "15 inches");
    }
}
