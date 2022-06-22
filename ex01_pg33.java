package ex01_pg33;
public class ex01_pg33 {
    public static void main(String[] args) {

        long par=1;
        Integer somaimpar=0;
        Integer n1;
        for(n1=0; n1 <= 30;n1++){
        if (n1 % 2 ==1){ 
            somaimpar+=n1;
        }else{    
            if (n1>0)
            par*=n1;   
    }
}
System.out.println("soma dos impares: " + somaimpar);

System.out.println("multiplicação dos pares: " + par);
}
}
 