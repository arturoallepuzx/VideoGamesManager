public class Xbox extends Consola implements IConsola {
    @Override
    public void switchOn() {
        System.out.println("Encendiendo Consola");
    }

    @Override
    public void switchOff() {
        System.out.println("Apagando Consola");
    }

    @Override
    public void installGame() {
        System.out.println("Instalando Juego");
    }

    @Override
    public void playGame() {
    }

    @Override
    public String getPlataforma() {
        return "";
    }
}
