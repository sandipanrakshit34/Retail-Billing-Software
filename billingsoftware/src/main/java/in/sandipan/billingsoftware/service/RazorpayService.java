package in.sandipan.billingsoftware.service;

import com.razorpay.RazorpayException;

import in.sandipan.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
