package ejercicio5;

public class Operacion {
    public int i = 0;
    public void operacion(){

        while (true) {
            i++;
            if( i %2 ==0){
                System.out.println ("El numero : " + i + " es par");
            }else{
                System.out.println ("El numero : " + i + " es impar");
            }
            if (i==100) { break;}
        }
    }

}
