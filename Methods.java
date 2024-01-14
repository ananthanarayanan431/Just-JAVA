package udemy.com;


public class Methods {
    public static void main(String args[]){
        Computer obj = new Computer();
        obj.PlayMusic();
        System.out.println(obj.GetMePen(20));
    }
}

class Computer {
    public void PlayMusic(){
        System.out.println("Playing Music");
    }

    public String GetMePen(int cost){
        if (cost>=10){
            return "Pen";
        }
        return "Nothing";
    }
}
