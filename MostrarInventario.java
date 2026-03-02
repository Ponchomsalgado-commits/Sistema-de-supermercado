public class MostrarInventario
{
  Supermercado ref;

  public MostrarInventario(Supermercado ref) 
{
  this.ref = ref;
  

 }

  public void mostrarInventario()
{
  System.out.println("=====================================");
  System.out.println("        INVENTARIO DE PRODUCTOS       ");
  System.out.println("=====================================\n");

  // -------- TABLA PARA PRODUCTOS POR PIEZA --------
  System.out.println("----- PRODUCTOS POR PIEZA -----");

  if (ref.indicePieza == 0) 
{
  System.out.println("No hay productos por pieza");
 } else 
{
  System.out.printf("%-10s %-20s %-10s\n", "CÓDIGO", "NOMBRE", "PRECIO");
  System.out.println("-----------------------------------------------");

  for (int i = 0; i < ref.indicePieza; i++) 
{
  if (ref.nombreProductoPieza[i] != null) 
{
  System.out.printf("%-10d %-20s $%-10.2f\n",
  ref.codigoPieza[i],
  ref.nombreProductoPieza[i],
  ref.precioPieza[i]);
 }
 }
  System.out.println();
 }

  // -------- TABLA PARA PRODUCTOS POR PESO --------
  System.out.println("----- PRODUCTOS POR PESO (KG) -----");

  if (ref.indicePeso == 0) 
{
  System.out.println("No hay productos por peso");
 } 
 else 
{
  System.out.printf("CÓDIGO", "NOMBRE", "PRECIO/KG");
  System.out.println("-----------------------------------------------");

  for (int i = 0; i < ref.indicePeso; i++) 
{
  if (ref.nombreProductoPeso[i] != null) 
{
  System.out.printf("%-10d %-20s $%-10.2f\n",
  ref.codigoPeso[i],
  ref.nombreProductoPeso[i],
  ref.precioPeso[i]);
}
 }
  System.out.println();
 }

  System.out.println("=====================================");
 }
 }