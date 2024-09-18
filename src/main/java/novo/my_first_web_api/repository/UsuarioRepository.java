package novo.my_first_web_api.repository;

import novo.my_first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("List - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("dlucioyauh","password"));
        usuarios.add(new Usuario("Bocó","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("dlucioyauh","password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("dlucioyauh", "password");
    }
}
