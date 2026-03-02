import java.util.Scanner;
public class Menu
{
	Supermercado ref;
	Scanner scanner = new Scanner(System.in);
	public Menu(Supermercado ref)
	{
		this.ref = ref;
	}
	public void mostrarMenu()
	{
		int opcion;
		do
		{
			System.out.println("=== MENC SUPERMERCADO ===");
			System.out.println("1. Ingresar productos");
			System.out.println("2. Agregar productos a la lista de compra");
			System.out.println("3. Mostrar lista de compra");
			System.out.println("4. Borrar producto del inventario");
			System.out.println("5. Mostrar inventario de productos");
			System.out.println("0. Salir");
			System.out.print("Elija una opciC3n: ");
			opcion = scanner.nextInt();

			switch (opcion)
			{
			case 1 -> ref.ingresarDatos();
			case 2 ->
			{
				ref.agregarALista();
				ref.mostrarListaCompra();
			}
			case 3 -> ref.mostrarListaCompra();
			case 4 -> ref.borrarProducto();
			case 5 -> ref.mostrarInventario();
			case 0 -> System.out.println("Saliendo del sistema...");
				default -> System.out.println("OpciC3n invC!lida.");
			}
		} while (opcion != 0);
	}
}