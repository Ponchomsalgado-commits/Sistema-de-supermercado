import java.util.Scanner;

public class BorrarProducto 
{
  Supermercado ref;
  Scanner scanner = new Scanner(System.in);

  public BorrarProducto(Supermercado ref) 
{
  this.ref = ref;
 }

  public void borrarProducto() 
{
  System.out.print("Ingrese el código del producto a borrar: ");
  int codigo = scanner.nextInt();

  for (int i = 0; i < ref.indicePieza; i++) 
{
  if (ref.codigoPieza[i] == codigo) 
{
  ref.nombreProductoPieza[i] = null;
  ref.precioPieza[i] = 0;
  System.out.println("Producto borrado (por pieza).");
  return;
}
 }

  for (int i = 0; i < ref.indicePeso; i++) 
{
  if (ref.codigoPeso[i] == codigo) 
{
  ref.nombreProductoPeso[i] = null;
  ref.precioPeso[i] = 0;
  System.out.println("Producto borrado (por peso).");
  return;
 }
 }

  System.out.println("Producto no encontrado.");
 }
 } 