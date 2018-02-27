/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classbuilder;

/**
 *
 * @author Abed Bilani
 */
public class Data {

    private final String _id;
    private final String _prenom;
    private final String _nom;
    private final String _mail;

    private String _telephone;
    private String _rue;
    private String _ville;
    private String _etat;
    private String _code;
    private String _pays;

    public Data(ClassBuilder classBuilder) {
        _id = classBuilder._id;
        _prenom = classBuilder._prenom;
        _nom = classBuilder._nom;
        _mail = classBuilder._mail;

    }

    public String getId() {
        return _id;
    }

    public String getPrenom() {
        return _prenom;
    }

    public String getNom() {
        return _nom;
    }

    public String getMail() {
        return _mail;
    }

    /**
     * @return _telephone
     */
    public String getTelephone() {
        return _telephone;
    }

    /**
     * @param _telephone the _telephone to set
     */
    public void setTelephone(String _telephone) {
        this._telephone = _telephone;
    }

    /**
     * @return _telephone
     */
    public String getRue() {
        return _rue;
    }

    /**
     * @param _rue the _rue to set
     */
    public void setRue(String _rue) {
        this._rue = _rue;
    }

    /**
     * @return _telephone
     */
    public String getVille() {
        return _ville;
    }

    /**
     * @param _ville the _ville to set
     */
    public void setVille(String _ville) {
        this._ville = _ville;
    }

    /**
     * @return _telephone
     */
    public String getEtat() {
        return _etat;
    }

    /**
     * @param _etat the _etat to set
     */
    public void setEtat(String _etat) {
        this._etat = _etat;
    }

    /**
     * @return _telephone
     */
    public String getCode() {
        return _code;
    }

    /**
     * @param _code the _code to set
     */
    public void setCode(String _code) {
        this._code = _code;
    }

    /**
     * @return _telephone
     */
    public String getPays() {
        return _pays;
    }

    /**
     * @param _pays the _pays to set
     */
    public void setPays(String _pays) {
        this._pays = _pays;
    }

    public static class ClassBuilder {

        String _id;
        String _prenom;
        String _nom;
        String _mail;

        String _telephone;
        String _rue;
        String _ville;
        String _etat;
        String _code;
        String _pays;

        /**
         * Constructeur minimal du pattern Builder est la Liste des attributs
         * obligatoires
         *
         * @param id
         * @param prenom
         * @param nom
         * @param mail
         */
        public ClassBuilder(String id, String prenom, String nom, String mail) {
            _id = id;
            _prenom = prenom;
            _nom = nom;
            _mail = mail;
        }

        public ClassBuilder telephone(String telephone) {
            _telephone = telephone;
            return this;
        }

        public ClassBuilder rue(String rue) {
            _rue = rue;
            return this;
        }

        public ClassBuilder ville(String ville) {
            _ville = ville;
            return this;
        }

        public ClassBuilder etat(String etat) {
            _etat = etat;
            return this;
        }

        public ClassBuilder code(String code) {
            _code = code;
            return this;
        }

        public ClassBuilder pays(String pays) {
            _pays = pays;
            return this;
        }

        public Data build() {
            return new Data(this);
        }

    }
}
