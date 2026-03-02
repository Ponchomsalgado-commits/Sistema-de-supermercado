public class Main {
    public static void main(String[] args) {
        Supermercado tienda = new Supermercado();
        Menu menu = new Menu(tienda);             
        menu.mostrarMenu();                       
    }
}