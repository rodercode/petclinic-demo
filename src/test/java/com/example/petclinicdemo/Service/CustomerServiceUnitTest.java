package com.example.petclinicdemo.Service;

import com.example.petclinicdemo.model.Customer;
import com.example.petclinicdemo.repository.CustomerRepository;
import jakarta.persistence.Column;
import jakarta.persistence.EntityNotFoundException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class CustomerServiceUnitTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    private Customer customer;

    @BeforeEach
    public void setup(){
        customer = Customer.builder()
                .name("John")
                .adress("Stockholms vägen 1")
                .city("Stockholm")
                .phone_number("0701234567")
                .pet("Dog")
                .build();
    }

    @Test
    public void Should_ReturnCustomer_WhenSaveCustomer(){
        // Arrange
        given(customerRepository.save(customer)).willReturn(customer);

        // Act
        Customer savedCustomer = customerService.save(customer);

        // Assert
        Assertions.assertThat(savedCustomer).isNotNull();
        verify(customerRepository, times(1)).save(customer);
        verifyNoMoreInteractions(customerRepository);
    }
}