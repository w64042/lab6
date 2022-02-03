package Ex1;

interface Plywa {
    public void plyn();
}

public class Statek implements Plywa {

    public void plyn(){
        System.out.println ("Statek plywa");
    }
}