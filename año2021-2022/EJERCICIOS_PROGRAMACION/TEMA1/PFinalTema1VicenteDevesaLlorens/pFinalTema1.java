public class pFinalTema1{
    public static void main(String args []){
        System.out.println("Primeros 25 enteros:");
        int x = 1;
        System.out.print(x+",");
            while (x<=24){
            System.out.print(","+(x+1));
            x=x+1;            }
            System.out.println(" ");
            System.out.println("-----------------------------");
    
        System.out.println("Los primeros pares hasta el 50:");
        int y = 1;
        while (y<=50){
        if (y%2==0){
            System.out.print(y);
            if (y<50){
            System.out.print(",");
                     }
                   }
        y = y+1;
        }
        System.out.println(" ");
        System.out.println("-----------------------------");
        System.out.println("Los primeros impares hasta el 49:");
        int z = 1;
        while (z<=49){
        if ((z%2)!=0){
            System.out.print(z);
            if (z<49){
            System.out.print(",");
                     }
                   }
        z = z+1;
        }
        
        System.out.println(" ");
        System.out.println("-----------------------------");
        System.out.println("TABLAS DE MULTIPLICAR");
        System.out.println("----------------------");
          int tabla = 1;
          int num1 = 1;
          int num2 = 1;
          
        while (num1<11){System.out.println("tabla del nº "+num1+ ":");
        while (num2<11){
            System.out.println(num1+"*"+num2+"="+(num1*num2));
            num2=num2+1;
            }
            num1 =num1+1;
            System.out.println("----------");
            num2 = 1;}
        }
    }
    
            
