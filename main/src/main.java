import java.util.Scanner;

public class main {
    /**
     * Funcion que comprueba si el usuario está en la base de datos
     * @autor Lem
     * @param user Todos los usuarios
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
    public static int password (String[]contraseña, String validarcontraseña, int posicion){
        Scanner sc = new Scanner(System.in);
        validarcontraseña=sc.next();
        
    }
    static void main(String[] args) {
        String [] user = {"Viper_Strike","IronGhost_99","NeoHunter","Shadow_Ninja","TurboPanda","Pixel_Paladin"};
        String [] contraseña = {"Serpiente1","Fantasma99","Caza2026","Sombra00","OsoRapido","Escudo55"};
        int posicion = 0;
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
        System.out.println("Ingrese contraseña");
    }
}
