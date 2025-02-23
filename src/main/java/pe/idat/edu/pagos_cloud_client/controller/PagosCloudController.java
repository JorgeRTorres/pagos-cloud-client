package pe.idat.edu.pagos_cloud_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagos")
public class PagosCloudController {

    @Value("${mensaje:Default mensaje}")
    private String mensaje;

    @GetMapping("/mensaje")
    public String mensajePpagos(){
        return mensaje;
    }

    @PostMapping("/realizar/{idPedido}")
    public String procesarPago(@PathVariable Long idPedido) {
        return "Pago realizado con éxito para el pedido: " + idPedido;
    }

}
