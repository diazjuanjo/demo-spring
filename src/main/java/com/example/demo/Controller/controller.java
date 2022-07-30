package com.example.demo.Controller;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private IPersonaService personaService;

//    List<Persona> listaPersonas = new ArrayList();
//
//    @GetMapping("/hola/{nombre}")
//    public String decirHola(@PathVariable String nombre){
//        return "Hola mundo " + nombre;
//    }
//
//    @GetMapping("/chau")
//    public String decirChau(@RequestParam String nombre){
//        return "Chau mundo " + nombre;
//    }

    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona persona){
        personaService.crearPersona(persona);
    }

//    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return personaService.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        personaService.borrarPersona(id);
    }
}
