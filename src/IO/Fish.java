package IO;

import java.io.*;

class Pet {
    protected transient String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Pet (){
        this.type = "Any";
    }

}


public class Fish extends Pet implements Serializable {

    {
        this.type = "Aquatic";
    }


    public Fish (){
        this.type = "Ornamental";
    }


    public static void main(String[] args) throws Exception {

        var f = new Fish();
        f.type = "Swimmer";
        FileOutputStream fos = new FileOutputStream("pet.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(f);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("pet.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Fish f2 = (Fish) ois.readObject();
        System.out.println(f2.getType());

    }
}
