package EngProjeto.farmacia.controller;

import EngProjeto.farmacia.model.Receita;
import EngProjeto.farmacia.repository.ReceitaRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;
    @GetMapping("/receitas")
    public List<Receita> getAllReceitas(){
        return receitaRepository.findAll();
    };

    @PostMapping("/receitas")
    public Receita criaReceita(@RequestBody Receita receita) {
        return receitaRepository.save(receita);
    }

    @GetMapping("/receitas/{id}")
    public ResponseEntity<Receita> getReceitaId(@PathVariable Long id) {
        Receita receita = receitaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Id da receita não encontrada" + id));
        return ResponseEntity.ok(receita);
    }
    @PutMapping("/receitas/{id}")
    public ResponseEntity<Receita> updateReceita(@PathVariable Long id, @RequestBody Receita receitaDetails) {
        Receita receita = receitaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Id da receita não encontrada" + id));
        receita.setNomePaciente(receitaDetails.getNomePaciente());
        receita.setNomeMedico(receitaDetails.getNomeMedico());
        receita.setCrmMedico(receitaDetails.getCrmMedico());
        receita.setMedicamento(receitaDetails.getMedicamento());
        receita.setQuantidadeMedicamento(receitaDetails.getQuantidadeMedicamento());
        receita.setCodigoMinisterioSaudeMedicamento(receitaDetails.getCodigoMinisterioSaudeMedicamento());
        Receita updateReceita = receitaRepository.save(receita);
        return ResponseEntity.ok(updateReceita);
    }

}
