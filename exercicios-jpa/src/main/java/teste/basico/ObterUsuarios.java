package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		
		// Consulta com tipo, retorna um Usuario
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		
		// Especificar quantos resultados no maximo vc quer obter
		query.setMaxResults(5);
		
		List<Usuario> usuarios = query.getResultList();
		
		// Fazer a consulta em apenas uma linha
//		List<Usuario> usuarios = em
//				.createQuery("select u from Usuario u", Usuario.class)
//				.setMaxResults(5)
//				.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() 
				+ ", E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}
}
