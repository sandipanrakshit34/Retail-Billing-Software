package in.sandipan.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sandipan.billingsoftware.entity.CategoryEntity;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByCategoryId(String categoryId);
}
