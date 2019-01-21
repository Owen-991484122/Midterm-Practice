package students;

/**
 *
 * @author oicr1
 */
public class Student {

    public String name;
    private int id;
    
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student's name is: " + name + "\nStudent's ID is: " + id;
    }
}
