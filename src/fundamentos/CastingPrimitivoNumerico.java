package fundamentos;

public class CastingPrimitivoNumerico {
    public static void main(String[] args) {
        double d = 1; //aqui eu coloquei um int em um double (casting implícito pois int cabe dentro de double)
        System.out.println(d);

        //aqui eu devo converter double para float (casting explícito)
        float f = 1.1234567891234F; //pode ser assim
        float g = (float) 1.234567891234; //ou assim
        double db = 1.234567891234; //suporta o dobro do float

        System.out.println(f);
        System.out.println(g);
        System.out.println(db); //aqui não "trunca" parte dos dados

        // O java só analisa TIPOS e não VALORES

        //(+)int - (+)256 = byte --> OU AINDA -->  (-)int + (+)256 = byte
        //127 -> +127 | 128 -> -128 | 129 -> -127 | 130 -> -126 | 256 -> 0 | -256 -> 0 | -130 -> +126 | -128 -> -128 | -129 -> +127
        int a = 128;
        byte b = (byte) a; //necessita de casting explícito
        System.out.println(a);
        System.out.println(b);
    }
}
