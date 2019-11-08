
package Models;

/**
 *
 * @author Your Name <Jose Javier Cueto Mejia>
 */
public class providersModel {
    
    private int id;
    private String name;

    public providersModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    
    
}
