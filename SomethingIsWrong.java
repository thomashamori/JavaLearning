public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(40,50);
        //myRect.width = 40;
        //myRect.height = 50;
        System.out.println("myRect's area is " + myRect.getArea());
    }
}