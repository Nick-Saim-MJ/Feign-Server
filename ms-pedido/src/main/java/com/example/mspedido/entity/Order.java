package com.example.mspedido.entity;

<<<<<<< HEAD
import com.example.mspedido.dto.ClientDto;
=======
import com.example.mspedido.dto.ProductDto;
>>>>>>> 2babafd24013e70a61e6ca664d6ec673e8cdf180
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Integer ClientId;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderDetail> orderDetails;
<<<<<<< HEAD
    @Transient
    private ClientDto clientDto;
=======

>>>>>>> 2babafd24013e70a61e6ca664d6ec673e8cdf180
}
