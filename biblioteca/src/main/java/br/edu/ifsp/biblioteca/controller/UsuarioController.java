// br.edu.ifsp.biblioteca.controller.UsuarioController
package br.edu.ifsp.biblioteca.controller;

import br.edu.ifsp.biblioteca.model.Usuario;
import br.edu.ifsp.biblioteca.service.UsuarioService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/library/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    // DTO de entrada
    public record UsuarioCreateDTO(
            @NotBlank String nomeUsuario,
            @Pattern(regexp="\\d{11}") String cpf,
            @Email @NotBlank String email,
            Integer categoriaId,
            Integer cursoId
    ) {}

    @PostMapping
    public ResponseEntity<Usuario> criar(@Valid @RequestBody UsuarioCreateDTO in) {
        Usuario salvo = service.criar(in.nomeUsuario(), in.cpf(), in.email(), in.categoriaId(), in.cursoId());
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}
