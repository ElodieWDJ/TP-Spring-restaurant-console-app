import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.dao.PlatDaoMemoire;
import dev.entite.Plat;

public class PlatDaoMemoireTest {
	
	private PlatDaoMemoire platDaoMemoire;
	
	
	@BeforeEach
	public void init() {
		this.platDaoMemoire = new PlatDaoMemoire();
	}
	
	@BeforeEach
	void setUp() {
	this.platDaoMemoire = new PlatDaoMemoire();
	}
	
	@Test
	void listerPlatsVideALInitialisation() {
		// invoquer la méthode à tester
		List<Plat> resultat = platDaoMemoire.listerPlats();
	
	        assertThat(resultat).isEmpty();;
	}
	
	
	@Test
	void ajouterPlatCasPassants() {
		List<Plat> resultat = platDaoMemoire.listerPlats();
		 assertThat(resultat.size()).isEqualTo(0);
	        assertThat(resultat).isEmpty();;
	        
	}
}
