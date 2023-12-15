package annotations;

interface  House {
    @Deprecated
    void open();

    void openFrontDoor();
    void openBackDoor();
}

public class MyHouse implements House {
    public static void main(String[] args) {

        MyHouse myHouse = new MyHouse();
        myHouse.open();
        myHouse.openFrontDoor();
        myHouse.openBackDoor();


    }

    @Override
    public void open() {

    }

    @Override
    public void openFrontDoor() {

    }

    @Override
    public void openBackDoor() {

    }
}

