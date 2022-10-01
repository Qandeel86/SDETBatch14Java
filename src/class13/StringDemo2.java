package class13;
import utils.StringUtils;
public class StringDemo2 {
    public static void main(String[] args) {
        String str="Thor love and thunder";
        //this is better way to call method by importing from StringUtils class
        StringUtils strUtils=new StringUtils();

        strUtils.printAllIndexes(str,'e');
        //for(int i=0;i<str.length();i++) {

        //if(str.charAt(i)=='o') {
        //System.out.println(i);//will print the index of all the o's in string
        //	}
        //}
    }

}
