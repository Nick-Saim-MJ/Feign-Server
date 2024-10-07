package com.example.mspedido.service.impl;

import com.example.mspedido.entity.Order;
<<<<<<< HEAD
import com.example.mspedido.feign.ClientFeign;
=======
import com.example.mspedido.entity.OrderDetail;
>>>>>>> 2babafd24013e70a61e6ca664d6ec673e8cdf180
import com.example.mspedido.feign.ProductFeign;
import com.example.mspedido.repository.OrderRepository;
import com.example.mspedido.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductFeign productFeign;
<<<<<<< HEAD
    @Autowired
    private ClientFeign clientFeign;
=======
>>>>>>> 2babafd24013e70a61e6ca664d6ec673e8cdf180

    @Override
    public List<Order> list() {
        return orderRepository.findAll();
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Optional<Order> findById(Integer id) {
        Optional<Order> order = orderRepository.findById(id);
<<<<<<< HEAD
        order.get().setClientDto(clientFeign.getById(order.get().getClientId()).getBody());
        /*for (OrderDetail orderDetail : order.get().getOrderDetails()) {
            orderDetail.setProductDto(productFeign.getById(orderDetail.getProductId()).getBody());
        }*/
        /*order.get().getOrderDetails().stream().forEach(orderDetail -> {
            orderDetail.setProductDto(productFeign.getById(orderDetail.getProductId()).getBody());
        });*/
        order.get().getOrderDetails().forEach(orderDetail -> {
            orderDetail.setProductDto(productFeign.getById(orderDetail.getProductId()).getBody());
        });
        return order;
=======
        for (OrderDetail orderDetail : order.get().getOrderDetails()) {
            orderDetail.setProductDto(productFeign.getById(orderDetail.getProductId()).getBody());
        }
        return orderRepository.findById(id);
>>>>>>> 2babafd24013e70a61e6ca664d6ec673e8cdf180
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }
}
