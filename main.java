import java.util.Scanner;


class Main {  
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {
     
    System.out.println ("*********** Menú ***************");
    System.out.println ("***    1. Aritmética         ***");
    System.out.println ("***    2. Estadística        ***");
    System.out.println ("***    3. Matrices           ***");
    System.out.println ("***    4. Ecuaciones         ***");
    System.out.println ("***    5. Avanzadas          ***");
    System.out.println ("***    6. Salir              ***"); 
    System.out.println ("********************************");
    
    System.out.println ("Digite su opción");
        int opcion1=sc.nextInt();
  
    switch(opcion1)
      {
        case 1: 
    System.out.println ("********************************");
    System.out.println ("***    7. Suma               ***");
    System.out.println ("***    8. Resta              ***");
    System.out.println ("***    9. Multiplicación     ***");
    System.out.println ("***    10. División          ***");
    System.out.println ("***    11. Potencia          ***");
    System.out.println ("***    12. Atrás             ***"); 
    System.out.println ("********************************");
          int opcion2=sc.nextInt();
          switch (opcion2){
            case 7:
              suma();
              break;
            case 8:
              resta();
              break;
            case 9: 
               mult();
              break;
            case 10:
              divi();
              break;
            case 11:
                pt();
              break;
            default: 
              System.out.println ("Número desconocido");
              break; 
          }
        case 2: 
    System.out.println ("*************************************");
    System.out.println ("***    13. Números Aleatorios     ***");
    System.out.println ("***    14. Media                  ***");
    System.out.println ("***    15. Extremos               ***");
    System.out.println ("***    18. Atrás                  ***"); 
    System.out.println ("*************************************");
          break;

          case 3: 
    System.out.println ("*************************************");
    System.out.println ("***    19. Suma                   ***");
    System.out.println ("***    20. Resta                  ***");
    System.out.println ("***    21. Multiplicación         ***");
    System.out.println ("***    22. Atrás                  ***"); 
    System.out.println ("*************************************");
          break;

          case 4: 
    System.out.println ("*****************************************");
    System.out.println ("***    23. Sistema de ecuaciones 2*2  ***");
    System.out.println ("*****************************************");
          break;

           case 5: 
    System.out.println ("*************************************");
    System.out.println ("***    19. Factorial              ***");
    System.out.println ("***    20. Absoluto               ***");
    System.out.println ("***    22. Atrás                  ***"); 
    System.out.println ("*************************************");
          break;
          
         }
          
      }
    
 

      static void  suma() {
           
            System.out.println ("Opeación Suma");
            System.out.println ("Digite numero  1");
            int numero1=sc.nextInt(); 
            System.out.println ("Digite numero 2");
            int numero2=sc.nextInt(); 
            int resultado= numero1+numero2;
            System.out.println ("El resultado es: "+resultado);
  
        }

      static void  resta() {
           
            System.out.println ("Opeación Resta");
            System.out.println ("Digite numero 1");
            int numero1=sc.nextInt(); 
            System.out.println ("Digite numero 2");
            int numero2=sc.nextInt();   
            int resultado= numero1-numero2;
            System.out.println ("El resultado es: "+resultado);
        }

  static void  mult() {
           
            System.out.println ("Opeación Multiplicación");
            System.out.println ("Digite numero 1");
            int numero1=sc.nextInt(); 
            System.out.println ("Digite numero 2");
            int numero2=sc.nextInt();   
            int resultado= numero1*numero2;
            System.out.println ("El resultado es: "+resultado);
        }

  static void  divi() {
           
            System.out.println ("Opeación División");
            System.out.println ("Digite numero 1");
            int numero1=sc.nextInt(); 
            System.out.println ("Digite numero 2");
            int numero2=sc.nextInt();   
            int resultado= numero1/numero2;
            System.out.println ("El resultado es: "+resultado);  
        }
  static void  pt() {
           
            System.out.println ("Opeación Potencia");
            System.out.println ("Digite numero 1");
            int numero1=sc.nextInt(); 
            System.out.println ("Digite numero 2");
            int numero2=sc.nextInt();   
    System.out.println ("El resultado es: " + Math.pow(numero1,numero2 ));
        }
  }
  
