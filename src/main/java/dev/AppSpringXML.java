/**
 * 
 */
package dev;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.ihm.Menu;

/**
 * @author perse
 *
 */
public class AppSpringXML {

	public static void main(String[] args) {

		// Création du contexte Spring
		// try with ressources
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"application-config-memoire.xml")) {// implémente AutoClosable
			
			// récupération du bean Menu
			Menu menu = context.getBean(Menu.class);
			
			menu.afficher();

		}

	}

}
