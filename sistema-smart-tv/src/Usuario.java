public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - > TV desligada? " + smartTv.ligada);

        smartTv.mudarCanal(15);
        System.out.println(smartTv.canal);


    }
}
