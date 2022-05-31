package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		
		/* Responsável por tirar o objeto do estado gerenciado, 
		 * só será alterado se vc colocar explicitamente o 
		 * comando merge
		 */
		em.detach(usuario);
		
		usuario.setNome("Leonardo");
				
		/* Merge é responsável por pegar um usuario que ja esta
		 * no banco, e fazer a alteração (update)
		 */
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
