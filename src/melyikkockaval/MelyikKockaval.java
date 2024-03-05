
package melyikkockaval;


public class MelyikKockaval {

    public static void main(String[] args) {
        final int DOBAS_DB = 50;
        final int KOCKA_OLDAL = 6;
        int dobasok[][] = new int[KOCKA_OLDAL + 1][KOCKA_OLDAL + 1];

        
        for (int i = 0; i < DOBAS_DB; i++) {
            int dobas1 = (int)(Math.random()*KOCKA_OLDAL)+1;
            int dobas2 = (int)(Math.random()*KOCKA_OLDAL)+1;
            dobasok[dobas1][dobas2]++;
            
        }
        
        for (int i = 0; i <= KOCKA_OLDAL; i++) {
            for (int j = 0; j <= KOCKA_OLDAL; j++) {
                System.out.print(dobasok[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");


        System.out.println("");

        
        final int meret = 5;
        int tabla[][] = new int[meret + 1][meret + 1];
        
        for (int sor = 0; sor <= DOBAS_DB; sor++) {
            for (int oszl = 0; oszl <= meret; oszl++){
                tabla[sor][oszl] = sor * oszl;
            }
            
        }
        
        
        //megjelenites
        for (int i = 0; i <= meret ; i++) {
            for (int j = 0; j <= meret ; j++) {
                System.out.printf("%3d", tabla[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
