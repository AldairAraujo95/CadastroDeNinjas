package com.example.cadastro;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String BoasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

}
