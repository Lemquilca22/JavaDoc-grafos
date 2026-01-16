import java.util.Scanner;

public class main {
    /**
     * Funcion que comprueba si el usuario está en la base de datos
     * @autor Lem
     * @param user Todos los usuarios en base de datos(array)
     * @param nom El usuario que queremos buscar.
     * @return Devuelve la posicion del usuario, si no se encuentra devuelve -1
     */
    public static int usuario(String[] user, String nom){
        Scanner sc = new Scanner(System.in);
        nom=sc.next();
        for (int i = 0; i < user.length; i++) {
            if (nom.equalsIgnoreCase(user[i])){
                    return i;
            }
        }
        return -1;
    }
    /**
     * @param contraseña Todas las contraseñas en base de datos(array).
     * @param validar La contraseña que queremos comprobar.
     * @param posicion La posición de array del nombre usuario obtenido.
     * @return Si la contraseña es correcta devuelve 1 y si es incorrecta -1.
     */
    public static int password (String[]contraseña, String validar, int posicion){
        Scanner sc = new Scanner(System.in);
        validar=sc.next();
        if (validar.equals(contraseña[posicion])){
            return 1;
        }
        return -1;

    }
    static void main(String[] args) {
        String [] user = {"Viper_Strike","IronGhost_99","NeoHunter","Shadow_Ninja","TurboPanda","Pixel_Paladin"};
        String [] contraseña = {"Serpiente1","Fantasma99","Caza2026","Sombra00","OsoRapido","Escudo55"};
        int posicion = 0;
        int posicioncontraseña=0;
        String nom="";
        String validarcontraseña="";
        boolean ingresaUser=true;
        while(ingresaUser){
            System.out.println("Ingrese el nombre de usuario:");
            posicion=usuario(user, nom);
            if (posicion==-1){
                System.out.println("No se ha encontrado ese usuario en la base de datos");
            } else {
                ingresaUser=false;
            }
        }
        System.out.println("Usuario: "+user[posicion]);

        boolean ingresaPas=true;
        while(ingresaPas){
            System.out.println("Ingrese contraseña");
            posicioncontraseña=password(contraseña, validarcontraseña, posicion);
            if (posicioncontraseña==-1){
                System.out.println("Contraseña incorrecta, vuelva a intentarlo");
            } else {
                ingresaPas=false;
            }
        }
        System.out.println("Bienvenido a tu portal @"+user[posicion]);

    }
}
