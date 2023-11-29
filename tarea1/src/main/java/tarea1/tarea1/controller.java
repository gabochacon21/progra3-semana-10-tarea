package tarea1.tarea1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    
  @GetMapping("/tarea1")
    public String index() {
        return "index"; // Devuelve el nombre de la vista HTML
    }

}
