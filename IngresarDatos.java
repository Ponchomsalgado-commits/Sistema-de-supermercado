import java.util.Scanner;
public class IngresarDatos
{
  Supermercado ref;

  public IngresarDatos(Supermercado ref) 
{
        this.ref = ref;
 }
  
  public void ingresarDatos() 
{

  Scanner scanner = new Scanner(System.in);
  System.out.println("=== INGRESO DE PRODUCTOS ===");

  for (int i = 0; i < 15; i++) 
{
  System.out.print("¿Desea ingresar un producto por (1) PIEZA o (2) PESO? (0 para salir): ");
  int tipo = scanner.nextInt();
  scanner.nextLine();
  

  if (tipo == 0) break;
  


  if (tipo == 1) 
{
if (ref.indicePieza >= 15) 
{
  System.out.println("Límite de productos por pieza alcanzado.");
  continue;
 }

  System.out.print("Código (100-199): ");
  int codigo = scanner.nextInt();
  if (codigo < 100 || codigo > 199) 
{
  System.out.println("Código inválido.");
  continue;
 }

  ref.codigoPieza[ref.indicePieza] = codigo;
  scanner.nextLine();
  System.out.print("Nombre del producto: ");
  ref.nombreProductoPieza[ref.indicePieza] = scanner.nextLine();

  System.out.print("Precio por pieza: ");
  ref.precioPieza[ref.indicePieza] = scanner.nextDouble();

  ref.indicePieza++;
  System.out.println("Producto agregado por pieza.");
 } 
  else if (tipo == 2) 
{
  if (ref.indicePeso >= 15) 
{
  System.out.println("Límite de productos por peso alcanzado.");
  continue;
 }

  System.out.print("Código (200-299): ");
  int codigo = scanner.nextInt();
  if (codigo < 200 || codigo > 299) 
{
  System.out.println("Código inválido.");
  continue;
 }

  ref.codigoPeso[ref.indicePeso] = codigo;
  scanner.nextLine();
  System.out.print("Nombre del producto: ");
  ref.nombreProductoPeso[ref.indicePeso] = scanner.nextLine();

  System.out.print("Precio por kilo: ");
  ref.precioPeso[ref.indicePeso] = scanner.nextDouble();

  ref.indicePeso++;
  System.out.println("Producto agregado por peso.");
 } 
  
  
  
  else
{
  
  System.out.println(" Opción inválida.");
  
 }
 }
 }
 } 