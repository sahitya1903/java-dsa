public class shortestpath {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        int x=0,y=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            if (str.charAt(i)=='E'){
                x++;
            }
            else if (str.charAt(i)=='W'){
                x--;
            }            
            else if (str.charAt(i)=='N'){
                y++;
            }            
            else if (str.charAt(i)=='S'){
                y--;
            }
        }
        double path=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Shortest Path is: "+path+" units.");
    }
}
