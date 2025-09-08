package com.raquel.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controlador para API rest
@RequestMapping //Colocar todas as nossas rotas no mesmo lugar
public class NinjaController {

    @GetMapping ("/boasVindas")//Pega informações, no caso, ta pegando essa mensagem de boas vindas, essa é a rota, colcoa / pra separar, se for colocar uma rota dentro de uma rota, colona / no final tambem
    public String welcome(){
        return "Seja bem-vindo a primeira rota desta API.";
    }



}
