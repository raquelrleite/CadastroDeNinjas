package com.raquel.cadastrodeninjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping
    public String missoes(){
        return "Sejam bem-vindos a sua primeira missão ninja!";
    }
}
