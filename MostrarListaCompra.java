public class MostrarListaCompra 
{
    Supermercado ref;

    public MostrarListaCompra(Supermercado ref) 
{
        this.ref = ref;
    
    
}

    public void mostrarListaCompra() 
{
        System.out.println("=== LISTA DE COMPRA ===");
        if (ref.indiceLista == 0) {
            System.out.println("La lista está vacía.");
            return;
}

        double total = 0;
        for (int i = 0; i < ref.indiceLista; i++) 
{
  double peso = ref.listaPesos[i];
  if(peso == 0)
{
  System.out.println((i + 1) + ". " + ref.listaNombres[i] + " - $" + ref.listaPrecios[i]);
  total += ref.listaPrecios[i];
  
}
 else
{
  double precioKilo = ref.listaPrecios[i] / peso;

  System.out.println( (i + 1) + ". " +  ref.listaNombres[i] +  " * " + peso + "kg = $" + ref.listaPrecios[i]);
  total += ref.listaPrecios[i];
}
}



  System.out.println("---------------------------");
  System.out.println("Total: $" + total);
  
  }
}