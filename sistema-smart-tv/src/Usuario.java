public class Usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("A tv esta ligada?" + smartTv.ligado);
        System.out.println("A tv esta em qual canal? " + smartTv.canal);
        System.out.println("A tv esta em qual volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> A tv esta ligada?" + smartTv.ligado);
    }
}
