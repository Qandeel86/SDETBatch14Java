package class13;

public class StringDemo3 {
    public static void main(String[] args) {
        String str="szfksKAFBDAJKF11493!@#%$%$*$";
        System.out.println(str.replaceAll("[0-9]","@"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[0-z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[^A-Z]",""));//^is the NOT symbol
        System.out.println(str.replaceAll("[^a-zA-Z]",""));//can put 2 ranges together
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));//more than 2 ranges together
    }
}
