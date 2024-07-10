package beans;

import java.io.Serializable;

/**
 * Learn Java Beans
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 */
public class IDE implements Serializable {

    private String nameIde;
    private String versionIde;
    private String themeIde;

    public IDE() {
    }

    public String getNameIde() {
        return nameIde;
    }

    public void setNameIde(String nameIde) {
        this.nameIde = nameIde;
    }

    public String getVersionIde() {
        return versionIde;
    }

    public void setVersionIde(String versionIde) {
        this.versionIde = versionIde;
    }

    public String getThemeIde() {
        return themeIde;
    }

    public void setThemeIde(String themeIde) {
        this.themeIde = themeIde;
    }

    @Override
    public String toString() {
        return "IDE{" +
                "nameIde='" + nameIde + '\'' +
                ", versionIde='" + versionIde + '\'' +
                ", themeIde='" + themeIde + '\'' +
                '}';
    }
}
