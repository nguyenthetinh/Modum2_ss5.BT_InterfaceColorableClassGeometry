import square.Square;

public class Test {
    public static void main(String[] args) {
        Square[] squares=new Square[3];
        squares[0]=new Square(3.4,"zed",true);
        squares[1]=new Square(3.4,"zed",true);
        squares[2]=new Square(3.4,"zed",true);

        squares[0].howtocolor();
        System.out.println(squares[0]);
        System.out.println("area="+squares[0].Area());

        squares[1].howtocolor();
        System.out.println(squares[1]);
        System.out.println("area="+squares[1].Area());

        squares[2].howtocolor();
        System.out.println(squares[2]);
        System.out.println("area="+squares[2].Area());
    }
}
