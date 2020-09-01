package dev.service;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import dev.dao.IPlatDao;
import dev.exception.PlatException;

public class PlatServiceVersion1Test {

	private IPlatDao dao;
	private PlatServiceVersion1 plat;

	@BeforeEach
	public void setUp() {
        
        dao = Mockito.mock(IPlatDao.class);
        plat = new PlatServiceVersion1(dao);
	}

    @Test
    public void testAjouterPlatNomInvalide() throws PlatException {
	assertThrows(PlatException.class,()->plat.ajouterPlat("Lasagnes", 250));
	}

	@Test
	public void ajouterPlatPrixInvalide() throws PlatException {
	assertThrows(PlatException.class,()->plat.ajouterPlat("Tartare", 500));
	}

	@Test
	public void methodeInvoquee () {
	plat.ajouterPlat("Tartare", 50);
	verify(dao, atLeastOnce()).ajouterPlat("Tartare", 500);
	}
}
