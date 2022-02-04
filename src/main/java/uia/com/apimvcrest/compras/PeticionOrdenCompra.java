package uia.com.apimvcrest.compras;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class PeticionOrdenCompra extends InfoComprasUIA
{
    @JsonCreator
    public PeticionOrdenCompra(@JsonProperty("id")int id, @JsonProperty("name")String name,
                               @JsonProperty("codigo")String codigo, @JsonProperty("unidad")String unidad,
                               @JsonProperty("cantidad")int cantidad)
    {
        super(id, name);
    }

    public PeticionOrdenCompra() {
        super(-1, "");
    }

    public void agregaItems(ListaReportesNivelStock miReporteNS)
    {
        PeticionOrdenCompra nodo;
        for(int i=0; i<miReporteNS.getItems().size(); i++)
        {
            InfoComprasUIA miNodo = miReporteNS.getItems().get(i);
            List<InfoComprasUIA> miLista;
            if(miNodo.getPedidoProveedor() > 0)
            {
                nodo = new PeticionOrdenCompra(miNodo.getId(), miNodo.getName(), miNodo.getDescripcion(),
                        "PZA", miNodo.getPedidoProveedor());
                if(this.getItems() == null)
                {
                    miLista = new ArrayList<InfoComprasUIA>();
                    this.setItems((List<InfoComprasUIA>) miLista);
                }
                this.getItems().add(nodo);
            }
            miNodo.print();
        }

    }
}
