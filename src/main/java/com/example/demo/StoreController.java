package com.example.demo; // Keep your package name

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class StoreController {

    private Map<String, Coupon> coupons = new HashMap<>();
    private List<Product> products = new ArrayList<>();

    // 1. Create a Coupon
    @PostMapping("/coupons")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        coupons.put(coupon.getCode(), coupon);
        return coupon;
    }

    // 2. Get a Coupon by Code
    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable String code) {
        return coupons.get(code);
    }

    // 3. Create a Product (applies discount if couponCode matches)
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        if (product.getCouponCode() != null && coupons.containsKey(product.getCouponCode())) {
            double discount = coupons.get(product.getCouponCode()).getDiscount();
            double finalPrice = product.getPrice() - (product.getPrice() * discount / 100);
            product.setPrice(finalPrice);
        }
        products.add(product);
        return product;
    }

    // 4. List all Products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return products;
    }
}
