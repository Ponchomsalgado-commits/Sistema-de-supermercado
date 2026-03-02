import java.util.Scanner;

public class Supermercado 
{
  // --- Arreglos de productos ---
  String[] nombreProductoPieza = new String[15];
  int[] codigoPieza = new int[15];
  double[] precioPieza = new double[15];

  String[] nombreProductoPeso = new String[15];
  int[] codigoPeso = new int[15];
  double[] precioPeso = new double[15];

  // --- Lista de compra ---
  String[] listaNombres = new String[30];
  double[] listaPrecios = new double[30];
  double[] listaPesos = new double[30];
  int indiceLista = 0;

  int indicePieza = 0;
  int indicePeso = 0;

  Scanner scanner = new Scanner(System.in);

  // Crear objetos de las otras clases (pasando la referencia this)
  IngresarDatos ingreso = new IngresarDatos(this);
  AgregarALista agregar = new AgregarALista(this);
  BorrarProducto borrar = new BorrarProducto(this);
  MostrarListaCompra mostrar = new MostrarListaCompra(this);
  MostrarInventario inventario = new MostrarInventario(this);
  
  
  public void ingresarDatos() 
{
  ingreso.ingresarDatos();
 }

  public void agregarALista() 
{
  agregar.agregarALista();
 }

  public void borrarProducto() 
{
  borrar.borrarProducto();
 }

  public void mostrarListaCompra() 
{
  mostrar.mostrarListaCompra();
 }

  public void menu()
{
  Menu menu = new Menu(this);
  menu.mostrarMenu();
 }
 
  public void mostrarInventario() 
{
  inventario.mostrarInventario();
 }
 
  public static void main(String[] args)
{
    Supermercado tienda = new Supermercado();
  tienda.menu();
 }
 }
