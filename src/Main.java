public class Main {
    public static void main(String[] args) {


        int numeroIf = -6;

        if (numeroIf >= 0){
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        System.out.println("....................");



        int numeroWhile = -5;
        while (numeroWhile <3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("....................");





        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }
        while (numeroDoWhile < 3);
        System.out.println("....................");




        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("....................");





        var estacion = "INVIERNO";

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("ES PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("ES VERANO");
                break;
            case "OTOÑO":
                System.out.println("ES OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO");
                break;
            default:
                System.out.println("NO ES UNA ESTACIÓN");
        }
    }
}
