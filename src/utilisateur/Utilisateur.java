package utilisateur;

public abstract class Utilisateur {
    String id;
    String prénom;
    String nom;
    String email;
    String téléphone;
    String genre;

    public Utilisateur(String id, String prénom, String nom, String email, String téléphone, String genre) {
        this.id = id;
        this.prénom = prénom;
        this.nom = nom;
        this.email = email;
        this.téléphone = téléphone;
        this.genre = genre;
    }
}