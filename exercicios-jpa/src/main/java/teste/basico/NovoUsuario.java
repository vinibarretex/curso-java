package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		// Responsável por criar o EntityManager
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		
		// Entity Manager é quem faz a interação com o banco de dados
		EntityManager em = emf.createEntityManager();
		
		// Criação do novo usuário
		Usuario novoUsuario = new Usuario("Teste", "teste@email.com");
		
		em.getTransaction().begin();
		// Persistir (inserir o usuario) no banco
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println("O ID gerado foi: " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}
}
