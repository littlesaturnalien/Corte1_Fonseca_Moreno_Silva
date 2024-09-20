package interfaces;

public interface Exam {
    boolean store(Object object);
    Object findByID(String id); // Asegúrate de que el tipo de retorno sea Object para ser genérico
    void findByName(String name);
}
