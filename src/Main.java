public class Main {
    public static void main(String[] args)
    {
        condicional_if(5);
        int numero = bucle_while(0);
        bucle_do_while(numero);
        bucle_for();
        switch_func(1);
    }
    public static void condicional_if(int numeroIf){
        if (numeroIf<0)
        {
            System.out.println("numeroIf es negativo");
        }
        if (numeroIf>0)
        {
            System.out.println("numeroIf es positivo");
        }
    }
    public static int bucle_while(int numeroWhile)
    {
        while (numeroWhile<3){
            System.out.println("valor numeroWhile: "+numeroWhile);
            numeroWhile++;
        }
        return numeroWhile;
    }
    public static void  bucle_do_while(int numeroDoWhile)
    {
        do{
            System.out.println("valor numeroDoWhile: "+numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile<3);
    }
    public static void  bucle_for()
    {
        for (int i=0; i<=3; i++){
            System.out.println("valor numeroFor: "+i);
        }
    }
    public static void  switch_func(int estacion)
    {
        switch (estacion)
        {
            case 1:
                System.out.println("invierno");
                break;
            case 2:
                System.out.println("verano");
                break;
            case 3:
                System.out.println("primavera");
                break;
            case 4:
                System.out.println("otoño");
                break;
            default:
                System.out.println("No es una estacion");
                break;

        }
    }
}