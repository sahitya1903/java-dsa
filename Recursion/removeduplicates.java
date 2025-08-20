public class removeduplicates {
    public static void duplicate(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            duplicate(str,idx+1,newstr,map);
        }
        else{
            map[curr-'a']=true;
            duplicate(str, idx+1, newstr.append(curr), map);
        }
    }
    public static void main(String[] args) {
        String str="apnacollege";
        boolean map[]=new boolean[26];
        duplicate(str, 0, new StringBuilder(""), map);
    }
    
}



