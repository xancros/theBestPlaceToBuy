package dataAccessObject;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductDao extends JpaRepository<Product,Long> {

    /*public int insert(Product p);

    public int moddify(Product p);

    public int insert(List<Product> list);

    public int remove(Product p);

    public Optional<Product> findById(Long id);

    public List<Product> getAllProducts();

    public List<Product> findProductsByCategory(int category);
*/
}
