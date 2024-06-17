/*public class return_value {
    public static double perc(int percentage, double num ){
        double res = num* percentage/100;
        return res;
    }
    public static void main(String[] args)
    {
        double x=perc(530, 67);
        System.out.println(x);

    }
    
}*/

public class return_value {
    public static boolean checks(int grade){
        if(grade >=70){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int a=54;
        if(checks(a)==true){
            System.out.println("Congrats!!");
        }else{
            System.out.println("Sorryy!!");

        }

    }
}
