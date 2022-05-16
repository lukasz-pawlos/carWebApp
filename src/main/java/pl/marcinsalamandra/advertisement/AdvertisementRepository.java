package pl.marcinsalamandra.advertisement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    Optional<Advertisement> findBySecretKey(String secretKey);

    @Modifying
    @Query("DELETE FROM " +
            "Advertisement a " +
            "WHERE a.secretKey = ?1 ")
    void deleteBySecretKey(String secretKey);

    @Query("SELECT a " +
            "FROM Advertisement a " +
            "WHERE a.price BETWEEN :priceMin AND :priceMax " +
            "AND a.car.parameters.power BETWEEN :powerMin AND :powerMax " +
            "AND a.car.parameters.vintage BETWEEN :vintageMin AND :vintageMax " +
            "AND a.car.parameters.mileage BETWEEN :mileageMin AND :mileageMax " +
            "AND a.car.carModel.modelName LIKE :modelName " +
            "AND a.car.parameters.fuel LIKE :fuel "
    )
    List<Advertisement> findByFilters(
            @Param("priceMin") Integer priceMin,
            @Param("priceMax") Integer priceMax,
            @Param("powerMin") Integer powerMin,
            @Param("powerMax") Integer powerMax,
            @Param("vintageMin") Integer vintageMin,
            @Param("vintageMax") Integer vintageMax,
            @Param("mileageMin") Integer mileageMin,
            @Param("mileageMax") Integer mileageMax,
            @Param("modelName") String modelName,
            @Param("fuel") String fuel
    );
}
