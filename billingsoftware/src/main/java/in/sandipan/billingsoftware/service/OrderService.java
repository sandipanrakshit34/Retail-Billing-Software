package in.sandipan.billingsoftware.service;

import org.springframework.data.domain.Pageable;

import in.sandipan.billingsoftware.io.OrderRequest;
import in.sandipan.billingsoftware.io.OrderResponse;
import in.sandipan.billingsoftware.io.PaymentVerificationRequest;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
