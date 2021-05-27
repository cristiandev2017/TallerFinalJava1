package ejercicio16;

public class Persona {
    //Variables
    private String nombre ="";
    private int edad = 0;
    private String DNI;
    private char  sexo = SEXO;
    private static final char SEXO = 'H';
    private String mensaje_peso = MENSAJE_PESO;
    private static final String MENSAJE_PESO = "";
    private double peso=0;
    private double altura=0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getMensaje_peso() {
        return mensaje_peso;
    }

    public void setMensaje_peso(String mensaje_peso) {
        this.mensaje_peso = mensaje_peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private int calcularIMC(){
        double resultado = 0;
        resultado = this.peso/(Math.pow(this.altura,2));
        if(resultado < 20){
            resultado = -1;
        }else if(resultado < 26){
            resultado = 0;
        }else{
            resultado = 1;
        }
        return (int) resultado;
    }

    public void mensajePeso(){
        int resultado_peso = calcularIMC();

      switch (resultado_peso){
          case 0:
              System.out.println("Esta por debajo del peso");
              break;
          case 1:
              System.out.println("Tiene sobre peso");
              break;
          default:
              System.out.println("Tiene el peso apropiado");
              break;
      }

    }

    private boolean esMayorDeEdad(){
        boolean valida;
        if(this.edad<18){
            valida=false;
        }else{
            valida=true;
        }
        return valida;
    }

    public void mensajeEdad(){
        boolean result_mayore = esMayorDeEdad();
        if(result_mayore == true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public void comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        }else{
            this.sexo = SEXO;
        }

    }

    public void generarDNI(){
        String letras[]= {"-T","-R","-W","-A","-G","-M","-Y","-F","-P","-D","-X","-B","-N","-J","-Z","-S","-Q","-V","-H","-L","-C","-K","-E"};
        String letraDNI = "";
        int operacion = (int)(Math.random()*99999999);
        for (int i = 0; i < letras.length ; i++) {
            if(operacion%23 == i){
                letraDNI = letras[i];
            }
        }
        String operacion_cast = operacion+"";
        this.DNI = operacion_cast + letraDNI;
        System.out.println(DNI);
    }

    @Override
    public String toString() {
        return "Persona \n" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI +  '\'' +
                ", sexo=" + sexo +
                ", mensaje_peso='" + mensaje_peso + '\'' +
                ", peso=" + peso +
                ", altura=" + altura
                ;
    }


}
