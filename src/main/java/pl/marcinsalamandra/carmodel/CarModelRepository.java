package pl.marcinsalamandra.carmodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long> {
    Optional<CarModel> findByModelName(String modelName);

    @Query("SELECT cm " +
            "FROM CarModel cm " +
            "WHERE cm.carBrand.brandName = ?1 "
    )
    List<CarModel> findAllByBrandName(String brandName);
}
