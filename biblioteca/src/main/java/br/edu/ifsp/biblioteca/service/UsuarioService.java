// br.edu.ifsp.biblioteca.service.UsuarioService
package br.edu.ifsp.biblioteca.service;

import br.edu.ifsp.biblioteca.model.CategoriaUsuario;
import br.edu.ifsp.biblioteca.model.Curso;
import br.edu.ifsp.biblioteca.model.Usuario;
import br.edu.ifsp.biblioteca.model.Usuario.StatusUsuario;
import br.edu.ifsp.biblioteca.repository.CategoriaUsuarioRepository;
import br.edu.ifsp.biblioteca.repository.CursoRepository;
import br.edu.ifsp.biblioteca.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository usuarioReporitory;
    private final CategoriaUsuarioRepository categoriaReporitory;
    private final CursoRepository cursoReporitory;

    public UsuarioService(UsuarioRepository usuarioRepository, CategoriaUsuarioRepository categoriaRepository, CursoRepository cursoReporitory) {
        this.usuarioReporitory = usuarioRepository;
        this.categoriaReporitory = categoriaRepository;
        this.cursoReporitory = cursoReporitory;
    }

    public Usuario criar(String nomeUsuario, String cpf, String email, Integer categoriaId, Integer cursoId) {
        validarCpfFormato(cpf);

        if (usuarioReporitory.existsByCpf(cpf)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "CPF já cadastrado");
        }

        CategoriaUsuario cat = categoriaReporitory.findById(categoriaId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CategoriaUsuario não encontrada"));

        Curso curso = cursoReporitory.findById(cursoId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Curso não encontrado"));

        Usuario u = new Usuario();
        u.setNomeUsuario(nomeUsuario);
        u.setCpf(cpf);
        u.setEmail(email);
        u.setCategoria(cat);
        u.setCurso(curso);
        u.setStatus(StatusUsuario.ATIVO); // por padrão

        return usuarioReporitory.save(u);
    }

    private void validarCpfFormato(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF deve conter 11 dígitos numéricos");
        }
    }
}
