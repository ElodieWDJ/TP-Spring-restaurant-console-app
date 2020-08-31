package dev.ihm.options;

public interface IOptionMenu {
	default int getPoids() {
		return 50;
	}
    String getTitre();

    void executer();
}
