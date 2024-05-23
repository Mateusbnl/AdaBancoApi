package ada.banco.api.repository;

import ada.banco.api.entity.usuario.UsuarioBase;
import ada.banco.api.entity.usuario.UsuarioPF;
import ada.banco.api.entity.usuario.UsuarioPJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioBase, String> {
    @Query("select c from UsuarioPF c")
    List<UsuarioPF> findAllPF();

    @Query("select c from UsuarioPJ c")
    List<UsuarioPJ> findAllPJ();
}
