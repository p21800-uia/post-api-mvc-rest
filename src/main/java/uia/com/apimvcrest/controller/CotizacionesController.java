package uia.com.apimvcrest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.servicio.CotizacionServicio;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class CotizacionesController
{
    private CotizacionServicio servicioCotizaciones = new CotizacionServicio();

    public CotizacionesController() throws IOException {
    }

    @GetMapping("/cotizaciones")
    public ArrayList<CotizacionModelo> cotizaciones()
    {
        return servicioCotizaciones.getCotizaciones();
    }

    @GetMapping("/cotizacion/{id}")
    public ResponseEntity<CotizacionModelo> cotizacionById(@PathVariable int id)
    {
        return (ResponseEntity<CotizacionModelo>) servicioCotizaciones.getCotizacion(id);
    }

}
