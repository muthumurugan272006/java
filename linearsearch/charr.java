// to find the character is presented in java
package linearsearch;
public class charr {
    public static void main(String[] args) {
        String name = "Muthu";
        char tar = 't';
        boolean ans = find(name, tar);
        System.out.println(ans);
    }
    static boolean find(String name,char tar){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i=i+1){
            if(tar==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
}
