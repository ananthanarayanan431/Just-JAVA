package udemy.com;

public class TypeCasting {
    public static void main(String[] args){
        System.out.println("Conversation is automatic casting and casting is explicit");
        int a = 257;
        byte b = 120;
        b = (byte)a;
        System.out.println(b);

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

        System.out.println("Type promotion");
        byte c = 10;
        byte d = 30;

        int result = c*d;
        System.out.println(result);
        System.out.println("Working Successfully");
    }
}


