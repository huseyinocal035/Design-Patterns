package DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        Kunefe kunefe = new PlainKunefe();

        System.out.println(kunefe.getDescription());
        System.out.println("Total price : " + kunefe.getCost() + "\n");

        Kunefe kunefeWithIceCream = new MarasIceCream(new PlainKunefe());

        System.out.println(kunefeWithIceCream.getDescription());
        System.out.println("Total price : " + kunefeWithIceCream.getCost() + "\n");

        Kunefe kunefeWithPistachio = new Pistachio(new PlainKunefe());

        System.out.println(kunefeWithPistachio.getDescription());
        System.out.println("Total price : " + kunefeWithPistachio.getCost() + "\n");

        Kunefe kunefeWithAll = new MarasIceCream(new Pistachio(new PlainKunefe()));

        System.out.println(kunefeWithAll.getDescription());
        System.out.println("Total price : " + kunefeWithAll.getCost());

    }
}
