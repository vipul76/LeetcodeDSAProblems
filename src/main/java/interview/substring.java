package interview;

public class substring {
    public static void main(String[] args) {
        String str= "vipul";

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }

        //System.out.println(str.substring(0,5));
        /*String[] substring = new String[5];
        StringBuffer sb = new StringBuffer();

        for (int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            substring[i]= String.valueOf(sb);

        }
        for (int i=0;i<substring.length;i++){
            System.out.println(substring[i]);
        }*/
    }
}
