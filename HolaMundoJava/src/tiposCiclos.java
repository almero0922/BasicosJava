
public class tiposCiclos {
    public static void main(String args[]){
        //CICLO WHILE
       /* var contador = 0;
        while(contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }*/
       
       
        //CICLO DO WHILE
       
       /* var contador = 0; 
       do{
           System.out.println("contador = " + contador);
           contador++;
       }while(contador <3);
       */
       
       for(var contador = 0;contador<=3;contador++){
           if(contador % 2 != 0){
               continue;
           }
           System.out.println("contador = " + contador);
       }
       
       for(var contador = 0;contador<=3;contador++){
           if(contador % 2 == 0){
           System.out.println("contador = " + contador);
           break;
           }
       }
    }
}
       
    

