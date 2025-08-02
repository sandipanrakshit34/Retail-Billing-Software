package in.sandipan.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sandipan.billingsoftware.entity.OrderItemEntity;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {
}
