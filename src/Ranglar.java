import java.util.ArrayList;

public class Ranglar {
    public static void main(String[] args) {
        ArrayList<String> ranglar = new ArrayList<>();
        ranglar.add("Qizil");
        ranglar.add("Yashil");
        ranglar.add("Ko'k");
        ranglar.add("Sariq");
        ranglar.add("Oq");
        ranglar.add("Qora");
        ranglar.add("Binafsha");
        // Birinchi elementni o'zgartirish
        ranglar.set(0, "Pushti");

        System.out.println("Ranglar to'plami: " + ranglar);
        // To'plamning o'lchamini ekranga chiqarish
         System.out.println("To'plamning o'lchami: " + ranglar.size());
    }
}
