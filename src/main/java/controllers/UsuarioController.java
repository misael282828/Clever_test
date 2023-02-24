package controllers;


import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// netstat -ano | findstr LISTENING | findstr 8080
// taskkill -PID 9600 -F
@RestController
public class UsuarioController {


    @RequestMapping(value = "api/usuario", method = RequestMethod.GET) //endpoint de la ruta
    public String getUsuario() {


        return "hola mundo";
    }


}


