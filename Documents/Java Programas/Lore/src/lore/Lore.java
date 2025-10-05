
package lore;

import java.util.Scanner;

// @author Andrey

public class Lore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eleccion;
        
        System.out.println("=== LA RANA Y EL CHIHUAHUA ===");
        System.out.println("Había una vez una pequeña rana llamada Rani y un chihuahua llamado Chispa.");
        System.out.println("Un día, se encontraron en el bosque y tuvieron que decidir qué hacer.");
        System.out.println("\n¿Qué deberían hacer?");
        System.out.println("1.- Explorar el bosque juntos.");
        System.out.println("2.- Quedarse en sus casas.");
        System.out.print("Elige 1 o 2: ");
        eleccion = sc.nextInt();
        
        if(eleccion == 1) {
            System.out.println("\nRani y Chispa decidieron explorar el bosque.");
            System.out.println("Mientras caminaban, encontraron un río que debían cruzar.");
            System.out.println("¿Cómo cruzarán?");
            System.out.println("1.- Rani saltará sobre las piedras y Chispa nadará.");
            System.out.println("2.- Buscar un puente cercano.");
            System.out.print("Elige 1 o 2: ");
            eleccion = sc.nextInt();
            
            if(eleccion == 1) {
                System.out.println("\n¡Aventura riesgosa! Rani saltó ágilmente y Chispa chapoteó con cuidado.");
                System.out.println("Llegaron al otro lado sanos y felices, y encontraron un campo lleno de flores.");
                System.out.println("Fin de la historia: Rani y Chispa se hicieron grandes amigos.");
            } else {
                System.out.println("\nBuscaron un puente y encontraron un viejo tronco que les sirvió para cruzar.");
                System.out.println("Mientras cruzaban, Chispa tropezó, pero Rani lo ayudó a levantarse.");
                System.out.println("Fin de la historia: aprendieron a cuidarse mutuamente y se hicieron inseparables.");
            }
            
        } else {
            System.out.println("\nRani y Chispa decidieron quedarse en casa.");
            System.out.println("Pasaron el día descansando y compartiendo bocadillos.");
            System.out.println("Fin de la historia: aunque no hubo aventura, su amistad se fortaleció con risas y juegos.");
        }
        
        sc.close();

    }
    
}
