public class interfaces {
    public static void main(String[] args) {
        
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves() {
        System.out.println("U,D,L,R,Dg(all dirn)");
    }
}

class Rook implements Chessplayer{
    public void moves() {
        System.out.println("U,D,L,R");
    }
}

class King implements Chessplayer{
    public void moves() {
        System.out.println("U,D,L,R,Dg(each 1 step)");
    }
} 