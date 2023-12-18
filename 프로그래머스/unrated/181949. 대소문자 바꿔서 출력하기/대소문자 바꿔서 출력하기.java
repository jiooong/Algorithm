import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String nstr = "";
        for(int i=0; i<str.length(); i++){
            char alp = str.charAt(i);
            if(Character.isUpperCase(alp)){
                nstr+=Character.toLowerCase(alp);
            }else{
                nstr+=Character.toUpperCase(alp);
            }           
        }
        System.out.print(nstr);
    }
}