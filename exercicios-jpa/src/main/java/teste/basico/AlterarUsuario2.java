package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Objeto gerenciado - nao precisa do comando merge
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo Leitao");
		
		em.getTransaction().begin();
		/* Merge é responsável por pegar um usuario que ja esta
		 * no banco, e fazer a alteração (update)
		 */
		// em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
