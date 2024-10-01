package com.example.demo.controller;

import com.example.demo.entity.Foyer;
import com.example.demo.service.IFoyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FoyerController {
    private IFoyerService IfoyerService;

    @PostMapping("/addFoyer")
    public Foyer AddFoyer( @RequestBody Foyer foyer) {
        return  IfoyerService.addFoyer(foyer);
    }
    @PutMapping("/UpdateFoyer")
    public Foyer UpdateFoyer( @RequestBody Foyer foyer) {
        return IfoyerService.updateFoyer(foyer);
    }

    @GetMapping("/retiAllFoyer")
    public List<Foyer> retriAllFoyers() {
        return  IfoyerService.retrieFoyerAllFoyer();
    }
    @GetMapping("/retiFoyerById/{idF}")
    public Foyer retriFoyerById(@PathVariable Long idF) {
        return IfoyerService.retrieFoyerById(idF);
    }
    @DeleteMapping("/deleteFoyer/{idF}")
    public void  DeleteFoyer( @PathVariable Long idF) {
        IfoyerService.DeleteFoyer(idF); }
}
