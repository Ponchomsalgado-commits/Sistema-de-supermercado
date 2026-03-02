import java.util.Scanner;

public class AgregarALista 
{
  Supermercado ref;
   Scanner scanner = new Scanner(System.in);

  // constructor que recibe el Supermercado
  public AgregarALista(Supermercado ref) 
{
  this.ref = ref;
 }

  // método sin parámetros
  public void agregarALista() 
{
  System.out.println("=== AGREGAR PRODUCTOS A LA LISTA DE COMPRA ===");

  System.out.print("Ingrese el código del producto: ");
  int codigo = scanner.nextInt();
  scanner.nextLine();

  // Buscar si el código existe en los productos por pieza
  for (int i = 0; i < ref.indicePieza; i++) 
{
  if (ref.codigoPieza[i] == codigo) 
{
  ref.listaNombres[ref.indiceLista] = ref.nombreProductoPieza[i];
  ref.listaPrecios[ref.indiceLista] = ref.precioPieza[i];
  ref.indiceLista++;
  System.out.println("Producto agregado a la lista de compra.");
  return;
 }
 }

  // Buscar en los productos por peso
  for (int i = 0; i < ref.indicePeso; i++) 
{
  if (ref.codigoPeso[i] == codigo) 
{
   System.out.print("Ingrese el peso: ");
  double peso = scanner.nextDouble();
  double precioTotal = ref.precioPeso[i] * peso;
  
  ref.listaNombres[ref.indiceLista] = ref.nombreProductoPeso[i];
  ref.listaPrecios[ref.indiceLista] = precioTotal;
  ref.listaPesos[ref.indiceLista] = peso;
  ref.indiceLista++;
  System.out.println("producto agregado a la lista de compra.");
  return;
 }
 }

  System.out.println("No se encontró el producto con ese código.");
 }
 }