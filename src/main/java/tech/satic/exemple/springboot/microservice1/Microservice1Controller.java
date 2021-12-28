// Package
package tech.satic.exemple.springboot.microservice1;

// Librairie
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe control.
 * @version     1.0.0
 * @since       28/12/2021
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@RestController
@RequestMapping(path = "/api/v1")
public class Microservice1Controller {

    @Value("${tech.satic.demo.centralize.premiermicroservice.msg}")
    private String msg;

    @GetMapping(path = "/info")
    public String info() {
        return msg;
    }

}
